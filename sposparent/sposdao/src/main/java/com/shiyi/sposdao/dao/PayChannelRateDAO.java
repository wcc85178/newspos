package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelRate;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelRateDAO {
    int insert(PayChannelRate record);

    int insertSelective(PayChannelRate record);
}