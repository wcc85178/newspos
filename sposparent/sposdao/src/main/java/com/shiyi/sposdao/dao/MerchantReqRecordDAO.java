package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MerchantReqRecord;
import com.shiyi.sposdao.entity.MerchantReqRecordWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MerchantReqRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MerchantReqRecordWithBLOBs record);

    int insertSelective(MerchantReqRecordWithBLOBs record);

    MerchantReqRecordWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MerchantReqRecordWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MerchantReqRecordWithBLOBs record);

    int updateByPrimaryKey(MerchantReqRecord record);
}