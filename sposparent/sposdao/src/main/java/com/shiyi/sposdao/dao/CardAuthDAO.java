package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CardAuth;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CardAuthDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CardAuth record);

    int insertSelective(CardAuth record);

    CardAuth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CardAuth record);

    int updateByPrimaryKey(CardAuth record);
}