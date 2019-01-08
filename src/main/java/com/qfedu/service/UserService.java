package com.qfedu.service;

import com.qfedu.pojo.User;
import com.qfedu.vo.ResultVo;

public interface UserService {
    //int addUser(String name,String password);
    int addUser(User user);
    ResultVo findUser(String name,String password);
}
