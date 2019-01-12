package com.qfedu.controller;

import com.qfedu.pojo.FaultType;
import com.qfedu.service.FaultTypeService;
import com.qfedu.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@Api(produces = "故障类型接口文档",value = "接口文档")
@RestController
public class FaultTypeController {

        @Autowired
        private FaultTypeService ftService;

        @ApiOperation(value="故障类型列表")
        @RequestMapping("/findAllFaultType.do")
        @CrossOrigin
        public ResultVo findAllFaultType() {
            List<FaultType> list=ftService.findAllType();
            if(list!=null){
             return   ResultVo.setOK(list);
            }else{
                return ResultVo.setERROR();
            }
        }

        }
