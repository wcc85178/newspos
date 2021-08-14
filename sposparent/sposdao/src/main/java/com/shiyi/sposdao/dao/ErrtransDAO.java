package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Errtrans;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ErrtransDAO {
    int insert(Errtrans record);

    int insertSelective(Errtrans record);
}