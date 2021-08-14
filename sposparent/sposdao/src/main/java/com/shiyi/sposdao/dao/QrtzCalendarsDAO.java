package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.QrtzCalendars;
import com.shiyi.sposdao.entity.QrtzCalendarsKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QrtzCalendarsDAO {
    int deleteByPrimaryKey(QrtzCalendarsKey key);

    int insert(QrtzCalendars record);

    int insertSelective(QrtzCalendars record);

    QrtzCalendars selectByPrimaryKey(QrtzCalendarsKey key);

    int updateByPrimaryKeySelective(QrtzCalendars record);

    int updateByPrimaryKeyWithBLOBs(QrtzCalendars record);
}