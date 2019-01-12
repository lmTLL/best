package com.qfedu.service;

import com.qfedu.pojo.User;
import com.qfedu.vo.ResultVo;

public interface UserService {

    int addUser(User user);
    User findUser(String name,String password);
}
