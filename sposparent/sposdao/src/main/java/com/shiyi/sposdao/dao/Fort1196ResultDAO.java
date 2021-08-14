package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Fort1196Result;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface Fort1196ResultDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Fort1196Result record);

    int insertSelective(Fort1196Result record);

    Fort1196Result selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fort1196Result record);

    int updateByPrimaryKey(Fort1196Result record);
}