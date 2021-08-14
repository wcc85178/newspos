package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpFunction;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpFunctionDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CpFunction record);

    int insertSelective(CpFunction record);

    CpFunction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpFunction record);

    int updateByPrimaryKey(CpFunction record);
}