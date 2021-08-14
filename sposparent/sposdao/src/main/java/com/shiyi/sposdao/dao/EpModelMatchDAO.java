package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.EpModelMatch;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EpModelMatchDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(EpModelMatch record);

    int insertSelective(EpModelMatch record);

    EpModelMatch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EpModelMatch record);

    int updateByPrimaryKey(EpModelMatch record);
}