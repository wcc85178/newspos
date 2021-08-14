package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CardAuthConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CardAuthConfigDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CardAuthConfig record);

    int insertSelective(CardAuthConfig record);

    CardAuthConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CardAuthConfig record);

    int updateByPrimaryKey(CardAuthConfig record);
}