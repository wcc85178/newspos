package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.ActivityCycleStatistics;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ActivityCycleStatisticsDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ActivityCycleStatistics record);

    int insertSelective(ActivityCycleStatistics record);

    ActivityCycleStatistics selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ActivityCycleStatistics record);

    int updateByPrimaryKey(ActivityCycleStatistics record);
}