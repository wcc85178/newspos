package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.QrtzSimpropTriggers;
import com.shiyi.sposdao.entity.QrtzSimpropTriggersKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QrtzSimpropTriggersDAO {
    int deleteByPrimaryKey(QrtzSimpropTriggersKey key);

    int insert(QrtzSimpropTriggers record);

    int insertSelective(QrtzSimpropTriggers record);

    QrtzSimpropTriggers selectByPrimaryKey(QrtzSimpropTriggersKey key);

    int updateByPrimaryKeySelective(QrtzSimpropTriggers record);

    int updateByPrimaryKey(QrtzSimpropTriggers record);
}