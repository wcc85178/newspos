package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PosSectionLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosSectionLogDAO {
    int deleteByPrimaryKey(Integer sectionId);

    int insert(PosSectionLog record);

    int insertSelective(PosSectionLog record);

    PosSectionLog selectByPrimaryKey(Integer sectionId);

    int updateByPrimaryKeySelective(PosSectionLog record);

    int updateByPrimaryKey(PosSectionLog record);
}