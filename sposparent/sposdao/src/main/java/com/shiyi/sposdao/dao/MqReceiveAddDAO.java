package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MqReceiveAdd;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MqReceiveAddDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MqReceiveAdd record);

    int insertSelective(MqReceiveAdd record);

    MqReceiveAdd selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MqReceiveAdd record);

    int updateByPrimaryKey(MqReceiveAdd record);
}