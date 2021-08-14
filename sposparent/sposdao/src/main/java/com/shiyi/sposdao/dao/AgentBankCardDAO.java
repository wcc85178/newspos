package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.AgentBankCard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AgentBankCardDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AgentBankCard record);

    int insertSelective(AgentBankCard record);

    AgentBankCard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentBankCard record);

    int updateByPrimaryKey(AgentBankCard record);
}