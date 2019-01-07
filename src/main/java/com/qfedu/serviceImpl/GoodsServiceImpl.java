package com.qfedu.serviceImpl;

import com.qfedu.dao.GoodsMapper;
import com.qfedu.pojo.Goods;
import com.qfedu.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsMapper goodsDao;

    @Override
    public List<Goods> selectHotGoodsByTypeId(Integer TypeId) {
        List<Goods> goodsList = goodsDao.selectHotGoodsByTypeId(TypeId);
        return goodsList;
    }

    @Override
    public Goods selectGoodsByGoodsId(Long GoodsId) {
        Goods goods = goodsDao.selectByPrimaryKey(GoodsId);
        return goods;
    }

    @Override
    public List<Goods> selectAllGoods() {
        List<Goods> list = goodsDao.selectAllGoods();
        return list;
    }
}
