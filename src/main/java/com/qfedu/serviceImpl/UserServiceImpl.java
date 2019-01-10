package com.qfedu.serviceImpl;

import com.qfedu.dao.UserMapper;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.util.EncryptUtil;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userDao;

    @Override
    public int addUser(User user) {

       // return userDao.adduser(user);
        return userDao.insertSelective(user);
    }


    @Override
    public ResultVo findUser(String name,String password) {
        User user=userDao.userlogin(name);
        if(user!=null){
            if(Objects.equals(user.getUserPassword(), EncryptUtil.md5Enc(password))){
                return ResultVo.setOK(user);
            }
        }
        return ResultVo.setERROR();
    }
}
