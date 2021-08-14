package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MerchantRate;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MerchantRateDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MerchantRate record);

    int insertSelective(MerchantRate record);

    MerchantRate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MerchantRate record);

    int updateByPrimaryKey(MerchantRate record);
}