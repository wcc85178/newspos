package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.AccountWithdrawalRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AccountWithdrawalRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AccountWithdrawalRecord record);

    int insertSelective(AccountWithdrawalRecord record);

    AccountWithdrawalRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AccountWithdrawalRecord record);

    int updateByPrimaryKey(AccountWithdrawalRecord record);
}