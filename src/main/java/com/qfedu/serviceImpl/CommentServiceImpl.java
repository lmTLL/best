package com.qfedu.serviceImpl;

import com.qfedu.dao.CommentMapper;
import com.qfedu.pojo.Comment;
import com.qfedu.service.CommentService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper dao;
    @Override
    public ResultVo selectByGoodsId(Integer comGid) {
        List<Comment> list = dao.selectByGoodsId(comGid);
        if (list!=null){
            return ResultVo.setOK(list);
        }else {
            return ResultVo.setERROR("没有关于该商品的评论");
        }


    }
}
