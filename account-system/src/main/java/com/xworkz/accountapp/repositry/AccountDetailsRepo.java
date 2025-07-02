package com.xworkz.accountapp.repositry;

import com.xworkz.accountapp.dto.AccountDetailsDto;

public interface AccountDetailsRepo {

    boolean saveAccountDetail(AccountDetailsDto dto);
}
