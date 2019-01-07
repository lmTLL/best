package com.qfedu.serviceImpl;

import com.qfedu.dao.GoodsTypeMapper;
import com.qfedu.pojo.Goods;
import com.qfedu.pojo.GoodsType;
import com.qfedu.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Autowired
    GoodsTypeMapper TypeDao;

    @Override
    public List<GoodsType> selectAllGoodsType() {
        List<GoodsType> goodsTypes = TypeDao.selectAllGoodsType();
        List<GoodsType> list = new ArrayList<>();
        for(GoodsType  goodsType: goodsTypes){
            //确认一级菜单
            if (goodsType.getGtKind() == null){
                goodsType.setTwoGoodsType(new ArrayList<>());
                list.add(goodsType);
            } else {
                //二级菜单，添加进一级菜单的list里
                for (GoodsType goods : list) {
                    //确认是否为同一级菜单
                    if (goodsType.getGtKind() == goods.getGtId()){
                        goods.getTwoGoodsType().add(goodsType);
                    }
                }
            }
        }
        return list;
    }
}
