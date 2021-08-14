package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Pos;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Pos record);

    int insertSelective(Pos record);

    Pos selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pos record);

    int updateByPrimaryKey(Pos record);
}