package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.AgentAccountConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AgentAccountConfigDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AgentAccountConfig record);

    int insertSelective(AgentAccountConfig record);

    AgentAccountConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentAccountConfig record);

    int updateByPrimaryKey(AgentAccountConfig record);
}