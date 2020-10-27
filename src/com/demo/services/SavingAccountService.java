package com.demo.services;

import com.demo.bean.SavingAccount;

import java.util.Scanner;

public class SavingAccountService {
    static SavingAccount[] sarr;
    static {
        sarr = new SavingAccount[2];
    }
    static Scanner sc = new Scanner(System.in);
    public void acceptData(){
        for(int i = 0; i< sarr.length; i++){
            System.out.println("enter id");
            int id = sc.nextInt();
            System.out.println("enter name");
            String name = sc.next();
            System.out.println("enter balance");
            int balance = sc.nextInt();
            System.out.println("enter cheque book number");
            String cbn = sc.next();
            sarr[i] = new SavingAccount(id,name,balance,cbn);
        }
    }
    public void displayData(){
        for(int i = 0; i< sarr.length;i++){
            System.out.println(sarr[i]);
        }
    }
}
