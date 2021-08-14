package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerFrozenFee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerFrozenFeeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerFrozenFee record);

    int insertSelective(CustomerFrozenFee record);

    CustomerFrozenFee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerFrozenFee record);

    int updateByPrimaryKey(CustomerFrozenFee record);
}