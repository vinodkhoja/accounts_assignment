package com.demo.bean;
public class CurrentAccount extends Account{
    static int minBal = 0;
    static int interestRate = 1;
    public int transactions;
    public CurrentAccount(){
        super();
        this.transactions = 0;
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

    @Override
    public void deposit(int amount) {
        this.setBalance(this.getBalance() + amount);
        System.out.println("amount successfully deposited.");
        System.out.println("New balance :" + this.getBalance());
    }

    public CurrentAccount(int id , String name, int balance, int transactions){
        super(id,name,balance);
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMinimum balance:"+ this.minBal + "\nInterest Rate: "+ this.interestRate + "\nnumber of transactions :" + this.transactions ;
    }

}
