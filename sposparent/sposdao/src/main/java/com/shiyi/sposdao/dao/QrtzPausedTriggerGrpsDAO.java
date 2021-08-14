package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.QrtzPausedTriggerGrpsKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QrtzPausedTriggerGrpsDAO {
    int deleteByPrimaryKey(QrtzPausedTriggerGrpsKey key);

    int insert(QrtzPausedTriggerGrpsKey record);

    int insertSelective(QrtzPausedTriggerGrpsKey record);
}