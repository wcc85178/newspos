package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerBalanceRunning;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerBalanceRunningDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerBalanceRunning record);

    int insertSelective(CustomerBalanceRunning record);

    CustomerBalanceRunning selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerBalanceRunning record);

    int updateByPrimaryKey(CustomerBalanceRunning record);
}