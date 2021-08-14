package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.QrcodeRate;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QrcodeRateDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(QrcodeRate record);

    int insertSelective(QrcodeRate record);

    QrcodeRate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QrcodeRate record);

    int updateByPrimaryKey(QrcodeRate record);
}