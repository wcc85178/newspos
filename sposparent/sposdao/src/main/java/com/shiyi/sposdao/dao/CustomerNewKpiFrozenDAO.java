package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerNewKpiFrozen;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerNewKpiFrozenDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerNewKpiFrozen record);

    int insertSelective(CustomerNewKpiFrozen record);

    CustomerNewKpiFrozen selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerNewKpiFrozen record);

    int updateByPrimaryKey(CustomerNewKpiFrozen record);
}