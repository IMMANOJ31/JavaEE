package com.xworkz.accountapp.repositry.impl;

import com.xworkz.accountapp.dto.AccountDetailsDto;
import com.xworkz.accountapp.repositry.AccountDetailsRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDetailsRepoImpl implements AccountDetailsRepo {
    @Override
    public boolean saveAccountDetail(AccountDetailsDto dto) {
        boolean isAccountSaved = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration","root","Rajashree@31");
            Statement statement = conn.createStatement();
            int noOfRowsAffected  = statement.executeUpdate("insert into account_details (account_id, account_holder_name, account_type, branch) values ("
                    +"'"+dto.getAccountId()+"',"+
                    "'"+dto.getAccountHolderName()+"'," +
                    "'"+dto.getAccountType()+"'," +
                    "'"+dto.getBranch()+"')");

            if(noOfRowsAffected > 0) {
                isAccountSaved = true;
            }
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }

        System.out.println(dto);

        return isAccountSaved;
    }
}
