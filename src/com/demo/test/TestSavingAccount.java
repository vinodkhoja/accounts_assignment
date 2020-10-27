package com.demo.test;

import com.demo.bean.SavingAccount;
import com.demo.services.SavingAccountService;

public class TestSavingAccount {
    public static void main(String[] args){
        SavingAccountService sas = new SavingAccountService();
        sas.acceptData();
        sas.displayData();
    }

}