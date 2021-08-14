package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.OutcomesStatistics;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OutcomesStatisticsDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(OutcomesStatistics record);

    int insertSelective(OutcomesStatistics record);

    OutcomesStatistics selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OutcomesStatistics record);

    int updateByPrimaryKey(OutcomesStatistics record);
}