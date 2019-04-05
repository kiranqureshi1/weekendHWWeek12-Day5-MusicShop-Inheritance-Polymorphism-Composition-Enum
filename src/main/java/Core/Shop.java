package Core;

import Core.ISell;

import java.util.ArrayList;

public class Shop{
    private ArrayList<ISell> items;
    private double budget;

    public Shop(ArrayList items, double budget){
        this.items = items;
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

    public double getIncreasedBudget(double amount){
        return this.budget += amount;
    }

    public double getDecreasedBudget(double amount){
        return this.budget -= amount;
    }

    public void addItems(ISell guitar){
        this.items.add(guitar);
    }

    public void removeItem(ISell drumStick){
        this.items.remove(drumStick);
    }

    public int getItemsCount(){
        return this.items.size();
    }

    public double sell(ISell guitarString){
        this.removeItem(guitarString);
        this.getIncreasedBudget(guitarString.sell());
        return this.budget;
    }


    public double bought(ISell guitarString){
        this.addItems(guitarString);
        if(this.getBudget() >= guitarString.sell()){
            this.getDecreasedBudget(guitarString.bought());
        }
        return guitarString.bought();
    }


    public boolean itemSellableOrBuyable(){
        ArrayList<ISell> goodConditionItems = new ArrayList<>();
        for (ISell item : items){
            if(item.itemSellableOrBuyable() == true){
                goodConditionItems.add(item);
                return true;
            }
        }goodConditionItems.size();
        return false;
    }

}
