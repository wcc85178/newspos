package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.AgentGreenBalanceRunning;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AgentGreenBalanceRunningDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AgentGreenBalanceRunning record);

    int insertSelective(AgentGreenBalanceRunning record);

    AgentGreenBalanceRunning selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentGreenBalanceRunning record);

    int updateByPrimaryKey(AgentGreenBalanceRunning record);
}