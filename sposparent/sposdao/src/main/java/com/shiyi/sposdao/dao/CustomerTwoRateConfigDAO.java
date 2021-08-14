package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerTwoRateConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerTwoRateConfigDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerTwoRateConfig record);

    int insertSelective(CustomerTwoRateConfig record);

    CustomerTwoRateConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerTwoRateConfig record);

    int updateByPrimaryKey(CustomerTwoRateConfig record);
}