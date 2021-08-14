package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerOtherLogin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerOtherLoginDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerOtherLogin record);

    int insertSelective(CustomerOtherLogin record);

    CustomerOtherLogin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerOtherLogin record);

    int updateByPrimaryKey(CustomerOtherLogin record);
}