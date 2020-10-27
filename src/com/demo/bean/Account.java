package com.demo.bean;

public abstract class Account {
    private int id;
    private String name;
    private int balance;
    public Account(){
        this.id = 0;
        this.name = null;
        this.balance = 0;
    }
    public Account(int id , String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    abstract public boolean withdraw(int amount);
    abstract public void  deposit(int amount);
    @Override
    public String toString() {
        return "id=" + id +
                "\nname='" + name +
                ",\nbalance=" + balance
                ;
    }
}
