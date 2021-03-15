package at.fhj.iit;

public class Main {

    public static void main(String[] args){
    
        Liquid l = new Liquid("Wein", 0.125, 13);
        System.out.println(l.getName());
        System.out.println(l.getVolume());

        Drink d = new SimpleDrink("Rotwein",l);
        System.out.println(d);
        
        Drink beer = new Beer("Beer","Otterkringer","rotes Zwickl",500,5.2);
        System.out.println(beer);

        Drink gin = new Gin("Schwarzwald Dry Gin","Monkey 47",4,47);
        System.out.println(gin);
        
        Drink wine = new Wine("Wine" , "Welschriesling", "süß", 500, 11.0);
        System.out.println(wine);
    }
}
