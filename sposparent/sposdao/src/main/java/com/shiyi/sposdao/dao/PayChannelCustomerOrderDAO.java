package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelCustomerOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelCustomerOrderDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelCustomerOrder record);

    int insertSelective(PayChannelCustomerOrder record);

    PayChannelCustomerOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelCustomerOrder record);

    int updateByPrimaryKey(PayChannelCustomerOrder record);
}