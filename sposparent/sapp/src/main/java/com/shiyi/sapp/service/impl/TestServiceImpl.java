package com.shiyi.sapp.service.impl;

import com.shiyi.sapp.service.TestService;
import com.shiyi.sposdao.dao.AccountWithdrawalRecordDAO;
import com.shiyi.sposdao.entity.AccountWithdrawalRecord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {
    @Resource
    private AccountWithdrawalRecordDAO accountWithdrawalRecordDAO;

    @Override
    public AccountWithdrawalRecord selectByPrimaryKey(Integer id) {
        return accountWithdrawalRecordDAO.selectByPrimaryKey(id);
    }
}
