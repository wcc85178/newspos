package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.AgentCheckConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AgentCheckConfigDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AgentCheckConfig record);

    int insertSelective(AgentCheckConfig record);

    AgentCheckConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentCheckConfig record);

    int updateByPrimaryKey(AgentCheckConfig record);
}