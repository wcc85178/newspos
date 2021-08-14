package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CashPool;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CashPoolDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CashPool record);

    int insertSelective(CashPool record);

    CashPool selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CashPool record);

    int updateByPrimaryKey(CashPool record);
}