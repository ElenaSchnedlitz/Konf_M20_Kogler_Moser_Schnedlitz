package at.fhj.iit;

public class Beer extends Drink{
    private String brand;
    private String type;
    private double volume;
    private double alcoholPercent;

    //Constructor
    public Beer(String brand, String type, double volume, double alcoholPercent){
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
        this.volume = this.volume - 40;
    }

}