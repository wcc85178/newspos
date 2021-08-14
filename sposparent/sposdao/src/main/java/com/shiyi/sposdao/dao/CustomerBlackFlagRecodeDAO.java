package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerBlackFlagRecode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerBlackFlagRecodeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerBlackFlagRecode record);

    int insertSelective(CustomerBlackFlagRecode record);

    CustomerBlackFlagRecode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerBlackFlagRecode record);

    int updateByPrimaryKey(CustomerBlackFlagRecode record);
}