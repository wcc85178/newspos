package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.QrtzTriggers;
import com.shiyi.sposdao.entity.QrtzTriggersKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QrtzTriggersDAO {
    int deleteByPrimaryKey(QrtzTriggersKey key);

    int insert(QrtzTriggers record);

    int insertSelective(QrtzTriggers record);

    QrtzTriggers selectByPrimaryKey(QrtzTriggersKey key);

    int updateByPrimaryKeySelective(QrtzTriggers record);

    int updateByPrimaryKeyWithBLOBs(QrtzTriggers record);

    int updateByPrimaryKey(QrtzTriggers record);
}