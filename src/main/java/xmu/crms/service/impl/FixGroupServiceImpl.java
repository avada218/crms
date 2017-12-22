package xmu.crms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmu.crms.dao.FixGroupDao;
import xmu.crms.entity.FixGroup;
import xmu.crms.entity.FixGroupMember;
import xmu.crms.entity.SeminarGroup;
import xmu.crms.entity.User;
import xmu.crms.exception.*;
import xmu.crms.service.FixGroupService;

import java.math.BigInteger;
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

    @Override
    public BigInteger insertFixGroupByClassId(BigInteger classId, BigInteger userId) throws IllegalArgumentException, ClassesNotFoundException {
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
    public List<FixGroupMember> getFixGroupByGroupId(BigInteger groupId) throws IllegalArgumentException, FixGroupNotFoundException {
        return null;
    }

//    @Override
//    public FixGroup getFixGroupByGroupId(BigInteger groupId) throws InfoIllegalException, FixGroupNotFoundException {
//        if (groupId.intValue() <= 0) {
//            throw new InfoIllegalException();
//        } else {
//            FixGroup fixGroup = fixGroupDao.getFixGroupByGroupId(groupId);
//            return fixGroup;
//        }
//    }

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
    public void deleteTopicByGroupId(BigInteger groupId) throws IllegalArgumentException, FixGroupNotFoundException {
        if (groupId.intValue() <= 0) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public FixGroup getFixedGroupById(BigInteger userId, BigInteger classId)
            throws IllegalArgumentException, ClassesNotFoundException, UserNotFoundException {
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
    public void fixedGroupToSeminarGroup(BigInteger semianrId, BigInteger fixedGroupId) {

    }

    @Override
    public void deleteFixGroupUserById(BigInteger fixGroupId, BigInteger userId)
            throws InfoIllegalException, FixGroupNotFoundException, UserNotFoundException {

    }
}
