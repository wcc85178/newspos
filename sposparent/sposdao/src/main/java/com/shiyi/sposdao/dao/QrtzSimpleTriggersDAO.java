package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.QrtzSimpleTriggers;
import com.shiyi.sposdao.entity.QrtzSimpleTriggersKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QrtzSimpleTriggersDAO {
    int deleteByPrimaryKey(QrtzSimpleTriggersKey key);

    int insert(QrtzSimpleTriggers record);

    int insertSelective(QrtzSimpleTriggers record);

    QrtzSimpleTriggers selectByPrimaryKey(QrtzSimpleTriggersKey key);

    int updateByPrimaryKeySelective(QrtzSimpleTriggers record);

    int updateByPrimaryKey(QrtzSimpleTriggers record);
}