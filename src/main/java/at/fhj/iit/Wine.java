package at.fhj.iit;

import java.util.Date;

/**
 * Wine is an addition to the main Class Drink
 * delivers Information and details in form of Strings about an wine object
 *
 * @author Elena Schnedlitz
 * @version 1.5
 * @since 21.04.2021
 */

public class Wine extends Drink {
    private String brand;
//    private String type;
//    private double volume;
//    private double alcoholPercent;
    private double pricePerUnit;
    private Liquid liquid;

    //Constructor
    /**
     * @Obvious
     * used to create an new wine object
     * @param name name of the wine
     * @param brand what brand is the wine
     * @param liquid liquid object of the wine
     * @param pricePerUnit price per ml
     */
    Wine(String name, String brand, Liquid liquid, double pricePerUnit){
        super(name);
        this.brand = brand;
        this.liquid = liquid;
        this.pricePerUnit = pricePerUnit;
    }

    //Getter

    /**
     * @Obvoius
     * returns the brand that was given for a wine object
     * @return brand as a String
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @Obvoius
     * return the type of an wine object
     * @return type as a String
     */
    public String getType() {
        return this.liquid.getName();
    }

    //@Override

    /**
     * @Obvoius
     * returns the volume of an wine bottle of a given wine
     * @return volume as double
     */
    public double getVolume(){
        return this.liquid.getVolume();
    }

    //@Override

    /**
     * @Obvoius
     * return the alcohol percentage of a bottle of the given wine
     * @return alcohol percentage as double
     */
    public double getAlcoholPercent(){
        return this.liquid.getAlcoholPercent();
    }

    //@Override

    /**
     * @Obvoius
     * returns true if the given wine has an higher alcohol percentage then 0.5 per mille
     * @return true if the accusation is correct, else false
     */
    public boolean isAlcoholic(){
        if(getAlcoholPercent() < 0.5){
            return false;
        } else {
            return true;
        }
    }

    /**
     * @Obvious
     * calculates the price of a glass of wine
     * @return price of actual glass of wine
     */
    @Override
    public double calculatePrice() {
        return this.getVolume() * this.getPricePerUnit();
    }

    //Functions

    /**
     * function that visualizes a sip that has been taken by a person
     */
    public void takeASip(){
        this.liquid.setVolume(getVolume() - 40);
    }

    /**
     * transform the given pieces of information into a string
     * @return contains the information about an wine object
     */
    public String toString() {
        return "This is a wine called " + brand +" "+getType().toString() + " with " + this.getAlcoholPercent() + " percent alcohol by volume";
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
