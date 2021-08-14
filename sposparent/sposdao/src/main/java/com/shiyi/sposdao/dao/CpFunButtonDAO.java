package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpFunButton;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpFunButtonDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CpFunButton record);

    int insertSelective(CpFunButton record);

    CpFunButton selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpFunButton record);

    int updateByPrimaryKey(CpFunButton record);
}