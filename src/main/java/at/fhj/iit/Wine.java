package at.fhj.iit;

/**
 * Wine is an addition to the main Class Drink
 * delivers Information and details in form of Strings about an wine object
 *
 * @author Elena Schnedlitz
 */

public class Wine extends Drink {
    private String brand;
    private String type;
    private double volume;
    private double alcoholPercent;

    //Constructor

    /**
     * used to create an new wine object
     * @param name name of the wine
     * @param brand what kind of brand is the wine
     * @param type what type is the wine
     * @param volume what volume does one bottle of this wine have
     * @param alcoholPercent what alcohol percentage does a cup of this wine have
     */
    Wine(String name,String brand, String type, double volume, double alcoholPercent){
        super(name);
        this.brand = brand;
        this.type = type;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    //Getter

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    //@Override
    public double getVolume(){
        return this.volume;
    }

    //@Override
    public double getAlcoholPercent(){
        return this.alcoholPercent;
    }

    //@Override
    public boolean isAlcoholic(){
        if(this.alcoholPercent < 0.5){
            return false;
        } else {
            return true;
        }
    }

    //Functions
    public void takeASip(){
        this.volume = this.volume - 40;
    }

    public String toString() {
        return "This is a wine called " + brand +" "+type + " with " + this.getAlcoholPercent() + " percent alcohol by volume";
    }
}
