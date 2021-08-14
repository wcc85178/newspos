package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpLoginuser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpLoginuserDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CpLoginuser record);

    int insertSelective(CpLoginuser record);

    CpLoginuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpLoginuser record);

    int updateByPrimaryKey(CpLoginuser record);
}