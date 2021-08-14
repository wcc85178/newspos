package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.AreaCode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AreaCodeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AreaCode record);

    int insertSelective(AreaCode record);

    AreaCode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AreaCode record);

    int updateByPrimaryKey(AreaCode record);
}