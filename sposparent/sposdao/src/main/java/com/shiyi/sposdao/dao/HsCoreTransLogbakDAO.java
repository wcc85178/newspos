package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.HsCoreTransLogbak;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface HsCoreTransLogbakDAO {
    int deleteByPrimaryKey(Long translogid);

    int insert(HsCoreTransLogbak record);

    int insertSelective(HsCoreTransLogbak record);

    HsCoreTransLogbak selectByPrimaryKey(Long translogid);

    int updateByPrimaryKeySelective(HsCoreTransLogbak record);

    int updateByPrimaryKey(HsCoreTransLogbak record);
}