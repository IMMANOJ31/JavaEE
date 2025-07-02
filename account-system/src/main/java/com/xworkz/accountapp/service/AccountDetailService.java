package com.xworkz.accountapp.service;

import com.xworkz.accountapp.dto.AccountDetailsDto;

public interface AccountDetailService {

    boolean validateAndSave(AccountDetailsDto dto);
}
