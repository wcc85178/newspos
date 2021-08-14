package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PosFreezeUploadDetailRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosFreezeUploadDetailRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PosFreezeUploadDetailRecord record);

    int insertSelective(PosFreezeUploadDetailRecord record);

    PosFreezeUploadDetailRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PosFreezeUploadDetailRecord record);

    int updateByPrimaryKey(PosFreezeUploadDetailRecord record);
}