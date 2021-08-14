package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelCustomerCheck;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelCustomerCheckDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelCustomerCheck record);

    int insertSelective(PayChannelCustomerCheck record);

    PayChannelCustomerCheck selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelCustomerCheck record);

    int updateByPrimaryKey(PayChannelCustomerCheck record);
}