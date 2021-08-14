package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MerchantSettleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MerchantSettleInfoDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MerchantSettleInfo record);

    int insertSelective(MerchantSettleInfo record);

    MerchantSettleInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MerchantSettleInfo record);

    int updateByPrimaryKey(MerchantSettleInfo record);
}