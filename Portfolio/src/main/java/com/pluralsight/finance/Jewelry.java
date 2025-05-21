package com.pluralsight.finance;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double karat) {
        // assume market value is karat * 90
        super(name, karat * 90);
        this.karat = karat;
    }
    public double getKarat(){
        return karat;
    }
    public void setKarat(double karat){
        this.karat=karat;
    }
}
