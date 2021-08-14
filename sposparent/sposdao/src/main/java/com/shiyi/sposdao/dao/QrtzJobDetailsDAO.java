package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.QrtzJobDetails;
import com.shiyi.sposdao.entity.QrtzJobDetailsKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QrtzJobDetailsDAO {
    int deleteByPrimaryKey(QrtzJobDetailsKey key);

    int insert(QrtzJobDetails record);

    int insertSelective(QrtzJobDetails record);

    QrtzJobDetails selectByPrimaryKey(QrtzJobDetailsKey key);

    int updateByPrimaryKeySelective(QrtzJobDetails record);

    int updateByPrimaryKeyWithBLOBs(QrtzJobDetails record);

    int updateByPrimaryKey(QrtzJobDetails record);
}