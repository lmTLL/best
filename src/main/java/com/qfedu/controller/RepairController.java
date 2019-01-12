package com.qfedu.controller;

import com.qfedu.pojo.Repair;
import com.qfedu.service.RepairService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Api(produces = "维修接口文档",value = "接口文档")
@RestController
public class RepairController {
    @Autowired
    private RepairService rpService;

    @ApiOperation(value="添加维修产品")
    @RequestMapping("/addRepair.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo addRepair(@ApiParam("维修产品名")String goodsname,@ApiParam("故障类型")String faulttype,@ApiParam("期望服务时间")String servicetime,@ApiParam("服务地址")String address,@ApiParam("产品型号或机身条码")String type,@ApiParam("备注信息")String info) {
        Repair repair=new Repair();

        repair.setGoodsname(goodsname);
        repair.setFaulttype(faulttype);
        CustomerDateConvert cd=new CustomerDateConvert();
        Date stime= null;
        try {
            stime = cd.convert(servicetime);
            repair.setStime(stime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        repair.setAddress(address);
        repair.setType(type);
        repair.setInfo(info);
        int i=rpService.addRepair(repair);
        if(i>0){
            return ResultVo.setOK(1);
        }else{
            return ResultVo.setERROR();
        }

    }
}
