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
    private double volume;
    private double alcoholPercent;
    private double pricePerUnit;

    //Constructor

    /**
     * @obvious
     * used to create a new gin object
     * @param name name of the gin
     * @param brand brand of the gin
     * @param volume volumke of the gin
     * @param alcoholPercent shows alcohol percentage
     */
    Gin(String name,String brand, double volume, double alcoholPercent,double pricePerUnit){
        super(name);
        this.brand = brand;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
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
        return this.volume;
    }

    /**
     *
     * @return alcoholpercentage as double
     */
    @Override
    public double getAlcoholPercent(){
        return this.alcoholPercent;
    }

    /**
     * @obvious
     * @return if si with alcohol or not as boolean
     */
    @Override
    public boolean isAlcoholic(){
        if(this.alcoholPercent < 0.5){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public double calculatePrice() {
        return this.getVolume() * this.getPricePerUnit();
    }

    /**
     * @takeASip reduces the volume by 1
     */
    //Functions
    public void takeASip(){
        this.volume = this.volume - 1;
    }

    /**
     *
     * @return returns brand and Alcoholpercentage as String
     */
    public String toString() {
        return "This Gin is called " + brand +" with " + this.getAlcoholPercent() + " percent alcohol by volume";
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
    public Sale sell(Staff seller) {
        Sale actualSale = new Sale(new Date(System.currentTimeMillis()), this, seller);
        actualSale.addToList();

        return  actualSale;
    }
}
