package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpFunctionMetaBill;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpFunctionMetaBillDAO {
    int deleteByPrimaryKey(Integer metaBillId);

    int insert(CpFunctionMetaBill record);

    int insertSelective(CpFunctionMetaBill record);

    CpFunctionMetaBill selectByPrimaryKey(Integer metaBillId);

    int updateByPrimaryKeySelective(CpFunctionMetaBill record);

    int updateByPrimaryKey(CpFunctionMetaBill record);
}