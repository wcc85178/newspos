package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MrsAppConf;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MrsAppConfDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MrsAppConf record);

    int insertSelective(MrsAppConf record);

    MrsAppConf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MrsAppConf record);

    int updateByPrimaryKey(MrsAppConf record);
}