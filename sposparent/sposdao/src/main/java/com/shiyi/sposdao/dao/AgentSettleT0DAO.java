package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.AgentSettleT0;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AgentSettleT0DAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AgentSettleT0 record);

    int insertSelective(AgentSettleT0 record);

    AgentSettleT0 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentSettleT0 record);

    int updateByPrimaryKey(AgentSettleT0 record);
}