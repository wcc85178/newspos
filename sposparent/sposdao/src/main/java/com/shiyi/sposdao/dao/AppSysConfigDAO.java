package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.AppSysConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AppSysConfigDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AppSysConfig record);

    int insertSelective(AppSysConfig record);

    AppSysConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppSysConfig record);

    int updateByPrimaryKey(AppSysConfig record);
}