package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.QueryTrans;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QueryTransDAO {
    int insert(QueryTrans record);

    int insertSelective(QueryTrans record);
}