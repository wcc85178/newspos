package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpFunButtonMappingButtonConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpFunButtonMappingButtonConfigDAO {
    int insert(CpFunButtonMappingButtonConfig record);

    int insertSelective(CpFunButtonMappingButtonConfig record);
}