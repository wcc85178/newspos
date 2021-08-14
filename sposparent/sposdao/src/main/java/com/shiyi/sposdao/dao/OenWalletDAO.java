package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.OenWallet;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OenWalletDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(OenWallet record);

    int insertSelective(OenWallet record);

    OenWallet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OenWallet record);

    int updateByPrimaryKey(OenWallet record);
}