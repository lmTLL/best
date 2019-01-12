package com.qfedu.controller;

import com.qfedu.service.ImpService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api
public class ImpController {
    @Autowired
    private ImpService service;

    @RequestMapping("/getAllImp.do")
    @ResponseBody
    @ApiOperation(value = "得到商品详情图片列表，需要传入商品id")
    @CrossOrigin
    public ResultVo getAllImp(Integer iGid){
        return service.getAllImp(iGid);
    }
}
