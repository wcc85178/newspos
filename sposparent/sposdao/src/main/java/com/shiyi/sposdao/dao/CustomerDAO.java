package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Customer;
import com.shiyi.sposdao.entity.CustomerKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerDAO {
    int deleteByPrimaryKey(CustomerKey key);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(CustomerKey key);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}