package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerKeys;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerKeysDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerKeys record);

    int insertSelective(CustomerKeys record);

    CustomerKeys selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerKeys record);

    int updateByPrimaryKey(CustomerKeys record);
}