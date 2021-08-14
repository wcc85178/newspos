package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.ClearRule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ClearRuleDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ClearRule record);

    int insertSelective(ClearRule record);

    ClearRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClearRule record);

    int updateByPrimaryKey(ClearRule record);
}