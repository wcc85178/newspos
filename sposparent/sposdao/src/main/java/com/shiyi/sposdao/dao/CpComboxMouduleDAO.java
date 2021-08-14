package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpComboxMoudule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpComboxMouduleDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CpComboxMoudule record);

    int insertSelective(CpComboxMoudule record);

    CpComboxMoudule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpComboxMoudule record);

    int updateByPrimaryKey(CpComboxMoudule record);
}