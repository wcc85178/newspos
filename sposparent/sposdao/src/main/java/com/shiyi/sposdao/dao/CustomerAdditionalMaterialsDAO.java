package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerAdditionalMaterials;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerAdditionalMaterialsDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAdditionalMaterials record);

    int insertSelective(CustomerAdditionalMaterials record);

    CustomerAdditionalMaterials selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerAdditionalMaterials record);

    int updateByPrimaryKey(CustomerAdditionalMaterials record);
}