package Accessories;

public class DrumStick extends Accessory{
    private int additionalCost;

    public DrumStick(double boughtPrice, double amountOfWorkPutIntoInScore3, boolean conditionGood, int additionalCost){
        super(boughtPrice, amountOfWorkPutIntoInScore3,conditionGood);
        this.additionalCost = additionalCost;
    }

    public int getAdditionalCost(){
        return this.additionalCost;
    }

    public double sell(){
        return this.price() + this.additionalCost;
    }


}
