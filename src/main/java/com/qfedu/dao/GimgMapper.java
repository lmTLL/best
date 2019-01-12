package com.qfedu.dao;

import com.qfedu.pojo.Gimg;

import java.util.List;

public interface GimgMapper {
    int deleteByPrimaryKey(Long imgId);

    int insert(Gimg record);

    int insertSelective(Gimg record);

    Gimg selectByPrimaryKey(Long imgId);

    int updateByPrimaryKeySelective(Gimg record);

    int updateByPrimaryKey(Gimg record);

    List<Gimg> selectAllGimgByGoodsId(Long goodsId);



    List<Gimg> getAllGimg(Long imgGid);
}