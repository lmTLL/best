package com.qfedu.controller;

import com.qfedu.service.GoodsService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GoodsController {

    @Autowired
    GoodsService service;

    @RequestMapping("/HotGoodsByTypeId.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo selectHotGoods(Integer TypeId){
       return ResultVo.setOK(service.selectHotGoodsByTypeId(TypeId));
    }

    @RequestMapping("/SelectGoodsByGoodsId.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo SelectGoodsByGoodsId(Long GoodsId){
       return ResultVo.setOK(service.selectGoodsByGoodsId(GoodsId));
    }

    @RequestMapping("/selectAllGoods.do")
    @ResponseBody
    @CrossOrigin
    public ResultVo selectAllGoods(){
       return ResultVo.setOK(service.selectAllGoods());
    }


}
