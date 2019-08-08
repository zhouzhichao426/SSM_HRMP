package com.oasis.mvc.service.impl;

import com.oasis.mvc.dao.pojo.User;
import com.oasis.mvc.service.iservice.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceImplTest {
    @Autowired
    UserService userService;

    @Test
    public void userExist() {
    }

    @Test
    public void registry() {
        User user = new User("haha","123");
        System.err.println(userService.registry(user));
    }

    @Test
    public void login() {
    }
}