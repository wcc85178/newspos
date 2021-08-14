package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CardRule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CardRuleDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CardRule record);

    int insertSelective(CardRule record);

    CardRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CardRule record);

    int updateByPrimaryKey(CardRule record);
}