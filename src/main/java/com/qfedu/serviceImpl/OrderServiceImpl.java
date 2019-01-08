package com.qfedu.serviceImpl;

import com.qfedu.dao.OrderGoodsMapper;
import com.qfedu.dao.OrderMapper;
import com.qfedu.pojo.Goods;
import com.qfedu.pojo.Order;
import com.qfedu.pojo.OrderGoods;
import com.qfedu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService
{
    @Autowired
    OrderMapper orderDao;

    @Autowired
    OrderGoodsMapper OGDao;

    @Override
    public List<Order> selectAllGoodsByUserId(Long userId) {
        List<Order> orders = orderDao.selectAllOrderByUserId(userId);
        for (Order order: orders) {
            order.setOrderGoods(OGDao.selectAllOrderGoodsByOrderId(order.getOdId()));
        }
        return orders;
    }

    @Override
    public List<Order> selectAllGoodsByUserIdAndGoodsType(Long userId, Integer state) {
        List<Order> orders = orderDao.selectAllGoodsByUserIdAndGoodsType(userId , state);
        for (Order order: orders) {
            order.setOrderGoods(OGDao.selectAllOrderGoodsByOrderId(order.getOdId()));
        }

        return orders;
    }
}
