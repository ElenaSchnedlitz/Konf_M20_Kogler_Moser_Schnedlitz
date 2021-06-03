package at.fhj.iit;

import java.util.Date;

public class Main {

    public static void main(String[] args){
    
        Liquid l = new Liquid("Wein", 0.125, 13);
//        System.out.println(l.getName());
//        System.out.println(l.getVolume());

        Drink d = new SimpleDrink("Rotwein",l);
//        System.out.println(d);

        Beer nullKommaJosef = new Beer ("NullKommaJosef", "Otterkringer", "alcoholFrei", 500, 0.0, 0.0086);
        
        Beer otterkringer = new Beer("Beer","Otterkringer","rotes Zwickl",500,5.2, 0.0084);
//        System.out.println(otterkringer);

        Drink schwarzwaldDry = new Gin("Schwarzwald Dry Gin","Monkey 47",40,47, 0.1575);
//        System.out.println(gin);

        Drink sonnleitenWelsch = new Wine("Wine" , "Sonnleiten", "Welschriesling", 500, 11.0, 0.0232);
//        System.out.println(wine);

        //testrun for cashRegister
        Staff staff1 = new Staff("Testkellner1");
        Staff staff2 = new Staff("Testkellner2");

        nullKommaJosef.sell(staff2);
        otterkringer.sell(staff1);
        schwarzwaldDry.sell(staff2);
        sonnleitenWelsch.sell(staff1);
        otterkringer.sell(staff1);


        System.out.println("Turnover for Non Alc.: "+CashRegister.getTotalTurnoverAntiAlc());
        System.out.println("Turnover for Low Alc.: "+CashRegister.getTotalTurnoverLowAlc());
        System.out.println("Turnover for High Alc.: "+CashRegister.getTotalTurnoverHighAlc());
        System.out.println("Turnover for Testkellner1: "+CashRegister.getTurnoverByStuff("Testkellner1"));
        System.out.println("Turnover for Testkellner2: "+CashRegister.getTurnoverByStuff("Testkellner2"));
        try{
            System.out.println("Turnover by Date: "+CashRegister.getTurnoverByDay("28/05/2021"));
            System.out.println("Turnover by Date and Stuff: "+CashRegister.getTurnoverPerDayByStuff("28/05/2021","Testkellner1"));
        } catch (Exception e){
            System.out.println(e.getLocalizedMessage());
            System.out.println("Enter Date in Format: dd/MM/yyyy");
        }


    }
}
