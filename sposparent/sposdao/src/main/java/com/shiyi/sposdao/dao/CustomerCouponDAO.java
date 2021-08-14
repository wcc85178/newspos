package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerCoupon;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerCouponDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerCoupon record);

    int insertSelective(CustomerCoupon record);

    CustomerCoupon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerCoupon record);

    int updateByPrimaryKey(CustomerCoupon record);
}