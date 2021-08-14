package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.QrtzLocksKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QrtzLocksDAO {
    int deleteByPrimaryKey(QrtzLocksKey key);

    int insert(QrtzLocksKey record);

    int insertSelective(QrtzLocksKey record);
}