package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Operationlog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OperationlogDAO {
    int insert(Operationlog record);

    int insertSelective(Operationlog record);
}