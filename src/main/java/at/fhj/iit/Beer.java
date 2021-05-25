package at.fhj.iit;

import java.util.Date;

/**
 * The beer class implements an object that symbols a beer and its attributes.
 * It is derived from the drink class.
 *
 * It provides the functionality of taking a sip of your beer and get and set the attributes of the object.
 * @author Philip Moser
 * @version 1.5
 * @since 23.04.2021
 */
public class Beer extends Drink implements Sellable{
    private String brand;
    private String type;
    private int volume;
    private double alcoholPercent;
    private double pricePerUnit;

    //Constructor

    /**
     * @Obvious
     * creates a new instance of beer object
     * @param name  the name of the beer
     * @param brand the name of the brand/brewery
     * @param type  the type of the beer, eg. Märzen, Lager, RedAle,....
     * @param volume the fill level of the bottle/glass/can/... in ml
     * @param alcoholPercent the alcohol content in percent
     */
    Beer(String name,String brand, String type, int volume, double alcoholPercent,double pricePerUnit){
    	super(name);
        this.brand = brand;
        this.type = type;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
        this.pricePerUnit = pricePerUnit;
    }

    //Getter
    /**
     * @Obvious
     * returns Name of the brand/brewery
     * @return the name of the brand/brewery as String
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @Obvious
     * returns the type of beer. e.g.: Märzen, Lager, RedAle,....
     * @return the type of beer as String
     */
    public String getType() {
        return type;
    }

    /**
     * @Obvious
     * returnes the fill level of the container in ml
     * @return fill level of the container as double
     */
    @Override
    public double getVolume(){
        return this.volume;
    }

    /**
     * @Obvious
     * returnes the alcohol content in percent
     * @return  the alcohol content in percent as double
     */
    @Override
    public double getAlcoholPercent(){
        return this.alcoholPercent;
    }

    /**
     * @Obvious
     * returnes if the beer is alcoholic
     * @return if beer is alcoholic as boolean
     */
    @Override
    public boolean isAlcoholic(){
        if(this.alcoholPercent < 0.5){
            return false;
        } else {
            return true;
        }
    }


    //Functions

    /**
     * Reduces the fill level of the actual object by 40 ml.
     * is supposed to represent the drinking of a sip
     */
    public void takeASip(){
        this.volume = this.volume - 40;
    }

    /**
     * returns a sentence that sums up the most important characteristics of the beer.
     * @return a sum up of the beer as String
     */
    public String toString() {
    	return "This is a beer called " + brand +" "+type + " with " + this.getAlcoholPercent() + " percent alcohol by volume";
    }


    @Override
    public void setPricePerUnit(double price) {
        this.pricePerUnit = price;
    }

    @Override
    public double getPricePerUnit() {
        return this.pricePerUnit;
    }

    @Override
    public Sale sell(Staff seller, int tablenumber) {

        Sale actualSale = new Sale(new Date(System.currentTimeMillis()), this, seller);
        actualSale.addToList();
        return null;
    }
}