package com.xworkz.accountapp.service.impl;

import com.xworkz.accountapp.dto.AccountDetailsDto;
import com.xworkz.accountapp.repositry.AccountDetailsRepo;
import com.xworkz.accountapp.repositry.impl.AccountDetailsRepoImpl;
import com.xworkz.accountapp.service.AccountDetailService;

public class AccountDetailServiceImpl implements AccountDetailService {

    AccountDetailsRepo accountDetailsRepo;

    public AccountDetailServiceImpl(){
        accountDetailsRepo = new AccountDetailsRepoImpl();
    }

    @Override
    public boolean validateAndSave(AccountDetailsDto dto) {
        boolean isValidated = false;
        boolean isAccountIdValid = false;
        boolean isAccountHolderNameValid = false;
        boolean isAccountTypeValid = false;
        boolean isBranchValid = false;
        if(dto.getAccountId() != 0 ){
            isAccountIdValid = true;
        }
        if(dto.getAccountHolderName() != null && !dto.getAccountHolderName().isEmpty()){
            isAccountHolderNameValid = true;
        }
        if(dto.getAccountType() != null && !dto.getAccountType().isEmpty()){
            isAccountTypeValid = true;
        }
        if(dto.getBranch() != null && !dto.getBranch().isEmpty()){
            isBranchValid = true;
        }
        if(isAccountIdValid && isAccountHolderNameValid && isAccountTypeValid && isBranchValid){
            isValidated = accountDetailsRepo.saveAccountDetail(dto);
        }

        return isValidated ;
    }
}
