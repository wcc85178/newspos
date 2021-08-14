package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.ChannelAddInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ChannelAddInfoDAO {
    int deleteByPrimaryKey(Integer chaddid);

    int insert(ChannelAddInfo record);

    int insertSelective(ChannelAddInfo record);

    ChannelAddInfo selectByPrimaryKey(Integer chaddid);

    int updateByPrimaryKeySelective(ChannelAddInfo record);

    int updateByPrimaryKey(ChannelAddInfo record);
}