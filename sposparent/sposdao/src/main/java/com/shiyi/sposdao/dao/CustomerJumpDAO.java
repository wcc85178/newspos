package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerJump;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerJumpDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerJump record);

    int insertSelective(CustomerJump record);

    CustomerJump selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerJump record);

    int updateByPrimaryKey(CustomerJump record);
}