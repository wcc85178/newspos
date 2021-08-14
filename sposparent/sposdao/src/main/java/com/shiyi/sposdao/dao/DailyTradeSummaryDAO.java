package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.DailyTradeSummary;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DailyTradeSummaryDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(DailyTradeSummary record);

    int insertSelective(DailyTradeSummary record);

    DailyTradeSummary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DailyTradeSummary record);

    int updateByPrimaryKey(DailyTradeSummary record);
}