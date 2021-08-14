package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PospRule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PospRuleDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PospRule record);

    int insertSelective(PospRule record);

    PospRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PospRule record);

    int updateByPrimaryKey(PospRule record);
}