package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerCodeChange;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerCodeChangeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerCodeChange record);

    int insertSelective(CustomerCodeChange record);

    CustomerCodeChange selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerCodeChange record);

    int updateByPrimaryKey(CustomerCodeChange record);
}