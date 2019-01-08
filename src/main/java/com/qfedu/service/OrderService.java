package com.qfedu.service;

import com.qfedu.pojo.Order;

import java.util.List;

public interface OrderService {

    List<Order> selectAllGoodsByUserId(Long userId);

    List<Order> selectAllGoodsByUserIdAndGoodsType(Long userId,Integer state);
}
