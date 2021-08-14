package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Fare;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface FareDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Fare record);

    int insertSelective(Fare record);

    Fare selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fare record);

    int updateByPrimaryKey(Fare record);
}