package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PosAgentMapping;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosAgentMappingDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PosAgentMapping record);

    int insertSelective(PosAgentMapping record);

    PosAgentMapping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PosAgentMapping record);

    int updateByPrimaryKey(PosAgentMapping record);
}