package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Mcc;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MccDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Mcc record);

    int insertSelective(Mcc record);

    Mcc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mcc record);

    int updateByPrimaryKey(Mcc record);
}