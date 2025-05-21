package com.pluralsight.finance;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedroom;

    public House(int yearBuilt, int squareFeet, int bedrooms) {
        // assume $150/sqft as marketValue
        super("House", squareFeet * 150);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedroom = bedrooms;
    }

    public House(String name, double marketValue) {
        super(name, marketValue);
    }


    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }
}
