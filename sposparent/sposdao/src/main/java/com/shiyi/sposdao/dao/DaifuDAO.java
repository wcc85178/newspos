package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Daifu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DaifuDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Daifu record);

    int insertSelective(Daifu record);

    Daifu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Daifu record);

    int updateByPrimaryKey(Daifu record);
}