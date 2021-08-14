package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpFkMetaCpFkMetaDisplayField;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpFkMetaCpFkMetaDisplayFieldDAO {
    int insert(CpFkMetaCpFkMetaDisplayField record);

    int insertSelective(CpFkMetaCpFkMetaDisplayField record);
}