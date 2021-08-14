package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerErrPassword;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerErrPasswordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerErrPassword record);

    int insertSelective(CustomerErrPassword record);

    CustomerErrPassword selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerErrPassword record);

    int updateByPrimaryKey(CustomerErrPassword record);
}