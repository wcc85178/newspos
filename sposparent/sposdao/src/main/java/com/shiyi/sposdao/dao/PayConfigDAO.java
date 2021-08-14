package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayConfigDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayConfig record);

    int insertSelective(PayConfig record);

    PayConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayConfig record);

    int updateByPrimaryKey(PayConfig record);
}