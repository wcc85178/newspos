package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.HsCoreTransLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface HsCoreTransLogDAO {
    int deleteByPrimaryKey(Long translogid);

    int insert(HsCoreTransLog record);

    int insertSelective(HsCoreTransLog record);

    HsCoreTransLog selectByPrimaryKey(Long translogid);

    int updateByPrimaryKeySelective(HsCoreTransLog record);

    int updateByPrimaryKey(HsCoreTransLog record);
}