package com.qfedu.controller;

import com.qfedu.service.CarService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "购物车相关接口")
@RestController
public class CarController {

    @Autowired
    private CarService service;
    @ApiOperation(value="得到一个用户所有购物车信息传入用户id")
    @RequestMapping("/getAllCar.do")
    @CrossOrigin
    public ResultVo getAllCar(Long carUid){
        return service.getAllCar(carUid);

    }

    @ApiOperation(value="添加一条购物车信息传入用户id,商品数量,商品id")
    @RequestMapping("/addCar.do")
    @CrossOrigin
    public ResultVo addCar(Long carUid, Long carGcount, Long carGid){
        return service.addCar(carUid,carGcount,carUid);
    }

    @ApiOperation(value="回收该用户所有购物车信息，在完成订单提交时使用，传入用户id")
    @RequestMapping("/updateAllCar.do")
    @CrossOrigin
    public ResultVo updateAllCar(Long carUid){
        return service.updateAllCar(carUid);
    }

    @ApiOperation(value="用于用户删除不需要的一条购物车，传入购物车id")
    @RequestMapping("/updateOneCar.do")
    @CrossOrigin
    public ResultVo updateOneCar(Long carId){
        return service.updateOneCar(carId);
    }

    @ApiOperation(value="修改商品数量")
    @RequestMapping("/updateCarcount.do")
    @CrossOrigin
    public ResultVo updateCarcount(Long carGcount, Long carId){
        return service.updateCarcount(carGcount,carId);
    }

    @ApiOperation(value="获取最大自增购物车id")
    @RequestMapping("/selectMaxId.do")
    @CrossOrigin
    public ResultVo selectMaxId(){
        return service.selectMaxId();
    }

}
