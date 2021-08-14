package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MerchantInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MerchantInfoDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MerchantInfo record);

    int insertSelective(MerchantInfo record);

    MerchantInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MerchantInfo record);

    int updateByPrimaryKey(MerchantInfo record);
}