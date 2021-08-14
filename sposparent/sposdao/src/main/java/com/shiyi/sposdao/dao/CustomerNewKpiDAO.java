package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerNewKpi;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerNewKpiDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerNewKpi record);

    int insertSelective(CustomerNewKpi record);

    CustomerNewKpi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerNewKpi record);

    int updateByPrimaryKey(CustomerNewKpi record);
}