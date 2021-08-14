package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MrsAgentOperaRecord;
import com.shiyi.sposdao.entity.MrsAgentOperaRecordWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MrsAgentOperaRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MrsAgentOperaRecordWithBLOBs record);

    int insertSelective(MrsAgentOperaRecordWithBLOBs record);

    MrsAgentOperaRecordWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MrsAgentOperaRecordWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MrsAgentOperaRecordWithBLOBs record);

    int updateByPrimaryKey(MrsAgentOperaRecord record);
}