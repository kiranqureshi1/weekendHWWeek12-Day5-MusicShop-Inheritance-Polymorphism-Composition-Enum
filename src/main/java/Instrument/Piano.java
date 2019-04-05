package Instrument;

public class Piano extends Instrument{
    private double amountOfPaintUsedToPaint;
    private double pricePaintPerLiter;

    public Piano(String color, Item type, String material, double materialPrice, double amountOfWorkPutIntoInScore3, boolean conditionGood, double amountOfPaintUsedToPaint, double pricePaintPerLiter){
        super(color, type, material, materialPrice,amountOfWorkPutIntoInScore3, conditionGood);
        this.amountOfPaintUsedToPaint = amountOfPaintUsedToPaint;
        this.pricePaintPerLiter = pricePaintPerLiter;
    }

    public double getAmountofPaintUsedToPaint(){
        return this.amountOfPaintUsedToPaint;
    }

    public double getPricePaintPerLiter(){
        return this.pricePaintPerLiter;
    }

    public String play(String piano){
        return "I love " + piano;
    }

    public double sell(){
        return this.price() + amountOfPaintUsedToPaint * pricePaintPerLiter;
    }




}
