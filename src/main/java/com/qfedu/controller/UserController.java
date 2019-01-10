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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.shiro.subject.Subject;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;

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
       User user = new User();
       user.setUserName(name);
       user.setUserPassword(password);
        return ResultVo.setOK(userService.addUser(user));

    }

    @ApiOperation(value="用户登录")
    @RequestMapping("/userlogin.do")
    @ResponseBody
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
    @ResponseBody
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


}
