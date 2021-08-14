package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelCustomerKeys;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelCustomerKeysDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelCustomerKeys record);

    int insertSelective(PayChannelCustomerKeys record);

    PayChannelCustomerKeys selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelCustomerKeys record);

    int updateByPrimaryKey(PayChannelCustomerKeys record);
}