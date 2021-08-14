package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.AppVersion;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AppVersionDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AppVersion record);

    int insertSelective(AppVersion record);

    AppVersion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppVersion record);

    int updateByPrimaryKey(AppVersion record);
}