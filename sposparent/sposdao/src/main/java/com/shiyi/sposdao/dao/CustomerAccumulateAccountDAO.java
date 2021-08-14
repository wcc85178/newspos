package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerAccumulateAccount;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerAccumulateAccountDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAccumulateAccount record);

    int insertSelective(CustomerAccumulateAccount record);

    CustomerAccumulateAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerAccumulateAccount record);

    int updateByPrimaryKey(CustomerAccumulateAccount record);
}