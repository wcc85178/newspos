package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Checkpos;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CheckposDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Checkpos record);

    int insertSelective(Checkpos record);

    Checkpos selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Checkpos record);

    int updateByPrimaryKey(Checkpos record);
}