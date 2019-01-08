package com.qfedu.controller;

import com.qfedu.service.GoodsTypeService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(produces = "商品接口文档",value = "接口文档")
@Controller
public class GoodsTypeController {

    @Autowired
    GoodsTypeService service;

    @ApiOperation(value = "查询所有的商品类型，外层为一级分类，集合中为二级分类")
    @RequestMapping("/GoodsTypeAll.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo selectAllGoodsType(){

        return  ResultVo.setOK(service.selectAllGoodsType());
    }
}
