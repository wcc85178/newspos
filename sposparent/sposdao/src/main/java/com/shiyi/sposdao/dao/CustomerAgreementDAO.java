package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerAgreement;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerAgreementDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAgreement record);

    int insertSelective(CustomerAgreement record);

    CustomerAgreement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerAgreement record);

    int updateByPrimaryKey(CustomerAgreement record);
}