package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelCityChange;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelCityChangeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelCityChange record);

    int insertSelective(PayChannelCityChange record);

    PayChannelCityChange selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelCityChange record);

    int updateByPrimaryKey(PayChannelCityChange record);
}