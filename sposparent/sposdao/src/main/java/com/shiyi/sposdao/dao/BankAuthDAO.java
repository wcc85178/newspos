package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.BankAuth;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BankAuthDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(BankAuth record);

    int insertSelective(BankAuth record);

    BankAuth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BankAuth record);

    int updateByPrimaryKey(BankAuth record);
}