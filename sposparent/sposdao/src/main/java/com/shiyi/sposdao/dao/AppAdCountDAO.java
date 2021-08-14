package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.AppAdCount;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AppAdCountDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AppAdCount record);

    int insertSelective(AppAdCount record);

    AppAdCount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppAdCount record);

    int updateByPrimaryKey(AppAdCount record);
}