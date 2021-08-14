package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannel record);

    int insertSelective(PayChannel record);

    PayChannel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannel record);

    int updateByPrimaryKey(PayChannel record);
}