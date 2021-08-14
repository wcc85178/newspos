package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.HibernateSequence;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface HibernateSequenceDAO {
    int insert(HibernateSequence record);

    int insertSelective(HibernateSequence record);
}