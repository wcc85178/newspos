package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.HandPosPic;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface HandPosPicDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(HandPosPic record);

    int insertSelective(HandPosPic record);

    HandPosPic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HandPosPic record);

    int updateByPrimaryKey(HandPosPic record);
}