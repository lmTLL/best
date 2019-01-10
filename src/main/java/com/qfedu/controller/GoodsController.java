package com.qfedu.controller;

import com.qfedu.service.GoodsService;
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
public class GoodsController {

    @Autowired
    GoodsService service;

    @ApiOperation(value = "根据商品类型的ID查询热度比较高的三个商品")
    @RequestMapping("/HotGoodsByTypeId.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo selectHotGoods(@ApiParam("商品类型的ID，Int类型") Integer TypeId){
       return ResultVo.setOK(service.selectHotGoodsByTypeId(TypeId));
    }

    @ApiOperation(value = "根据商品ID查询指定商品")
    @RequestMapping("/SelectGoodsByGoodsId.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo SelectGoodsByGoodsId(@ApiParam("商品的ID，Int类型") Long GoodsId){
       return ResultVo.setOK(service.selectGoodsByGoodsId(GoodsId));
    }

    @ApiOperation(value = "查询所有商品，不限类型")
    @RequestMapping("/selectAllGoods.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo selectAllGoods(){
       return ResultVo.setOK(service.selectAllGoods());
    }


    @ApiOperation(value = "根据商品名查找商品")
    @RequestMapping("/selectByGoodsName.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo selectByGoodsName(String goodsName){
        return  service.selectByGoodsName(goodsName);
    }


}
