package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpFkMetaDisplayCond;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpFkMetaDisplayCondDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CpFkMetaDisplayCond record);

    int insertSelective(CpFkMetaDisplayCond record);

    CpFkMetaDisplayCond selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpFkMetaDisplayCond record);

    int updateByPrimaryKey(CpFkMetaDisplayCond record);
}