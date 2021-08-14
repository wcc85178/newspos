package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpFkMetaCpFkMetaCond;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpFkMetaCpFkMetaCondDAO {
    int insert(CpFkMetaCpFkMetaCond record);

    int insertSelective(CpFkMetaCpFkMetaCond record);
}