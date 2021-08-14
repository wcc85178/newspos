package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerWallet;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerWalletDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerWallet record);

    int insertSelective(CustomerWallet record);

    CustomerWallet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerWallet record);

    int updateByPrimaryKey(CustomerWallet record);
}