package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MrsTermModelMatch;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MrsTermModelMatchDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MrsTermModelMatch record);

    int insertSelective(MrsTermModelMatch record);

    MrsTermModelMatch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MrsTermModelMatch record);

    int updateByPrimaryKey(MrsTermModelMatch record);
}