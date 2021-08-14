package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelRule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelRuleDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelRule record);

    int insertSelective(PayChannelRule record);

    PayChannelRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelRule record);

    int updateByPrimaryKey(PayChannelRule record);
}