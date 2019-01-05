package com.qfedu.dao;

import com.qfedu.pojo.Person;

public interface PersonMapper {
    int deleteByPrimaryKey(Long perId);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Long perId);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}