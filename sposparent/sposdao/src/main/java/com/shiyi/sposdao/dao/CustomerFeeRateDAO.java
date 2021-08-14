package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerFeeRate;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerFeeRateDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerFeeRate record);

    int insertSelective(CustomerFeeRate record);

    CustomerFeeRate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerFeeRate record);

    int updateByPrimaryKey(CustomerFeeRate record);
}