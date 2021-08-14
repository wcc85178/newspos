package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerTagType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerTagTypeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerTagType record);

    int insertSelective(CustomerTagType record);

    CustomerTagType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerTagType record);

    int updateByPrimaryKey(CustomerTagType record);
}