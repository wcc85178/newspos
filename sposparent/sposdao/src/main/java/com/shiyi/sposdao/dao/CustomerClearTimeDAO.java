package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerClearTime;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerClearTimeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerClearTime record);

    int insertSelective(CustomerClearTime record);

    CustomerClearTime selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerClearTime record);

    int updateByPrimaryKey(CustomerClearTime record);
}