package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PosNoRunning;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosNoRunningDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PosNoRunning record);

    int insertSelective(PosNoRunning record);

    PosNoRunning selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PosNoRunning record);

    int updateByPrimaryKey(PosNoRunning record);
}