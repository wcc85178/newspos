package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpOtherInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpOtherInfoDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CpOtherInfo record);

    int insertSelective(CpOtherInfo record);

    CpOtherInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpOtherInfo record);

    int updateByPrimaryKey(CpOtherInfo record);
}