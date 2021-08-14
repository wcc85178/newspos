package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelCustomerRecodeDay;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelCustomerRecodeDayDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelCustomerRecodeDay record);

    int insertSelective(PayChannelCustomerRecodeDay record);

    PayChannelCustomerRecodeDay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelCustomerRecodeDay record);

    int updateByPrimaryKey(PayChannelCustomerRecodeDay record);
}