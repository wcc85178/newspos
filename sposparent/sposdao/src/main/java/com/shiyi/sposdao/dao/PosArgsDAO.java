package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PosArgs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosArgsDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PosArgs record);

    int insertSelective(PosArgs record);

    PosArgs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PosArgs record);

    int updateByPrimaryKey(PosArgs record);
}