package at.fhj.iit;

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

    //Constructor

    /**
     * @obvious
     * used to create a new gin object
     * @param name name of the gin
     * @param brand brand of the gin
     * @param volume volumke of the gin
     * @param alcoholPercent shows alcohol percentage
     */
    Gin(String name,String brand, double volume, double alcoholPercent){
        super(name);
        this.brand = brand;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
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
}
