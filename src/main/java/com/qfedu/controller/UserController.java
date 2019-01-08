package com.qfedu.controller;

import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.util.Base64Util;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.shiro.subject.Subject;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

@Api(produces="登陆注册接口",value="接口文档")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value="用户注册")
    @RequestMapping("/addUser.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo addUser(@ApiParam("用户名，String类型") String name,@ApiParam("密码，String类型") String password) throws UnsupportedEncodingException {
        ResultVo ro=new ResultVo();
        User user=new User();
        byte [] msg=password.getBytes();
        String password1= Base64Util.base64Enc(msg);
        user.setUserName(name);
        user.setUserPassword(password1);
        int i=userService.addUser(user);
        ro.setCode(i);
        ro.setData(null);
        return ro;

    }

    @ApiOperation(value="用户登录")
    @RequestMapping("/userlogin.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo login(@ApiParam("用户名，String类型")String name,@ApiParam("密码，String类型")String password) {
        ResultVo ro= userService.findUser(name,password);
        if(ro.getCode()==0) {
            //Shiro完成登录认证
            //1、获取主题
            Subject subject= SecurityUtils.getSubject();
            //2、设置登录的Token
            UsernamePasswordToken token=new UsernamePasswordToken(name, password);
            //3、存储数据到Session
            subject.getSession().setAttribute("user", ro.getData());
            //4、登录认证
            subject.login(token);
        }
        return ro;
    }

}
