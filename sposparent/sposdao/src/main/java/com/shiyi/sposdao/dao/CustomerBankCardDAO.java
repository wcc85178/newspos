package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerBankCard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerBankCardDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerBankCard record);

    int insertSelective(CustomerBankCard record);

    CustomerBankCard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerBankCard record);

    int updateByPrimaryKey(CustomerBankCard record);
}