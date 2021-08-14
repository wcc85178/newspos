package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpTreePackageCpTree;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpTreePackageCpTreeDAO {
    int insert(CpTreePackageCpTree record);

    int insertSelective(CpTreePackageCpTree record);
}