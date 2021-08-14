package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerSettleT1;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerSettleT1DAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerSettleT1 record);

    int insertSelective(CustomerSettleT1 record);

    CustomerSettleT1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerSettleT1 record);

    int updateByPrimaryKey(CustomerSettleT1 record);
}