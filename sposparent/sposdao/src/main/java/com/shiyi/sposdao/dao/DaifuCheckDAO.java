package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.DaifuCheck;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DaifuCheckDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(DaifuCheck record);

    int insertSelective(DaifuCheck record);

    DaifuCheck selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DaifuCheck record);

    int updateByPrimaryKey(DaifuCheck record);
}