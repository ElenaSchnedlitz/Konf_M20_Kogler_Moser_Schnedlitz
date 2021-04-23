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

    /**
     * returns the brand that was given for a wine object
     * @return brand as a String
     */
    public String getBrand() {
        return brand;
    }

    /**
     * return the type of an wine object
     * @return type as a String
     */
    public String getType() {
        return type;
    }

    //@Override

    /**
     * returns the volume of an wine bottle of a given wine
     * @return volume as double
     */
    public double getVolume(){
        return this.volume;
    }

    //@Override

    /**
     * return the alcohol percentage of a bottle of the given wine
     * @return alcohol percentage as double
     */
    public double getAlcoholPercent(){
        return this.alcoholPercent;
    }

    //@Override

    /**
     * returns true if the given wine has an higher alcohol percentage then 0.5 per mille
     * @return true if the accusation is correct, else false
     */
    public boolean isAlcoholic(){
        if(this.alcoholPercent < 0.5){
            return false;
        } else {
            return true;
        }
    }

    //Functions

    /**
     * function that visualizes a sip that has been taken by a person
     */
    public void takeASip(){
        this.volume = this.volume - 40;
    }

    /**
     * transform the given pieces of information into a string
     * @return contains the information about an wine object
     */
    public String toString() {
        return "This is a wine called " + brand +" "+type + " with " + this.getAlcoholPercent() + " percent alcohol by volume";
    }
}
