package Accessories;

import Core.ISell;

public class GuitarString extends Accessory implements ISell {
    private int addShine;

    public GuitarString(double boughtPrice, double amountOfWorkPutIntoInScore3, boolean conditionGood, int addShine){
        super(boughtPrice, amountOfWorkPutIntoInScore3,conditionGood);
        this.addShine = addShine;
    }

    public int getAddShine(){
        return this.addShine;
    }

    public double sell(){
        return this.price() + this.addShine;
    }
}
