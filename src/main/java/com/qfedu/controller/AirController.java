package com.qfedu.controller;

import com.qfedu.service.AirService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AirController {
    @Autowired
    private AirService service;

    @ApiOperation(value = "找到所用空调数据")
    @RequestMapping("/selectAllAir.do")
    @ResponseBody
    @CrossOrigin
    private ResultVo selectAll(){
        return service.selectAll();
    }

    @ApiOperation(value = "修改温度")
    @RequestMapping("/updateTem.do")
    @ResponseBody
    @CrossOrigin
    private ResultVo updateTem(Integer airTem){
        return service.UpdateTem(airTem);
    }

    @ApiOperation(value = "修改风速")
    @RequestMapping("/updateWsp.do")
    @ResponseBody
    @CrossOrigin
    private ResultVo updateWsp(Integer airWsp){
        return service.UpdateWsp(airWsp);
    }

    @ApiOperation(value = "修改风向")
    @RequestMapping("/updateWdir.do")
    @ResponseBody
    @CrossOrigin
    private  ResultVo updateWdir(Integer airWdir){
        return service.UpdateWdir(airWdir);
    }

}
