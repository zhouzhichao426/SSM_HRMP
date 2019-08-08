package com.oasis.mvc.service.impl;

import com.oasis.mvc.commons.Result;
import com.oasis.mvc.dao.UserDao;
import com.oasis.mvc.dao.pojo.User;
import com.oasis.mvc.service.iservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public String userExist(String username) {
        int result = userDao.userExist(username);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String registry(User user) {
        int result = userDao.insertSelective(user);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public User login(User user) {
        return userDao.login(user);
    }
}
