package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelCustomerBatchNo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelCustomerBatchNoDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelCustomerBatchNo record);

    int insertSelective(PayChannelCustomerBatchNo record);

    PayChannelCustomerBatchNo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelCustomerBatchNo record);

    int updateByPrimaryKey(PayChannelCustomerBatchNo record);
}