package com.qfedu.service;

import com.qfedu.pojo.Goods;

import java.util.List;
import java.util.Map;

public interface GoodsService {

    List<Goods> selectHotGoodsByTypeId(Integer TypeId);

    Goods selectGoodsByGoodsId(Long GoodsId);

    List<Goods> selectAllGoods();
}
