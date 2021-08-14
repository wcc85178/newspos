package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Factory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface FactoryDAO {
    int deleteByPrimaryKey(Byte factoryId);

    int insert(Factory record);

    int insertSelective(Factory record);

    Factory selectByPrimaryKey(Byte factoryId);

    int updateByPrimaryKeySelective(Factory record);

    int updateByPrimaryKey(Factory record);
}