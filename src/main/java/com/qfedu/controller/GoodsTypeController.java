package com.qfedu.controller;

import com.qfedu.service.GoodsTypeService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GoodsTypeController {

    @Autowired
    GoodsTypeService service;

    @RequestMapping("/GoodsTypeAll.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo selectAllGoodsType(){

        return  ResultVo.setOK(service.selectAllGoodsType());
    }
}
