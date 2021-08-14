package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpModuleCpFunction;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpModuleCpFunctionDAO {
    int deleteByPrimaryKey(Integer cpFunctionId);

    int insert(CpModuleCpFunction record);

    int insertSelective(CpModuleCpFunction record);

    CpModuleCpFunction selectByPrimaryKey(Integer cpFunctionId);

    int updateByPrimaryKeySelective(CpModuleCpFunction record);

    int updateByPrimaryKey(CpModuleCpFunction record);
}