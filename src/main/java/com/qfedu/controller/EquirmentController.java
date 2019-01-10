package com.qfedu.controller;

import com.qfedu.service.EquirmentService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EquirmentController {
    @Autowired
    private EquirmentService service;

    @ApiOperation(value = "需要商品id和用户id")
    @RequestMapping("/addEquir.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo addEquir(Integer eqGid, Integer eqUid){
        return service.addEquirment(eqGid, eqUid);
    }

    @ApiOperation(value = "根据用户id查询属于该用户的设备")
    @RequestMapping("/selectEquir.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo selectEquir(Integer eqUid){
        return  service.selectEqByUserId(eqUid);
    }



}
