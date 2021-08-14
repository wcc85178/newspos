package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PosRunningUp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosRunningUpDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PosRunningUp record);

    int insertSelective(PosRunningUp record);

    PosRunningUp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PosRunningUp record);

    int updateByPrimaryKey(PosRunningUp record);
}