package com.qfedu.dao;

import com.qfedu.pojo.Order;
import com.qfedu.pojo.OrderGoods;

import java.util.List;

public interface OrderGoodsMapper {
    int deleteByPrimaryKey(Integer ogId);

    int insert(OrderGoods record);

    int insertSelective(OrderGoods record);

    OrderGoods selectByPrimaryKey(Integer ogId);

    int updateByPrimaryKeySelective(OrderGoods record);

    int updateByPrimaryKey(OrderGoods record);

    List<OrderGoods> selectAllOrderGoodsByOrderId(Long OrderId);
}