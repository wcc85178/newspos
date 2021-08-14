package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.DbTradeRiskRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DbTradeRiskRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(DbTradeRiskRecord record);

    int insertSelective(DbTradeRiskRecord record);

    DbTradeRiskRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DbTradeRiskRecord record);

    int updateByPrimaryKey(DbTradeRiskRecord record);
}