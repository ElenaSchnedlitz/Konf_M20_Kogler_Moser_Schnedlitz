package at.fhj.iit;

import java.util.Date;

/**
 * Makes Gin Drink
 * @Author Tobias Kogler
 * @see Drink
 * @version 1.5
 * @since 24.4.2021
 */
public class Gin extends Drink {
    private String brand;
//    private double volume;
//    private double alcoholPercent;
    private double pricePerUnit;
    private Liquid liquid;

    //Constructor
    /**
     * @obvious
     * used to create a new gin object
     * @param name name of the gin
     * @param brand brand of the gin
     * @param liquid liquid object of the gin
     * @param pricePerUnit price per ml
     */
    Gin(String name, String brand, Liquid liquid, double pricePerUnit){
        super(name);
        this.brand = brand;
        this.liquid = liquid;
        this.pricePerUnit = pricePerUnit;
    }

    //Getter

    /**
     * @obvious
     * @return name of brand as string
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @obvious
     * @return the volume as double
     */
    @Override
    public double getVolume(){
        return this.liquid.getVolume();
    }

    /**
     *
     * @return alcoholpercentage as double
     */
    @Override
    public double getAlcoholPercent(){
        return this.liquid.getAlcoholPercent();
    }

    /**
     * @obvious
     * @return if si with alcohol or not as boolean
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
     * calculates the price of a glass of gin
     * @return price of actual glass of gin
     */
    @Override
    public double calculatePrice() {
        return this.getVolume() * this.getPricePerUnit();
    }

    /**
     * @takeASip reduces the volume by 1
     */
    //Functions
    public void takeASip(){
        this.liquid.setVolume(getVolume() - 5);
    }

    /**
     *
     * @return returns brand and Alcoholpercentage as String
     */
    public String toString() {
        return "This Gin is called " + brand +" with " + this.getAlcoholPercent() + " percent alcohol by volume";
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
