package xmu.crms.service.impl;

import org.springframework.stereotype.Service;
import xmu.crms.entity.Seminar;
import xmu.crms.entity.SeminarGroup;
import xmu.crms.entity.SeminarGroupMember;
import xmu.crms.entity.User;
import xmu.crms.exception.*;
import xmu.crms.service.SeminarGroupService;

import java.math.BigInteger;
import java.util.List;

@Service
public class SeminarGroupServiceImpl implements SeminarGroupService {

    @Override
    public void deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId) {

    }

    @Override
    public BigInteger insertSeminarGroupMemberById(BigInteger userId, BigInteger seminarGroupId) throws IllegalArgumentException, GroupNotFoundException, UserNotFoundException, InvalidOperationException {
        return null;
    }

    @Override
    public List<User> listSeminarGroupMemberByGroupId(BigInteger seminarGroupId) throws IllegalArgumentException, GroupNotFoundException {
        return null;
    }

    @Override
    public List<SeminarGroup> listSeminarGroupIdByStudentId(BigInteger userId) throws IllegalArgumentException {
        return null;
    }

    @Override
    public BigInteger getSeminarGroupLeaderByGroupId(BigInteger seminarGroupId) throws IllegalArgumentException, GroupNotFoundException {
        return null;
    }

    @Override
    public List<SeminarGroup> listSeminarGroupBySeminarId(BigInteger seminarId) throws IllegalArgumentException, SeminarNotFoundException {
        return null;
    }

    @Override
    public void deleteSeminarGroupBySeminarId(BigInteger seminarId) throws IllegalArgumentException, SeminarNotFoundException {

    }

    @Override
    public BigInteger insertSeminarGroupBySeminarId(BigInteger seminarId, BigInteger classId, SeminarGroup seminarGroup) throws IllegalArgumentException {
        return null;
    }

    @Override
    public BigInteger insertSeminarGroupMemberByGroupId(BigInteger seminarGroupId, SeminarGroupMember seminarGroupMember) {
        return null;
    }

    @Override
    public void deleteSeminarGroupByGroupId(BigInteger seminarGroupId) throws IllegalArgumentException, GroupNotFoundException {

    }

    @Override
    public SeminarGroup getSeminarGroupByGroupId(BigInteger seminarGroupId) throws IllegalArgumentException, GroupNotFoundException {
        return null;
    }

    @Override
    public BigInteger getSeminarGroupLeaderById(BigInteger userId, BigInteger seminarId) throws IllegalArgumentException, GroupNotFoundException {
        return null;
    }

    @Override
    public void automaticallyGrouping(BigInteger seminarId, BigInteger classId) throws IllegalArgumentException, ClassesNotFoundException, SeminarNotFoundException, GroupNotFoundException, UserNotFoundException, InvalidOperationException {

    }

    @Override
    public SeminarGroup getSeminarGroupById(BigInteger seminarId, BigInteger userId) throws IllegalArgumentException, GroupNotFoundException {
        return null;
    }

    @Override
    public List<SeminarGroup> listGroupByTopicId(BigInteger topicId) throws IllegalArgumentException, GroupNotFoundException {
        return null;
    }

    @Override
    public BigInteger insertTopicByGroupId(BigInteger seminarGroupId, BigInteger topicId) throws IllegalArgumentException, GroupNotFoundException {
        return null;
    }

    @Override
    public void assignLeaderById(BigInteger seminarGroupId, BigInteger userId) throws IllegalArgumentException, UserNotFoundException, GroupNotFoundException, InvalidOperationException {

    }

    @Override
    public void resignLeaderById(BigInteger groupId, BigInteger userId) throws IllegalArgumentException, GroupNotFoundException, UserNotFoundException, InvalidOperationException {

    }
}
