package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.ErrPic;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ErrPicDAO {
    int insert(ErrPic record);

    int insertSelective(ErrPic record);
}