package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MarginTotal;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MarginTotalDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MarginTotal record);

    int insertSelective(MarginTotal record);

    MarginTotal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MarginTotal record);

    int updateByPrimaryKey(MarginTotal record);
}