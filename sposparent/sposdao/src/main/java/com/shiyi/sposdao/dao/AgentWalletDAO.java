package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.AgentWallet;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AgentWalletDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AgentWallet record);

    int insertSelective(AgentWallet record);

    AgentWallet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentWallet record);

    int updateByPrimaryKey(AgentWallet record);
}