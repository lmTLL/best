package com.qfedu.dao;

import com.qfedu.pojo.Goods;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Long goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Long goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<Goods> selectHotGoodsByTypeId(Integer TypeId);

    List<Goods> selectAllGoods();
}