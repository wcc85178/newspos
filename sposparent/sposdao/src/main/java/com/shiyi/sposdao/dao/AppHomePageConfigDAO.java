package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.AppHomePageConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AppHomePageConfigDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AppHomePageConfig record);

    int insertSelective(AppHomePageConfig record);

    AppHomePageConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppHomePageConfig record);

    int updateByPrimaryKey(AppHomePageConfig record);
}