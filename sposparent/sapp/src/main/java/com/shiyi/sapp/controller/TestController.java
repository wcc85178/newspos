package com.shiyi.sapp.controller;

import com.shiyi.sapp.service.TestService;
import com.shiyi.sposdao.entity.AccountWithdrawalRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/wcc")
    public String test()
    {
        AccountWithdrawalRecord accountWithdrawalRecord = testService.selectByPrimaryKey(1);
        return accountWithdrawalRecord.toString();
    }

}
