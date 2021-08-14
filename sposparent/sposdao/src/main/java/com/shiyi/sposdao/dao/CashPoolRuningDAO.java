package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CashPoolRuning;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CashPoolRuningDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CashPoolRuning record);

    int insertSelective(CashPoolRuning record);

    CashPoolRuning selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CashPoolRuning record);

    int updateByPrimaryKey(CashPoolRuning record);
}