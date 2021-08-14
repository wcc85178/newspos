package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.ClearTask;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ClearTaskDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ClearTask record);

    int insertSelective(ClearTask record);

    ClearTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClearTask record);

    int updateByPrimaryKey(ClearTask record);
}