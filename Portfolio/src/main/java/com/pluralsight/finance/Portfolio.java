package com.pluralsight.finance;

import java.util.List;
public class Portfolio {
    String name;
    String owner;
    //List to store all assets that implement valuable interface /bank account,fixed asset.../
    private List<Valuable> assets;

    //constructor
    public Portfolio(String name, String owner, List<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }
    //method to add a new asset to the portfolio

    public void add(Valuable asset){
        assets.add(asset); //add the given asset to the list
    }

    //methods to calculate total net value of all assets
    public double getValue() {
        double total = 0;
        for (Valuable asset : assets) {
            total += asset.getValue();  //add up each asset's value
        }
        return total;
    }

    //methods to find the asset with the highest value
    public Valuable getMostValuable() {
        if (assets == null || assets.isEmpty()) return null;  //handle if no assets

        Valuable mostValuable = assets.get(0); //start by assuming the first asset is the most valuable

        for (Valuable asset : assets) {
            if (asset.getValue() > mostValuable.getValue()) {
                mostValuable = asset; //UPDATE IF THE CURRENT ASSET HAS HIGHER VALUE
            }
        }
        return mostValuable;
    }

    //methods to calculate the assets with the least value
    public Valuable getLeastValuable() {
        if (assets == null || assets.isEmpty()) return null; //HANDLE IF NO ASSETS

        Valuable leastValuable = assets.get(0); //START BY ASSUMING THE FIRST ASSET IS THE LEAST VALUE

        for (Valuable asset : assets) {
            if (asset.getValue() < leastValuable.getValue()) {
                leastValuable = asset; //UPDATE IF CURRENT ASSET HAS LOWER VALUE
            }

        }
        return leastValuable;

    }
}
