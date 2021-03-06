package at.fhj.iit;

import java.util.Date;

/**
 * represents a simple drink liquid which can be used in drinks
 */
public class SimpleDrink extends Drink{

    /**
     * uses only one liquid
     */
    protected Liquid l;
    protected double pricePerUnit;

    /**
     * Creates a SimpleDrink object with given name and liquid
     *
     * @param name name of drink
     * @param l only one liquid in drink, because it's a simple drink an not e.g. a cocktail
     * @param pricePerUnit price per ml
     */
    SimpleDrink(String name, Liquid l, double pricePerUnit){
        super(name);
        this.l = l;
        this.pricePerUnit = pricePerUnit;
    }

    /**
     * Returns volume of liquid l
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Returns alcohol volume percent of liquid l
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(l.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }

    /**
     * @Obvious
     * calculates the price of a drink
     *
     * @return price of actual drink
     */
    @Override
    public double calculatePrice(){
        return this.getVolume() * this.getPricePerUnit();
    }

    public String toString(){
        return "Simple Drink called " + name + " with " + l.getAlcoholPercent() + " percent alcohol by volume";
    }

    /**
     * sets the price for a ml of the drink
     *
     * @param price price per ml of drink
     */
    @Override
    public void setPricePerUnit(double price) {
        this.pricePerUnit = price;
    }

    /**
     * returns price per ml
     *
     * @return price per ml
     */
    @Override
    public double getPricePerUnit() {
        return this.pricePerUnit;
    }

    /**
     * one sale of a drink
     *
     * @param seller a stuff member that sells the drink
     * @return a Sale object, ready to add to the list of sales
     */
    @Override
    public Sale sell(Staff seller) {
        Sale actualSale = new Sale(new Date(System.currentTimeMillis()), this, seller);
        actualSale.addToList();

        return  actualSale;
    }
}
