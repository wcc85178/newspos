package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpTree;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpTreeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CpTree record);

    int insertSelective(CpTree record);

    CpTree selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpTree record);

    int updateByPrimaryKey(CpTree record);
}