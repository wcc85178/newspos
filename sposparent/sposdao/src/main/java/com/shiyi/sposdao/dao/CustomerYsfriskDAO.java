package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerYsfrisk;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerYsfriskDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerYsfrisk record);

    int insertSelective(CustomerYsfrisk record);

    CustomerYsfrisk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerYsfrisk record);

    int updateByPrimaryKey(CustomerYsfrisk record);
}