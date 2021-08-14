package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MyCreditcard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MyCreditcardDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MyCreditcard record);

    int insertSelective(MyCreditcard record);

    MyCreditcard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MyCreditcard record);

    int updateByPrimaryKey(MyCreditcard record);
}