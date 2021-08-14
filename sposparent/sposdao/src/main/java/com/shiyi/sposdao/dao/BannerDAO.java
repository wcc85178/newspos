package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Banner;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BannerDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Banner record);

    int insertSelective(Banner record);

    Banner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);
}