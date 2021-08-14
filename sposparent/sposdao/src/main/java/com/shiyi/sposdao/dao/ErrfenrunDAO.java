package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Errfenrun;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ErrfenrunDAO {
    int insert(Errfenrun record);

    int insertSelective(Errfenrun record);
}