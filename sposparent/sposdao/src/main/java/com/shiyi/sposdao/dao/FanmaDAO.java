package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Fanma;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface FanmaDAO {
    int insert(Fanma record);

    int insertSelective(Fanma record);
}