package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerSettleT0;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerSettleT0DAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerSettleT0 record);

    int insertSelective(CustomerSettleT0 record);

    CustomerSettleT0 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerSettleT0 record);

    int updateByPrimaryKey(CustomerSettleT0 record);
}