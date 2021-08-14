package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.AppConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AppConfigDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AppConfig record);

    int insertSelective(AppConfig record);

    AppConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppConfig record);

    int updateByPrimaryKey(AppConfig record);
}