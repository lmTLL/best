package com.qfedu.serviceImpl;

import com.qfedu.dao.GimgMapper;
import com.qfedu.dao.GoodsMapper;
import com.qfedu.dao.ImpMapper;
import com.qfedu.pojo.Gimg;
import com.qfedu.pojo.Goods;
import com.qfedu.pojo.Imp;
import com.qfedu.service.GoodsService;
import com.qfedu.vo.ResultVo;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsMapper goodsDao;

    @Autowired
    ImpMapper impDao;

    @Autowired
    GimgMapper gimgDao;

    @Override
    public List<Goods> selectHotGoodsByTypeId(Integer TypeId) {
        List<Goods> goodsList = goodsDao.selectHotGoodsByTypeId(TypeId);
        return goodsList;
    }

    @Override
    public Goods selectGoodsByGoodsId(Long GoodsId) {

        Goods goods = goodsDao.selectByPrimaryKey(GoodsId);

        List<Imp> impList = impDao.selectAllImpByGoodsId(goods.getGoodsId());
        List<Gimg> gimgList = gimgDao.selectAllGimgByGoodsId(goods.getGoodsId());
        goods.setGimgList(gimgList);
        goods.setImpList(impList);
        return goods;
    }

    @Override
    public List<Goods> selectAllGoods() {
        List<Goods> list = goodsDao.selectAllGoods();
        return list;
    }

    @Override
    public ResultVo selectByGoodsName(String goodsName) {
        Goods goods = goodsDao.selectByGoodsName(goodsName);
        if (goods!=null){
            return ResultVo.setOK(goods);
        }else{
            return ResultVo.setERROR("没有匹配的商品，再找找看吧");
        }

    }
}
