package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CardBin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CardBinDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CardBin record);

    int insertSelective(CardBin record);

    CardBin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CardBin record);

    int updateByPrimaryKey(CardBin record);
}