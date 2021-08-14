package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.EndCustomer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EndCustomerDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(EndCustomer record);

    int insertSelective(EndCustomer record);

    EndCustomer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EndCustomer record);

    int updateByPrimaryKey(EndCustomer record);
}