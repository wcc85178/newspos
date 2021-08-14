package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PartnerSummarizeRecode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PartnerSummarizeRecodeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PartnerSummarizeRecode record);

    int insertSelective(PartnerSummarizeRecode record);

    PartnerSummarizeRecode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PartnerSummarizeRecode record);

    int updateByPrimaryKey(PartnerSummarizeRecode record);
}