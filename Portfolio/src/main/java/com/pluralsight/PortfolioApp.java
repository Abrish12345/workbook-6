package com.pluralsight;

import com.pluralsight.finance.*;

public class PortfolioApp {
    public static void main(String[] args) {
        BankAccount bankAccount =new BankAccount(5000);
        House house = new House("The House", 300000);
        Gold gold =new Gold("My Gold",10000);
        Jewelry jewelry = new Jewelry("Ring",15000);
        CreditCard creditCard = new CreditCard(3000);

        //print each asset and its value
        System.out.println(bankAccount + " value: " + bankAccount.getValue());
        System.out.println(house + " value: " + house.getValue());
        System.out.println(gold + " value: " + gold.getValue());
        System.out.println(jewelry + " value: " + jewelry.getValue());
        System.out.println(creditCard + " value: " + creditCard.getValue());
    }
}
