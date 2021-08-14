package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.OenRule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OenRuleDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(OenRule record);

    int insertSelective(OenRule record);

    OenRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OenRule record);

    int updateByPrimaryKey(OenRule record);
}