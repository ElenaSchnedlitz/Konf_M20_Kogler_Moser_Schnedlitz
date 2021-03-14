package at.fhj.iit;

public class Gin extends Drink {
    private String brand;
    private double volume;
    private double alcoholPercent;

    //Constructor
    Gin(String name,String brand, double volume, double alcoholPercent){
        super(name);
        this.brand = brand;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    //Getter

    public String getBrand() {
        return brand;
    }


    @Override
    public double getVolume(){
        return this.volume;
    }

    @Override
    public double getAlcoholPercent(){
        return this.alcoholPercent;
    }

    @Override
    public boolean isAlcoholic(){
        if(this.alcoholPercent < 0.5){
            return false;
        } else {
            return true;
        }
    }

    //Functions
    public void takeASip(){
        this.volume = this.volume - 1;
    }

    public String toString() {
        return "This Gin is called " + brand +" with " + this.getAlcoholPercent() + " percent alcohol by volume";
    }
}
