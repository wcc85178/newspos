package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PosKeys;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosKeysDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PosKeys record);

    int insertSelective(PosKeys record);

    PosKeys selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PosKeys record);

    int updateByPrimaryKey(PosKeys record);
}