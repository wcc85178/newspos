package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.ForbiddenArea;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ForbiddenAreaDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ForbiddenArea record);

    int insertSelective(ForbiddenArea record);

    ForbiddenArea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ForbiddenArea record);

    int updateByPrimaryKey(ForbiddenArea record);
}