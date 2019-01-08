package com.qfedu.controller;

import com.qfedu.service.PersonService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(produces = "商品接口文档",value = "接口文档")
@Controller
public class PersonController {

    @Autowired
    PersonService service;

    @ApiOperation(value = "根据PersonID查询用户的详细信息")
    @RequestMapping("/selectPersonById.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo selectPersonById(@ApiParam("PersonId") Long person){

        return  ResultVo.setOK(service.selectPersonById(person));
    }

}
