package com.xworkz.accountapp;

import com.xworkz.accountapp.dto.AccountDetailsDto;
import com.xworkz.accountapp.service.AccountDetailService;
import com.xworkz.accountapp.service.impl.AccountDetailServiceImpl;

public class AccountRunner {

    static AccountDetailService accountDetailService;
    public static void main(String[] args) {

        AccountDetailsDto dto = new AccountDetailsDto();

        dto.setAccountId(1);
        dto.setAccountHolderName("Malli");
        dto.setAccountType("Savings");
        dto.setBranch("Rajajinagar");

        accountDetailService = new AccountDetailServiceImpl();
        accountDetailService.validateAndSave(dto);

        System.out.println("Account Details added!");
    }
}
