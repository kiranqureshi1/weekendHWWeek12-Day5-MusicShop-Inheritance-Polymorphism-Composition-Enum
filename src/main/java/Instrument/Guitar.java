package Instrument;

public class Guitar extends Instrument{
    private int numOfStrings;
    private int numberOfStringAdded;
    private int pricePerString;

    public Guitar(String color, Item type, String material, double materialPrice, double amountOfWorkPutInto, boolean conditionGood, int numberOfStrings, int numberOfStringAdded, int pricePerString){
        super(color, type, material,materialPrice, amountOfWorkPutInto, conditionGood);
        this.numOfStrings = numberOfStrings;
        this.numberOfStringAdded = numberOfStringAdded;
        this.pricePerString = pricePerString;

    }

    public int getNumOfStrings(){
        return this.numOfStrings;
    }

    public int getNumberOfStringAdded(){
        return this.numberOfStringAdded;
    }

    public double getPricePerString(){
        return this.pricePerString;
    }

    public  String play(Guitar guitar){
        return "I like" + guitar;
    }

    public double sell(){
        return this.price() * numberOfStringAdded * pricePerString;
    }
}
