package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerSaleCity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerSaleCityDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerSaleCity record);

    int insertSelective(CustomerSaleCity record);

    CustomerSaleCity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerSaleCity record);

    int updateByPrimaryKey(CustomerSaleCity record);
}