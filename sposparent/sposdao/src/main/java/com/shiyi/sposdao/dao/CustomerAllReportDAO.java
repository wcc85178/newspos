package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerAllReport;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerAllReportDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAllReport record);

    int insertSelective(CustomerAllReport record);

    CustomerAllReport selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerAllReport record);

    int updateByPrimaryKey(CustomerAllReport record);
}