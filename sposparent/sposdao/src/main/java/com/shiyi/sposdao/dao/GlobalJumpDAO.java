package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.GlobalJump;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GlobalJumpDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(GlobalJump record);

    int insertSelective(GlobalJump record);

    GlobalJump selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GlobalJump record);

    int updateByPrimaryKey(GlobalJump record);
}