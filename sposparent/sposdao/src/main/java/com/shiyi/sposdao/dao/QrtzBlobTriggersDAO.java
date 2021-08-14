package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.QrtzBlobTriggers;
import com.shiyi.sposdao.entity.QrtzBlobTriggersKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QrtzBlobTriggersDAO {
    int deleteByPrimaryKey(QrtzBlobTriggersKey key);

    int insert(QrtzBlobTriggers record);

    int insertSelective(QrtzBlobTriggers record);

    QrtzBlobTriggers selectByPrimaryKey(QrtzBlobTriggersKey key);

    int updateByPrimaryKeySelective(QrtzBlobTriggers record);

    int updateByPrimaryKeyWithBLOBs(QrtzBlobTriggers record);
}