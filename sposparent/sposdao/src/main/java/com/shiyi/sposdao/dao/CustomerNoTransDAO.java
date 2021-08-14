package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerNoTrans;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerNoTransDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerNoTrans record);

    int insertSelective(CustomerNoTrans record);

    CustomerNoTrans selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerNoTrans record);

    int updateByPrimaryKey(CustomerNoTrans record);
}