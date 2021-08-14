package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelAgentWhite;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelAgentWhiteDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelAgentWhite record);

    int insertSelective(PayChannelAgentWhite record);

    PayChannelAgentWhite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelAgentWhite record);

    int updateByPrimaryKey(PayChannelAgentWhite record);
}