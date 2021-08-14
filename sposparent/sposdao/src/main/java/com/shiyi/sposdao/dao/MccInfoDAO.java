package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MccInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MccInfoDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MccInfo record);

    int insertSelective(MccInfo record);

    MccInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MccInfo record);

    int updateByPrimaryKey(MccInfo record);
}