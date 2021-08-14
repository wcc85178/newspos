package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerFrozenFeeConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerFrozenFeeConfigDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerFrozenFeeConfig record);

    int insertSelective(CustomerFrozenFeeConfig record);

    CustomerFrozenFeeConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerFrozenFeeConfig record);

    int updateByPrimaryKey(CustomerFrozenFeeConfig record);
}