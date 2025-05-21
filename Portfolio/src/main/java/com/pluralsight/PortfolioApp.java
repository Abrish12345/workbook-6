package com.pluralsight;

import com.pluralsight.finance.*;

import java.util.ArrayList;

public class PortfolioApp {
    public static void main(String[] args) {
        BankAccount bankAccount =new BankAccount(5000);
        House house = new House("The House", 300000);
        Gold gold =new Gold(10000);
        Jewelry jewelry = new Jewelry("Ring",15000);
        CreditCard creditCard = new CreditCard(3000);

        //print each asset and its value
        System.out.println(bankAccount + " value: " + bankAccount.getValue());
        System.out.println(house + " value: " + house.getValue());
        System.out.println(gold + " value: " + gold.getValue());
        System.out.println(jewelry + " value: " + jewelry.getValue());
        System.out.println(creditCard + " value: " + creditCard.getValue());


        //create a portfolio
        Portfolio portfolio = new Portfolio("My portfolio","Abraham",new ArrayList<>());

        //add assets
        portfolio.add(new BankAccount(5000));
        portfolio.add(new Gold(6000));
        portfolio.add(new CreditCard(-3000));

        //print total value
        System.out.println("Total Net Worth: $" + portfolio.getValue());

        //print most valuable asset
        System.out.println("Most Valuable: " + portfolio.getMostValuable());

        //print least valuable asset
        System.out.println("Least Valuable: " + portfolio.getLeastValuable());

    }
}
