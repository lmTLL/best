package com.qfedu.dao;

import com.qfedu.pojo.OrderGoods;

public interface OrderGoodsMapper {
    int deleteByPrimaryKey(Integer ogId);

    int insert(OrderGoods record);

    int insertSelective(OrderGoods record);

    OrderGoods selectByPrimaryKey(Integer ogId);

    int updateByPrimaryKeySelective(OrderGoods record);

    int updateByPrimaryKey(OrderGoods record);
}