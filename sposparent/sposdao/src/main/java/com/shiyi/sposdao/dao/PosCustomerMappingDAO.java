package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PosCustomerMapping;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosCustomerMappingDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PosCustomerMapping record);

    int insertSelective(PosCustomerMapping record);

    PosCustomerMapping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PosCustomerMapping record);

    int updateByPrimaryKey(PosCustomerMapping record);
}