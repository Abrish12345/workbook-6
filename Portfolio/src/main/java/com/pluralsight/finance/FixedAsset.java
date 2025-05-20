package com.pluralsight.finance;

public class FixedAsset implements Valuable {

    private String name;
    private double marketValue;
    //constructor

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    @Override
    public double getValue() {

        return marketValue;
    }
    @Override
    public String toString(){
        return "FixedAsset " + name + ": $" + marketValue;
    }
}
