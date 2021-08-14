package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelCustomerQr;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelCustomerQrDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelCustomerQr record);

    int insertSelective(PayChannelCustomerQr record);

    PayChannelCustomerQr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelCustomerQr record);

    int updateByPrimaryKey(PayChannelCustomerQr record);
}