package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MoveTask;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MoveTaskDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MoveTask record);

    int insertSelective(MoveTask record);

    MoveTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MoveTask record);

    int updateByPrimaryKey(MoveTask record);
}