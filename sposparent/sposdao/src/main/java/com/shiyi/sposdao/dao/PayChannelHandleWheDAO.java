package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelHandleWhe;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelHandleWheDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelHandleWhe record);

    int insertSelective(PayChannelHandleWhe record);

    PayChannelHandleWhe selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelHandleWhe record);

    int updateByPrimaryKey(PayChannelHandleWhe record);
}