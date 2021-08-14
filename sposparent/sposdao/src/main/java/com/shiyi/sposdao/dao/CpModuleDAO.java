package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpModule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpModuleDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CpModule record);

    int insertSelective(CpModule record);

    CpModule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpModule record);

    int updateByPrimaryKey(CpModule record);
}