package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.HsFtpReconciliation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface HsFtpReconciliationDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(HsFtpReconciliation record);

    int insertSelective(HsFtpReconciliation record);

    HsFtpReconciliation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HsFtpReconciliation record);

    int updateByPrimaryKey(HsFtpReconciliation record);
}