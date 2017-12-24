package xmu.crms.service.impl;

import org.springframework.stereotype.Service;
import xmu.crms.entity.User;
import xmu.crms.exception.UserNotFoundException;
import xmu.crms.service.LoginService;

import java.math.BigInteger;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public User signInWeChat(BigInteger userId, String code, String state, String successUrl) throws UserNotFoundException {
        return null;
    }

    @Override
    public User signInPhone(User user) throws UserNotFoundException {
        return null;
    }

    @Override
    public User signUpPhone(User user) {
        return null;
    }

    @Override
    public void deleteTeacherAccount(BigInteger userId) throws IllegalArgumentException, UserNotFoundException {

    }

    @Override
    public void deleteStudentAccount(BigInteger userId) throws IllegalArgumentException, UserNotFoundException {

    }
}
