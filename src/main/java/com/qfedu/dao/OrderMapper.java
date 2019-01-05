package com.qfedu.dao;

import com.qfedu.pojo.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Long odId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long odId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}