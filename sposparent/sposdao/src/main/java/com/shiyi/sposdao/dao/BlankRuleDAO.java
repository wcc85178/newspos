package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.BlankRule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BlankRuleDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(BlankRule record);

    int insertSelective(BlankRule record);

    BlankRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BlankRule record);

    int updateByPrimaryKey(BlankRule record);
}