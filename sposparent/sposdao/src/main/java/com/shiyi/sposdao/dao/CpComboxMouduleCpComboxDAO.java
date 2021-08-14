package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpComboxMouduleCpCombox;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpComboxMouduleCpComboxDAO {
    int deleteByPrimaryKey(Integer cpComboxId);

    int insert(CpComboxMouduleCpCombox record);

    int insertSelective(CpComboxMouduleCpCombox record);

    CpComboxMouduleCpCombox selectByPrimaryKey(Integer cpComboxId);

    int updateByPrimaryKeySelective(CpComboxMouduleCpCombox record);

    int updateByPrimaryKey(CpComboxMouduleCpCombox record);
}