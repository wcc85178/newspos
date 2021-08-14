package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.AgentMenuConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AgentMenuConfigDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AgentMenuConfig record);

    int insertSelective(AgentMenuConfig record);

    AgentMenuConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentMenuConfig record);

    int updateByPrimaryKey(AgentMenuConfig record);
}