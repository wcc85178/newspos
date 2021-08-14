package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerReuse;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerReuseDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerReuse record);

    int insertSelective(CustomerReuse record);

    CustomerReuse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerReuse record);

    int updateByPrimaryKey(CustomerReuse record);
}