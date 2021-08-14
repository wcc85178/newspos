package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PosFreezeUploadRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosFreezeUploadRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PosFreezeUploadRecord record);

    int insertSelective(PosFreezeUploadRecord record);

    PosFreezeUploadRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PosFreezeUploadRecord record);

    int updateByPrimaryKey(PosFreezeUploadRecord record);
}