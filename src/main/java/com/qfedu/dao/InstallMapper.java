package com.qfedu.dao;

import com.qfedu.pojo.Goods;
import com.qfedu.pojo.Install;

import java.util.List;

public interface InstallMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Install record);

    int insertSelective(Install record);

    Install selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Install record);

    int updateByPrimaryKey(Install record);
}