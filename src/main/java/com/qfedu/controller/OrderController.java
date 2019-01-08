package com.qfedu.controller;

import com.qfedu.service.GoodsService;
import com.qfedu.service.OrderService;
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
public class OrderController {


    @Autowired
    OrderService service;

    @ApiOperation(value = "根据用户ID查询指定用户的全部订单")
    @RequestMapping("/selectAllGoodsByUserId.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo selectAllGoodsByUserId(@ApiParam("用户的ID") Long userId){

        return  ResultVo.setOK(service.selectAllGoodsByUserId(userId));
    }
    @ApiOperation(value = "根据用户ID和订单状态查询指定用户的订单")
    @RequestMapping("/selectAllGoodsByUserIdAndGoodsType.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo selectAllGoodsByUserIdAndGoodsType(@ApiParam("用户的ID") Long userId,@ApiParam("订单的状态") Integer state){

        return  ResultVo.setOK(service.selectAllGoodsByUserIdAndGoodsType(userId,state));
    }

}
