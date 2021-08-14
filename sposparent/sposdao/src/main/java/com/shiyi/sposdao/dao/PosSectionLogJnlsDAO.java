package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PosSectionLogJnls;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosSectionLogJnlsDAO {
    int deleteByPrimaryKey(String ksn);

    int insert(PosSectionLogJnls record);

    int insertSelective(PosSectionLogJnls record);

    PosSectionLogJnls selectByPrimaryKey(String ksn);

    int updateByPrimaryKeySelective(PosSectionLogJnls record);

    int updateByPrimaryKey(PosSectionLogJnls record);
}