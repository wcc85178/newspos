package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Fort1196;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface Fort1196DAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Fort1196 record);

    int insertSelective(Fort1196 record);

    Fort1196 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fort1196 record);

    int updateByPrimaryKey(Fort1196 record);
}