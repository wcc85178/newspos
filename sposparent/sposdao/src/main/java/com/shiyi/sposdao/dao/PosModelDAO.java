package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PosModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosModelDAO {
    int deleteByPrimaryKey(Integer modelId);

    int insert(PosModel record);

    int insertSelective(PosModel record);

    PosModel selectByPrimaryKey(Integer modelId);

    int updateByPrimaryKeySelective(PosModel record);

    int updateByPrimaryKey(PosModel record);
}