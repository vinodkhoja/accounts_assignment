package com.demo.bean;

public class SavingAccount extends Account{
    static public int minBal = 25000;
    static public int interestRate = 4;
    String chequeBookNumber;
    public SavingAccount(int id, String name, int balance){
        super();
    }

    public SavingAccount(int id , String name, int balance, String cbn){
        super(id,name,balance);
        this.chequeBookNumber = cbn;
    }
    @Override
    public boolean withdraw(int amount) {
        if(this.getBalance() - amount < minBal){
            System.out.println("Insufficient balance");
            return false;
        }
        else {
            this.setBalance(this.getBalance()-amount);
            System.out.println("Withdrawal successful");
            return true;
        }
    }
    public void deposit(int amount){
        this.setBalance(this.getBalance() + amount);
        System.out.println("amount successfully deposited.");
        System.out.println("New balance :" + this.getBalance());
    }
    @Override
    public String toString() {
        return super.toString() + "\nMinimum balance:"+ this.minBal + "\nInterest Rate: "+ this.interestRate + "\nchequeBookNumber :" + this.chequeBookNumber;
    }
}
