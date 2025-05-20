package com.pluralsight.finance;

public class BankAccount implements Valuable {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }
    @Override
    public double getValue(){
        return balance;

    }
    @Override
    public String toString(){
        return "BankAccount Balance: $" + balance;
    }
}
