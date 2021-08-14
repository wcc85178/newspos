package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.EmpPosSign;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EmpPosSignDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(EmpPosSign record);

    int insertSelective(EmpPosSign record);

    EmpPosSign selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmpPosSign record);

    int updateByPrimaryKey(EmpPosSign record);
}