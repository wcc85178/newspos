package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PospSerialNo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PospSerialNoDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PospSerialNo record);

    int insertSelective(PospSerialNo record);

    PospSerialNo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PospSerialNo record);

    int updateByPrimaryKey(PospSerialNo record);
}