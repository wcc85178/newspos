package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MerchantLicInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MerchantLicInfoDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MerchantLicInfo record);

    int insertSelective(MerchantLicInfo record);

    MerchantLicInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MerchantLicInfo record);

    int updateByPrimaryKey(MerchantLicInfo record);
}