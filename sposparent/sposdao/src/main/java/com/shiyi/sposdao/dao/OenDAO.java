package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Oen;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OenDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Oen record);

    int insertSelective(Oen record);

    Oen selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Oen record);

    int updateByPrimaryKey(Oen record);
}