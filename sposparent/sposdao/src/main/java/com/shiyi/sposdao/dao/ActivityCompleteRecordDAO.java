package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.ActivityCompleteRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ActivityCompleteRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ActivityCompleteRecord record);

    int insertSelective(ActivityCompleteRecord record);

    ActivityCompleteRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ActivityCompleteRecord record);

    int updateByPrimaryKey(ActivityCompleteRecord record);
}