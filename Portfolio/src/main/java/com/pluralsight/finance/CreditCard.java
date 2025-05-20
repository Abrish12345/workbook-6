package com.pluralsight.finance;

public class CreditCard implements Valuable {
    private double debtAmount;

    public CreditCard(double debtAmount){
        this.debtAmount = debtAmount;
    }
    @Override
    public double getValue(){
        //Negative amount to represent debt
         //
        return -debtAmount;
    }
    @Override
    public String toString(){
        return "CreditCard - owed: $" + -debtAmount;
    }
}
