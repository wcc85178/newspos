package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.QrtzCronTriggers;
import com.shiyi.sposdao.entity.QrtzCronTriggersKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QrtzCronTriggersDAO {
    int deleteByPrimaryKey(QrtzCronTriggersKey key);

    int insert(QrtzCronTriggers record);

    int insertSelective(QrtzCronTriggers record);

    QrtzCronTriggers selectByPrimaryKey(QrtzCronTriggersKey key);

    int updateByPrimaryKeySelective(QrtzCronTriggers record);

    int updateByPrimaryKey(QrtzCronTriggers record);
}