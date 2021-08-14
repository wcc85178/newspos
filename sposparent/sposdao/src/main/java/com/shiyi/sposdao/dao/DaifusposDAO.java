package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Daifuspos;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DaifusposDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Daifuspos record);

    int insertSelective(Daifuspos record);

    Daifuspos selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Daifuspos record);

    int updateByPrimaryKey(Daifuspos record);
}