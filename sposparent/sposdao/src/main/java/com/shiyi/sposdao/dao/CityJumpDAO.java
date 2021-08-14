package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CityJump;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CityJumpDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CityJump record);

    int insertSelective(CityJump record);

    CityJump selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CityJump record);

    int updateByPrimaryKey(CityJump record);
}