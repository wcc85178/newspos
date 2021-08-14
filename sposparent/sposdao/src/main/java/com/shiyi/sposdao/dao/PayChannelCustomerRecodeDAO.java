package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelCustomerRecode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelCustomerRecodeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelCustomerRecode record);

    int insertSelective(PayChannelCustomerRecode record);

    PayChannelCustomerRecode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelCustomerRecode record);

    int updateByPrimaryKey(PayChannelCustomerRecode record);
}