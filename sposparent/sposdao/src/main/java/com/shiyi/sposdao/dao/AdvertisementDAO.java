package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Advertisement;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdvertisementDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Advertisement record);

    int insertSelective(Advertisement record);

    Advertisement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Advertisement record);

    int updateByPrimaryKey(Advertisement record);
}