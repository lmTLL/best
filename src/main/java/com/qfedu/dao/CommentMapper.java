package com.qfedu.dao;

import com.qfedu.pojo.Comment;

import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(Long comId);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Long comId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    List<Comment> selectByGoodsId(Integer comGid);
}