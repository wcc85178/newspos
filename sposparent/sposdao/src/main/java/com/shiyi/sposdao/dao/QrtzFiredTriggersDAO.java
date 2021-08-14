package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.QrtzFiredTriggers;
import com.shiyi.sposdao.entity.QrtzFiredTriggersKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QrtzFiredTriggersDAO {
    int deleteByPrimaryKey(QrtzFiredTriggersKey key);

    int insert(QrtzFiredTriggers record);

    int insertSelective(QrtzFiredTriggers record);

    QrtzFiredTriggers selectByPrimaryKey(QrtzFiredTriggersKey key);

    int updateByPrimaryKeySelective(QrtzFiredTriggers record);

    int updateByPrimaryKey(QrtzFiredTriggers record);
}