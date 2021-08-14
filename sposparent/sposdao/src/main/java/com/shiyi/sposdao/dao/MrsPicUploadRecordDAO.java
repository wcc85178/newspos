package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MrsPicUploadRecord;
import com.shiyi.sposdao.entity.MrsPicUploadRecordWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MrsPicUploadRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MrsPicUploadRecordWithBLOBs record);

    int insertSelective(MrsPicUploadRecordWithBLOBs record);

    MrsPicUploadRecordWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MrsPicUploadRecordWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MrsPicUploadRecordWithBLOBs record);

    int updateByPrimaryKey(MrsPicUploadRecord record);
}