package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerSubscribe;
import com.shiyi.sposdao.entity.CustomerSubscribeKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerSubscribeDAO {
    int deleteByPrimaryKey(CustomerSubscribeKey key);

    int insert(CustomerSubscribe record);

    int insertSelective(CustomerSubscribe record);

    CustomerSubscribe selectByPrimaryKey(CustomerSubscribeKey key);

    int updateByPrimaryKeySelective(CustomerSubscribe record);

    int updateByPrimaryKey(CustomerSubscribe record);
}