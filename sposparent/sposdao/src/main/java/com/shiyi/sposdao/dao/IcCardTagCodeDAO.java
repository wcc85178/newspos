package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.IcCardTagCode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IcCardTagCodeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(IcCardTagCode record);

    int insertSelective(IcCardTagCode record);

    IcCardTagCode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IcCardTagCode record);

    int updateByPrimaryKey(IcCardTagCode record);
}