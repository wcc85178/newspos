package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.FeeRateRule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface FeeRateRuleDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(FeeRateRule record);

    int insertSelective(FeeRateRule record);

    FeeRateRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FeeRateRule record);

    int updateByPrimaryKey(FeeRateRule record);
}