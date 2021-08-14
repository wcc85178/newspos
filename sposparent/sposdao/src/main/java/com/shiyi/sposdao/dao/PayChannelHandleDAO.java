package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelHandle;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelHandleDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelHandle record);

    int insertSelective(PayChannelHandle record);

    PayChannelHandle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelHandle record);

    int updateByPrimaryKey(PayChannelHandle record);
}