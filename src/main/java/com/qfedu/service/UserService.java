package com.qfedu.service;

import com.qfedu.pojo.User;

public interface UserService {

    int addUser(User user);
    User userlogin(String name, String password);
}
