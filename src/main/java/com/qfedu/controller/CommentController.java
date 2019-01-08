package com.qfedu.controller;

import com.qfedu.service.CommentService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommentController {
    @Autowired
    private CommentService service;

    @RequestMapping("selectByGoodsId.do")
    @CrossOrigin
    @ResponseBody
    public ResultVo selectByGoodsId(Integer comGid){
        return service.selectByGoodsId(comGid);
    }
}
