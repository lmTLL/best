package com.qfedu.controller;

import com.google.common.base.Objects;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.util.Base64Util;
import com.qfedu.util.Message;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.apache.shiro.subject.Subject;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;

@Api(produces="登陆注册接口",value="接口文档")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    private String code = "";

    @ApiOperation(value="用户注册")
    @RequestMapping("/addUser.do")
    @CrossOrigin
    public ResultVo addUser(@ApiParam("用户名，String类型") String name,@ApiParam("密码，String类型") String password) throws UnsupportedEncodingException {
       User user = new User();
       user.setUserName(name);
       user.setUserPassword(password);
        return ResultVo.setOK(userService.addUser(user));

    }

    @ApiOperation(value="用户登录")
    @RequestMapping("/userlogin.do")
    @CrossOrigin
    public ResultVo login(@ApiParam("用户名，String类型")String name,@ApiParam("密码，String类型")String password) {
        User user = userService.findUser(name,password);
        System.out.println(user);
        if(user != null) {
            //Shiro完成登录认证
            //1、获取主题
            Subject subject= SecurityUtils.getSubject();
            //2、设置登录的Token
            UsernamePasswordToken token=new UsernamePasswordToken(name, password);
            //3、存储数据到Session
            subject.getSession().setAttribute(user.getUserName() , user);
            //4、登录认证
            subject.login(token);
            return  ResultVo.setOK(user.getUserId());
        } else {
            return ResultVo.setERROR();
        }
    }

    @ApiOperation(value="得到用户")
    @GetMapping("getUserId.do")
    @CrossOrigin
    public ResultVo getUserId() {
        Subject subject = SecurityUtils.getSubject();
        Collection<Object> keys = subject.getSession().getAttributeKeys();
        User user = new User();
        if (!keys.isEmpty() && keys.size() != 0) {
            for (Object key : keys) {
                User user2 = (User) subject.getSession().getAttribute(key);
                user.setUserId(user2.getUserId());
                user.setUserName(user2.getUserName());
                return ResultVo.setOK(user);
            }
        }
        return ResultVo.setERROR();
    }

    @ApiOperation(value="获取短信验证码")
    @GetMapping("GetMessage.do")
    @CrossOrigin
    public ResultVo GetMessage(@Param("手机号") String phone) throws Exception {
        code = Message.getCode();
        boolean type = Message.sendCode(phone, code);
        return ResultVo.setOK(type);
    }

    @ApiOperation(value="验证验证码是否正确")
    @GetMapping("GetMessageIsItRight.do")
    @CrossOrigin
    public ResultVo GetMessageIsItRight(@Param("传来的验证码") String message) {
        if (Objects.equal(message,code)){
            return ResultVo.setOK(1);
        }
        return ResultVo.setERROR();
    }


}
