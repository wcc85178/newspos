package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MrsAgent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MrsAgentDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MrsAgent record);

    int insertSelective(MrsAgent record);

    MrsAgent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MrsAgent record);

    int updateByPrimaryKey(MrsAgent record);
}