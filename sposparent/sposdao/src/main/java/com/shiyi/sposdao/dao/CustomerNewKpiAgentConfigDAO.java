package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerNewKpiAgentConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerNewKpiAgentConfigDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerNewKpiAgentConfig record);

    int insertSelective(CustomerNewKpiAgentConfig record);

    CustomerNewKpiAgentConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerNewKpiAgentConfig record);

    int updateByPrimaryKey(CustomerNewKpiAgentConfig record);
}