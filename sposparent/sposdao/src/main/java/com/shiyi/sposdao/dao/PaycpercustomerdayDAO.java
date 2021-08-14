package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Paycpercustomerday;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PaycpercustomerdayDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Paycpercustomerday record);

    int insertSelective(Paycpercustomerday record);

    Paycpercustomerday selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Paycpercustomerday record);

    int updateByPrimaryKey(Paycpercustomerday record);
}