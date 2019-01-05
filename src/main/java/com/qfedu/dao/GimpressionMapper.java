package com.qfedu.dao;

import com.qfedu.pojo.Gimpression;

public interface GimpressionMapper {
    int deleteByPrimaryKey(Integer preId);

    int insert(Gimpression record);

    int insertSelective(Gimpression record);

    Gimpression selectByPrimaryKey(Integer preId);

    int updateByPrimaryKeySelective(Gimpression record);

    int updateByPrimaryKey(Gimpression record);
}