package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerAccumulateTask;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerAccumulateTaskDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAccumulateTask record);

    int insertSelective(CustomerAccumulateTask record);

    CustomerAccumulateTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerAccumulateTask record);

    int updateByPrimaryKey(CustomerAccumulateTask record);
}