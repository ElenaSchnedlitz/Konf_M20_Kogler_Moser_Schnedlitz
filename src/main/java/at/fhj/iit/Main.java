package at.fhj.iit;

import java.util.Date;

public class Main {

    public static void main(String[] args){
    
        Liquid l = new Liquid("Wein", 0.125, 13);
        System.out.println(l.getName());
        System.out.println(l.getVolume());

        Drink d = new SimpleDrink("Rotwein",l);
        System.out.println(d);
        
        Beer otterkringer = new Beer("Beer","Otterkringer","rotes Zwickl",500,5.2, 0.0084);
        System.out.println(otterkringer);

        Drink gin = new Gin("Schwarzwald Dry Gin","Monkey 47",4,47);
        System.out.println(gin);
        
        Drink wine = new Wine("Wine" , "Welschriesling", "s��", 500, 11.0);
        System.out.println(wine);

        //testrun for cashRegister
        Staff staff1 = new Staff("Testkellner1");
        int tablenumber = 1;

        otterkringer.sell(staff1,tablenumber);


    }
}
