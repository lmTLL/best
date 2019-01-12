package com.qfedu.controller;

import com.qfedu.pojo.Logistics;
import com.qfedu.service.LogisticService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(produces="物流状态接口",value="接口文档")
@RestController
public class LogisticController {
    @Autowired
    private LogisticService lgService;

    @ApiOperation(value="查询所有物流状态")
    @RequestMapping("/findAllStatus.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo findAllGoods() {

        List<Logistics> list=lgService.findStatus();
        if(list!=null){
            return  ResultVo.setOK(list);
        }else{
            return  ResultVo.setERROR();
        }
    }
}
