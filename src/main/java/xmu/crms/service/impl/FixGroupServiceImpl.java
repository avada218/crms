package xmu.crms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmu.crms.dao.FixGroupDao;
import xmu.crms.entity.*;
import xmu.crms.exception.*;
import xmu.crms.service.FixGroupService;
import xmu.crms.service.SeminarGroupService;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: guiyu
 * @Description:
 * @Data: Created in 2017/12/21
 */
@Service
public class FixGroupServiceImpl implements FixGroupService {
    @Autowired
    private FixGroupDao fixGroupDao;

    @Autowired
    private SeminarGroupService seminarGroupService;

    @Override
    public BigInteger insertFixGroupByClassId(BigInteger classId, BigInteger userId) throws
            IllegalArgumentException,ClassesNotFoundException,UserNotFoundException {
        if (classId.intValue() <= 0 || userId.intValue() <= 0) {
            throw new IllegalArgumentException();
        }else{
            BigInteger addRow = fixGroupDao.insertFixGroupByClassId(classId,userId);
            return addRow;
        }

    }

    @Override
    public void deleteFixGroupMemberByFixGroupId(BigInteger fixGroupId) throws IllegalArgumentException, FixGroupNotFoundException {
        if(fixGroupId.intValue()<=0){
            throw new IllegalArgumentException();
        }else{
            fixGroupDao.deleteFixGroupMemberByFixGroupId(fixGroupId);
        }
    }

    @Override
    public BigInteger insertFixGroupMemberById(BigInteger userId, BigInteger groupId) throws IllegalArgumentException, FixGroupNotFoundException, UserNotFoundException, InvalidOperationException {
        if (userId.intValue() <= 0 || groupId.intValue() <= 0) {
            throw new IllegalArgumentException();
        } else {
            BigInteger addRow = fixGroupDao.insertFixGroupMemberById(userId, groupId);
            return addRow;
        }
    }

    @Override
    public List<User> listFixGroupMemberByGroupId(BigInteger groupId) throws IllegalArgumentException, FixGroupNotFoundException {
        if (groupId.intValue() <= 0) {
            throw new IllegalArgumentException();
        } else {
            List<User> users = fixGroupDao.listFixGroupMemberByGroupId(groupId);
            return users;
        }
    }

    @Override
    public List<FixGroup> listFixGroupByClassId(BigInteger classId) throws IllegalArgumentException {
        if (classId.intValue() <= 0) {
            throw new IllegalArgumentException();
        } else {
            List<FixGroup> fixGroups = fixGroupDao.listFixGroupByClassId(classId);
            return fixGroups;
        }
    }

    @Override
    public void deleteFixGroupByClassId(BigInteger classId) throws IllegalArgumentException, ClassesNotFoundException {
        if (classId.intValue() <= 0) {
            throw new IllegalArgumentException();
        } else {
            fixGroupDao.deleteFixGroupByClassId(classId);
        }
    }

    @Override
    public void deleteFixGroupByGroupId(BigInteger groupId) throws IllegalArgumentException, FixGroupNotFoundException {
        if (groupId.intValue() <= 0) {
            throw new IllegalArgumentException();
        } else {
            fixGroupDao.deleteFixGroupByGroupId(groupId);
        }
    }

    @Override
    public void updateFixGroupByGroupId(BigInteger groupId, FixGroup fixGroupBO) throws IllegalArgumentException, FixGroupNotFoundException {
        if (groupId.intValue() <= 0) {
            throw new IllegalArgumentException();
        } else {
            fixGroupDao.updateFixGroupByGroupId(groupId, fixGroupBO);
        }
    }

    @Override
    public BigInteger insertStudentIntoGroup(BigInteger userId, BigInteger groupId) throws IllegalArgumentException, FixGroupNotFoundException, UserNotFoundException, InvalidOperationException {
        if (userId.intValue() <= 0 || groupId.intValue() <= 0) {
            throw new IllegalArgumentException();
        } else {
            BigInteger addRow = fixGroupDao.insertStudnetIntoGroup(userId, groupId);
            return addRow;
        }
    }

    @Override
    public FixGroup getFixedGroupById(BigInteger userId, BigInteger classId) throws IllegalArgumentException, ClassesNotFoundException, UserNotFoundException {
        if (userId.intValue() <= 0 || classId.intValue() <= 0) {
            throw new IllegalArgumentException();
        } else {
            FixGroup fixGroup = fixGroupDao.getFixedGroupById(userId, classId);
            return fixGroup;
        }
    }

    @Override
    public void updateSeminarGroupById(BigInteger groupId, SeminarGroup group) throws IllegalArgumentException, FixGroupNotFoundException {
        if (groupId.intValue() <= 0) {
            throw new IllegalArgumentException();
        } else {
            fixGroupDao.updateSeminarGroupById(groupId, group);
        }
    }

    @Override
    public void deleteFixGroupUserById(BigInteger fixGroupId, BigInteger userId) throws IllegalArgumentException, FixGroupNotFoundException, UserNotFoundException {
        if (fixGroupId.intValue() <= 0) {
            throw new IllegalArgumentException("fixGroupId");
        }
        if (userId.intValue() <= 0) {
            throw new IllegalArgumentException("userId");
        }
        fixGroupDao.getFixGroupByGroupId(fixGroupId);
    }

    @Override
    public List<FixGroupMember> listFixGroupByGroupId(BigInteger groupId) throws IllegalArgumentException, FixGroupNotFoundException {
        return null;
    }

    @Override
    public void fixedGroupToSeminarGroup(BigInteger semianrId, BigInteger fixedGroupId) throws IllegalArgumentException, FixGroupNotFoundException, SeminarNotFoundException {
        SeminarGroup seminarGroup = new SeminarGroup();
        Seminar seminar = new Seminar();
        seminar.setId(semianrId);
        seminarGroup.setSeminar(seminar);
        FixGroup fixGroup = fixGroupDao.getFixGroupByGroupId(fixedGroupId);
        seminarGroup.setFixGroup(fixGroup);
        seminarGroup.setClassInfo(fixGroup.getClassInfo());
        seminarGroup.setLeader(fixGroup.getLeader());
        BigInteger seminarGroupId = seminarGroupService.insertSeminarGroupBySeminarId(semianrId, seminarGroup);
        seminarGroup.setId(seminarGroupId);
        //获取该fixGroup下的所有组员
        List<User> members = listFixGroupMemberByGroupId(fixedGroupId);
        //将这些组员插入到新建的seminarGroup中
        Iterator<User> iterator = members.iterator();
        while (iterator.hasNext()) {
            User member = iterator.next();
            SeminarGroupMember seminarGroupMember = new SeminarGroupMember();
            seminarGroupMember.setSeminarGroup(seminarGroup);
            seminarGroupMember.setStudent(member);
            seminarGroupService.insertSeminarGroupMemberByGroupId(seminarGroupId, seminarGroupMember);
        }
    }
}
