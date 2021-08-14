package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Agent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AgentDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Agent record);

    int insertSelective(Agent record);

    Agent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Agent record);

    int updateByPrimaryKey(Agent record);
}