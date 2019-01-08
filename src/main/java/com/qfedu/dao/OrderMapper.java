package com.qfedu.dao;

import com.qfedu.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Long odId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long odId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> selectAllOrderByUserId(Long userId);

    List<Order> selectAllGoodsByUserIdAndGoodsType(@Param("userId") Long userId,@Param("state") Integer state);
}