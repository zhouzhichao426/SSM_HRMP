package com.oasis.mvc.service.iservice;

import com.oasis.mvc.dao.pojo.User;

public interface UserService {
    String userExist(String username);


    String registry(User user);

    User login(User user);
}
