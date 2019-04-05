package Accessories;

import Core.ISell;
import Instrument.IPlay;

public abstract class Accessory implements ISell {
    protected double boughtPrice;
    protected double amountOfWorkPutIntoInScore3;
    protected boolean conditionGood;

    public Accessory(double boughtPrice, double amountOfWorkPutIntoInScore3, boolean conditionGood){
        this.boughtPrice = boughtPrice;
        this.amountOfWorkPutIntoInScore3 = amountOfWorkPutIntoInScore3;
        this.conditionGood = conditionGood;
    }

    public double getAmountOfWorkPutIntoInScore3(){
        return this.amountOfWorkPutIntoInScore3;
    }

    public boolean getConditionGood(){
        return this.conditionGood;
    }

    public double price(){
        return this.boughtPrice * this.amountOfWorkPutIntoInScore3;
    }

    public double sell(){
        return this.price();
    }
    public double bought(){
        return this.boughtPrice;
    }

    public boolean itemSellableOrBuyable(){
        if( conditionGood == true){
            return true;
        }return false;
    }
}
