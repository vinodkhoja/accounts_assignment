package com.demo.test;

import com.demo.bean.Account;
import com.demo.services.AccountService;

import java.util.Scanner;

public class TestAccountArray {
    public static void main(String[] args) {
        int choice;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Add Account /n2.Close Account /n3.Withdrawal /n4.Deposit /n5.Check balance");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Functionality not needed");
                    break;
                case 2:
                    System.out.println("functionality not yet needed");
                    break;
                case 3:
                    AccountService.withdrawAmount();
                    break;
                case 4:
                    AccountService.depositAmount();
                    break;
                case 5:
                    System.out.println("functionality not yet neededddd");
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while(choice!=6);
    }
}
