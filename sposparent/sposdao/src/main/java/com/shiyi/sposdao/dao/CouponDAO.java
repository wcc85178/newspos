package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Coupon;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CouponDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Coupon record);

    int insertSelective(Coupon record);

    Coupon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKey(Coupon record);
}