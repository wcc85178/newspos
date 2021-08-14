package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.H5payEncryKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface H5payEncryKeyDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(H5payEncryKey record);

    int insertSelective(H5payEncryKey record);

    H5payEncryKey selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(H5payEncryKey record);

    int updateByPrimaryKeyWithBLOBs(H5payEncryKey record);

    int updateByPrimaryKey(H5payEncryKey record);
}