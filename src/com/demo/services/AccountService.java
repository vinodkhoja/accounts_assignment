package com.demo.services;

import com.demo.bean.Account;
import com.demo.bean.CurrentAccount;
import com.demo.bean.SavingAccount;

import java.util.Scanner;

public class AccountService {
    static Account[] acc;
    static{
        acc = new Account[2];
        acc[0] = new SavingAccount(1, "vinod", 40000,"5555g");
        acc[1] = new CurrentAccount(2,"khoja", 400000, 0);
    }
    public static void withdrawAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type of account \n1.Saving account\n2.CurrentAccount");
        int type = sc.nextInt();
        System.out.println("provide the id of the account that you want to Withdraw");
        int id = sc.nextInt();
        Account ac = null;
        for(int i = 0; i <acc.length ; i++){
            if(type==1) {
                if (acc[i].getId() == id && acc[i] instanceof SavingAccount) ac = acc[i];
            }else{
                if (acc[i].getId() == id && acc[i] instanceof CurrentAccount) ac = acc[i];
            }
        }
        if (ac==null) {
            System.out.println("Account Not found");
        } else {
            System.out.println("Account found, please fill the amount:");
            int amount = sc.nextInt();
            ac.withdraw(amount);
        }
    }
    public static void depositAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type of account \n1.Saving account\n2.CurrentAccount");
        int type = sc.nextInt();
        System.out.println("provide the id of the account that you want to Deposit");
        int id = sc.nextInt();
        Account ac = null;
        for(int i = 0; i <acc.length ; i++){
            if(type==1) {
                if (acc[i].getId() == id && acc[i] instanceof SavingAccount) ac = acc[i];
            }else{
                if (acc[i].getId() == id && acc[i] instanceof CurrentAccount) ac = acc[i];
            }
        }
        if (ac==null) {
            System.out.println("Account Not found");
        } else {
            System.out.println("Account found, please fill the amount:");
            int amount = sc.nextInt();
            ac.deposit(amount);
        }
    }
}





//COde dump that can be used later
//public static void addAccount(int accountType) {
//    Scanner sc = new Scanner(System.in);
//    for (int i =0; i< acc.length; i++){
//        System.out.println("Enter id");
//        int id = sc.nextInt();
//        System.out.println("Enter Name");
//        String name = sc.next();
//        System.out.println("Enter balance");
//        int balance = sc.nextInt();
//        if(accountType == 1 /*that is saving*/){
//            System.out.println("Check book number:");
//            String cbn = sc.next();
//            acc[i] = new SavingAccount(id,name,balance ,cbn);
//        }
//        else{
//            acc[i] = new CurrentAccount(id,name,balance,0);
//        }
//    }
//}
//    public static void deleteAccount(int id) {
//        for(int i = 0; i<acc.length;i++){
//            if(acc[i].getId()==id){
//                acc[i]=null;
//                System.out.println("Account killed");
//                return;
//            }
//            else return;
//        }
//    }