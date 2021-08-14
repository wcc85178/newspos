package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Agenttwoconfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AgenttwoconfigDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Agenttwoconfig record);

    int insertSelective(Agenttwoconfig record);

    Agenttwoconfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Agenttwoconfig record);

    int updateByPrimaryKey(Agenttwoconfig record);
}