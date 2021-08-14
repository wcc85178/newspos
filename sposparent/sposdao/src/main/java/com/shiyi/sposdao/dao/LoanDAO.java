package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Loan;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LoanDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Loan record);

    int insertSelective(Loan record);

    Loan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Loan record);

    int updateByPrimaryKey(Loan record);
}