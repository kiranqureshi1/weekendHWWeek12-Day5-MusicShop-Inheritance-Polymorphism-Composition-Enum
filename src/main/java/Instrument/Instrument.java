package Instrument;

import Core.ISell;

public abstract class Instrument implements IPlay, ISell {
    protected String color;
    protected Item type;
    protected String material;
    protected double materialPrice;
    protected double amountOfWorkPutIntoInScore3;
    protected boolean conditionGood;

    public Instrument(String color, Item type, String material, double materialPrice, double amountOfWorkPutIntoInScore3, boolean conditionGood){
        this.color = color;
        this.type = type;
        this.material = material;
        this.amountOfWorkPutIntoInScore3 = amountOfWorkPutIntoInScore3;
        this.materialPrice = materialPrice;
        this.conditionGood = conditionGood;
    }

    public String getcolor(){
        return this.color;
    }

    public Item getType(){
        return this.type;
    }

    public String getMaterial(){
        return this.material;
    }

    public double sell(){
        return this.price();
    }

    public double getAmountOfWorkPutInto(){
        return this.amountOfWorkPutIntoInScore3;
    }

    public double getMaterialPrice(){
        return this.materialPrice;
    }

    public boolean getConditionGood(){
        return this.conditionGood;
    }

    public String play(String instrument){
        return "I love " + instrument;
    }

    public double price(){
        return this.amountOfWorkPutIntoInScore3 * materialPrice;
    }


    public double bought(){
        return materialPrice;
    }


    public boolean itemSellableOrBuyable(){
        if (conditionGood == true){
            return true;
        }return false;
    }



}
