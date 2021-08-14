package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.BankAuthQuickPay;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BankAuthQuickPayDAO {
    int insert(BankAuthQuickPay record);

    int insertSelective(BankAuthQuickPay record);
}