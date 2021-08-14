package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerRule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerRuleDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerRule record);

    int insertSelective(CustomerRule record);

    CustomerRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerRule record);

    int updateByPrimaryKey(CustomerRule record);
}