package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpFkMetaDisplayField;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpFkMetaDisplayFieldDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CpFkMetaDisplayField record);

    int insertSelective(CpFkMetaDisplayField record);

    CpFkMetaDisplayField selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpFkMetaDisplayField record);

    int updateByPrimaryKey(CpFkMetaDisplayField record);
}