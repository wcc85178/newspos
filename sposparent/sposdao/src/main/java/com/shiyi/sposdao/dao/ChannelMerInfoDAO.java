package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.ChannelMerInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ChannelMerInfoDAO {
    int deleteByPrimaryKey(Integer chid);

    int insert(ChannelMerInfo record);

    int insertSelective(ChannelMerInfo record);

    ChannelMerInfo selectByPrimaryKey(Integer chid);

    int updateByPrimaryKeySelective(ChannelMerInfo record);

    int updateByPrimaryKey(ChannelMerInfo record);
}