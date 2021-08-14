package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MerchantFuncInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MerchantFuncInfoDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MerchantFuncInfo record);

    int insertSelective(MerchantFuncInfo record);

    MerchantFuncInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MerchantFuncInfo record);

    int updateByPrimaryKey(MerchantFuncInfo record);
}