package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpCombox;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpComboxDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CpCombox record);

    int insertSelective(CpCombox record);

    CpCombox selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpCombox record);

    int updateByPrimaryKey(CpCombox record);
}