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
public class Beer extends Drink{
    private String brand;
    private double pricePerUnit;
    private Liquid liquid;

    //Constructor

    /**
     ** @Obvious
     * used to create an new beer object
     * @param name name of the beer
     * @param brand name of the beer brand
     * @param liquid liquid object of the beer
     * @param pricePerUnit price per ml
     */
    Beer(String name, String brand, Liquid liquid, double pricePerUnit){
        super(name);
        this.brand = brand;
        this.liquid = liquid;
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
        return this.liquid.getName();
    }

    /**
     * @Obvious
     * returnes the fill level of the container in ml
     * @return fill level of the container as double
     */
    @Override
    public double getVolume(){
        return this.liquid.getVolume();
    }

    /**
     * @Obvious
     * returnes the alcohol content in percent
     * @return  the alcohol content in percent as double
     */
    @Override
    public double getAlcoholPercent(){
        return this.liquid.getAlcoholPercent();
    }

    /**
     * @Obvious
     * returnes if the beer is alcoholic
     * @return if beer is alcoholic as boolean
     */
    @Override
    public boolean isAlcoholic(){
        if(getAlcoholPercent() < 0.5){
            return false;
        } else {
            return true;
        }
    }

    /**
     * @Obvious
     * calculates the price of the beer
     * @return price of actual beer
     */
    @Override
    public double calculatePrice() {
        return this.getVolume() * this.getPricePerUnit();
    }


    //Functions

    /**
     * Reduces the fill level of the actual object by 40 ml.
     * is supposed to represent the drinking of a sip
     */
    public void takeASip(){
        this.liquid.setVolume(getVolume() - 40);
    }

    /**
     * returns a sentence that sums up the most important characteristics of the beer.
     * @return a sum up of the beer as String
     */
    public String toString() {
    	return "This is a beer called " + brand +" "+getType().toString() +" with " + this.getAlcoholPercent() + " percent alcohol by volume";
    }

    /**
     * sets price per ml
     * @param price price per ml
     */
    @Override
    public void setPricePerUnit(double price) {
        this.pricePerUnit = price;
    }

    /**
     * @Obvious
     * get price per ml
     * @return price per ml
     */
    @Override
    public double getPricePerUnit() {
        return this.pricePerUnit;
    }

    /**
     * represents one sale
     * @param seller a stuff member that sells the beer
     * @return a Sale-object to add to list of sales
     */
    @Override
    public Sale sell(Staff seller) {
        Sale actualSale = new Sale(new Date(System.currentTimeMillis()), this, seller);
        actualSale.addToList();

        return  actualSale;
    }
}