package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.ChannelFeeType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ChannelFeeTypeDAO {
    int deleteByPrimaryKey(Short chfeeid);

    int insert(ChannelFeeType record);

    int insertSelective(ChannelFeeType record);

    ChannelFeeType selectByPrimaryKey(Short chfeeid);

    int updateByPrimaryKeySelective(ChannelFeeType record);

    int updateByPrimaryKey(ChannelFeeType record);
}