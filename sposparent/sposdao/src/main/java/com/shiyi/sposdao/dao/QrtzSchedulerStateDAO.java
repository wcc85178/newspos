package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.QrtzSchedulerState;
import com.shiyi.sposdao.entity.QrtzSchedulerStateKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QrtzSchedulerStateDAO {
    int deleteByPrimaryKey(QrtzSchedulerStateKey key);

    int insert(QrtzSchedulerState record);

    int insertSelective(QrtzSchedulerState record);

    QrtzSchedulerState selectByPrimaryKey(QrtzSchedulerStateKey key);

    int updateByPrimaryKeySelective(QrtzSchedulerState record);

    int updateByPrimaryKey(QrtzSchedulerState record);
}