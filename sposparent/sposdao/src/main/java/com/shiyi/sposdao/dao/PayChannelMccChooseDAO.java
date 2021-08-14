package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelMccChoose;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelMccChooseDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelMccChoose record);

    int insertSelective(PayChannelMccChoose record);

    PayChannelMccChoose selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelMccChoose record);

    int updateByPrimaryKey(PayChannelMccChoose record);
}