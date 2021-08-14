package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Partnerposdownresult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PartnerposdownresultDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Partnerposdownresult record);

    int insertSelective(Partnerposdownresult record);

    Partnerposdownresult selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Partnerposdownresult record);

    int updateByPrimaryKey(Partnerposdownresult record);
}