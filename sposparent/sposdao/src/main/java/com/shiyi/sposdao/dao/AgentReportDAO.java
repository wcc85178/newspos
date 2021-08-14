package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.AgentReport;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AgentReportDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AgentReport record);

    int insertSelective(AgentReport record);

    AgentReport selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentReport record);

    int updateByPrimaryKey(AgentReport record);
}