package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MrsEpOperaRecord;
import com.shiyi.sposdao.entity.MrsEpOperaRecordWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MrsEpOperaRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MrsEpOperaRecordWithBLOBs record);

    int insertSelective(MrsEpOperaRecordWithBLOBs record);

    MrsEpOperaRecordWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MrsEpOperaRecordWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MrsEpOperaRecordWithBLOBs record);

    int updateByPrimaryKey(MrsEpOperaRecord record);
}