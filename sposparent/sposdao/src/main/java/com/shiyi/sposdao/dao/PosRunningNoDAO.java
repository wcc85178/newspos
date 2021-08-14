package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PosRunningNo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosRunningNoDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PosRunningNo record);

    int insertSelective(PosRunningNo record);

    PosRunningNo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PosRunningNo record);

    int updateByPrimaryKey(PosRunningNo record);
}