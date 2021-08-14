package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerCreditcards;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerCreditcardsDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerCreditcards record);

    int insertSelective(CustomerCreditcards record);

    CustomerCreditcards selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerCreditcards record);

    int updateByPrimaryKey(CustomerCreditcards record);
}