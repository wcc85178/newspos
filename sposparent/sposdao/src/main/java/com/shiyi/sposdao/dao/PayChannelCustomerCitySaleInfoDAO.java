package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelCustomerCitySaleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelCustomerCitySaleInfoDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelCustomerCitySaleInfo record);

    int insertSelective(PayChannelCustomerCitySaleInfo record);

    PayChannelCustomerCitySaleInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelCustomerCitySaleInfo record);

    int updateByPrimaryKey(PayChannelCustomerCitySaleInfo record);
}