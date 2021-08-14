package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.QrPayChannel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QrPayChannelDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(QrPayChannel record);

    int insertSelective(QrPayChannel record);

    QrPayChannel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QrPayChannel record);

    int updateByPrimaryKey(QrPayChannel record);
}