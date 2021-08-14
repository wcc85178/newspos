package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelCustomerRankRule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelCustomerRankRuleDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelCustomerRankRule record);

    int insertSelective(PayChannelCustomerRankRule record);

    PayChannelCustomerRankRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelCustomerRankRule record);

    int updateByPrimaryKey(PayChannelCustomerRankRule record);
}