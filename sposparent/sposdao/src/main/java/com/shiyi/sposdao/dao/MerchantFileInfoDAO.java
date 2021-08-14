package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MerchantFileInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MerchantFileInfoDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MerchantFileInfo record);

    int insertSelective(MerchantFileInfo record);

    MerchantFileInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MerchantFileInfo record);

    int updateByPrimaryKey(MerchantFileInfo record);
}