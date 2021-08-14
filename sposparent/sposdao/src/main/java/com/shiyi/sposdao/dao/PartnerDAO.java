package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Partner;
import com.shiyi.sposdao.entity.PartnerWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PartnerDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PartnerWithBLOBs record);

    int insertSelective(PartnerWithBLOBs record);

    PartnerWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PartnerWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PartnerWithBLOBs record);

    int updateByPrimaryKey(Partner record);
}