package com.qfedu.dao;

import com.qfedu.pojo.Imp;

import java.util.List;

public interface ImpMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(Imp record);

    int insertSelective(Imp record);

    Imp selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(Imp record);

    int updateByPrimaryKey(Imp record);

    List<Imp> selectAllImpByGoodsId(Long goodsId);

    List<Imp> selectAllImp(Integer iGid);
}