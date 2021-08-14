package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpTreePackage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpTreePackageDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CpTreePackage record);

    int insertSelective(CpTreePackage record);

    CpTreePackage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpTreePackage record);

    int updateByPrimaryKey(CpTreePackage record);
}