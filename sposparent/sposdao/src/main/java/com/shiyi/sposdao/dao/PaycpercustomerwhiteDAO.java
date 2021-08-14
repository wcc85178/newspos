package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Paycpercustomerwhite;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PaycpercustomerwhiteDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Paycpercustomerwhite record);

    int insertSelective(Paycpercustomerwhite record);

    Paycpercustomerwhite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Paycpercustomerwhite record);

    int updateByPrimaryKey(Paycpercustomerwhite record);
}