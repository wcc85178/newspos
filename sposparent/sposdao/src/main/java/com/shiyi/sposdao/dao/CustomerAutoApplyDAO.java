package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerAutoApply;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerAutoApplyDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAutoApply record);

    int insertSelective(CustomerAutoApply record);

    CustomerAutoApply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerAutoApply record);

    int updateByPrimaryKey(CustomerAutoApply record);
}