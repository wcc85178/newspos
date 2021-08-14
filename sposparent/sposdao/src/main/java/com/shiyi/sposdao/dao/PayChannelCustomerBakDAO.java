package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelCustomerBak;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelCustomerBakDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelCustomerBak record);

    int insertSelective(PayChannelCustomerBak record);

    PayChannelCustomerBak selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelCustomerBak record);

    int updateByPrimaryKey(PayChannelCustomerBak record);
}