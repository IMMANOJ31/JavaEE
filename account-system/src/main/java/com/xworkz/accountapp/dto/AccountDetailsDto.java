package com.xworkz.accountapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDetailsDto {

    private int accountId;
    private String accountHolderName;
    private String accountType;
    private String branch;

}
