package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpFunButtonConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpFunButtonConfigDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CpFunButtonConfig record);

    int insertSelective(CpFunButtonConfig record);

    CpFunButtonConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpFunButtonConfig record);

    int updateByPrimaryKey(CpFunButtonConfig record);
}