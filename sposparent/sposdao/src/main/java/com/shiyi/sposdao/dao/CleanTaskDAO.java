package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CleanTask;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CleanTaskDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CleanTask record);

    int insertSelective(CleanTask record);

    CleanTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CleanTask record);

    int updateByPrimaryKey(CleanTask record);
}