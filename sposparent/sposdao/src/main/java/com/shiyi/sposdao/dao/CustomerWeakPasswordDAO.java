package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerWeakPassword;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerWeakPasswordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerWeakPassword record);

    int insertSelective(CustomerWeakPassword record);

    CustomerWeakPassword selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerWeakPassword record);

    int updateByPrimaryKey(CustomerWeakPassword record);
}