package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelCustomer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelCustomerDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelCustomer record);

    int insertSelective(PayChannelCustomer record);

    PayChannelCustomer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelCustomer record);

    int updateByPrimaryKey(PayChannelCustomer record);
}