package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PosError;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosErrorDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PosError record);

    int insertSelective(PosError record);

    PosError selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PosError record);

    int updateByPrimaryKey(PosError record);
}