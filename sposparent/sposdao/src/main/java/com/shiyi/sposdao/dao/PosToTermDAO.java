package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PosToTerm;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosToTermDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PosToTerm record);

    int insertSelective(PosToTerm record);

    PosToTerm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PosToTerm record);

    int updateByPrimaryKey(PosToTerm record);
}