package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MccJump;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MccJumpDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MccJump record);

    int insertSelective(MccJump record);

    MccJump selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MccJump record);

    int updateByPrimaryKey(MccJump record);
}