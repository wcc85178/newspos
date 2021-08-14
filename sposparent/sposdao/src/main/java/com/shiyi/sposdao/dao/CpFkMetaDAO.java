package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpFkMeta;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpFkMetaDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CpFkMeta record);

    int insertSelective(CpFkMeta record);

    CpFkMeta selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpFkMeta record);

    int updateByPrimaryKey(CpFkMeta record);
}