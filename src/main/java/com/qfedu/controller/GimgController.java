package com.qfedu.controller;

import com.qfedu.service.GimgService;
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
public class GimgController {
    @Autowired
    private GimgService service;

    @CrossOrigin
    @RequestMapping("getAllGimg.do")
    @ApiOperation(value = "传入商品的下标得到商品详情轮播图的数据，是一个list集合需要遍历")
    @ResponseBody
    public ResultVo getAllGimg(Long imgGid){
        return service.getAllGimg(imgGid);
    }
}
