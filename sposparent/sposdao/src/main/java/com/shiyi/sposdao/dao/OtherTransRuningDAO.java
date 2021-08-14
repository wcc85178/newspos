package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.OtherTransRuning;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OtherTransRuningDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(OtherTransRuning record);

    int insertSelective(OtherTransRuning record);

    OtherTransRuning selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OtherTransRuning record);

    int updateByPrimaryKey(OtherTransRuning record);
}