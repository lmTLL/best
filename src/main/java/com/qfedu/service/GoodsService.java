package com.qfedu.service;

import com.qfedu.pojo.Goods;
import com.qfedu.vo.ResultVo;

import java.util.List;
import java.util.Map;

public interface GoodsService {

    List<Goods> selectHotGoodsByTypeId(Integer TypeId);

    Goods selectGoodsByGoodsId(Long GoodsId);

    List<Goods> selectAllGoods();

    ResultVo selectByGoodsName(String goodsName);
}
