package at.fhj.iit;

public class Main {

    public static void main(String[] args){
    
        Liquid l = new Liquid("Wein", 0.125, 13);

        Drink d = new SimpleDrink("Rotwein",l, 0.024);


        //Create Liquids
        Liquid nullKomaJosefLiquid = new Liquid("Alcoholfree Beer", 500, 0.2);
        Liquid zwickelOtterkringerLiquid = new Liquid("Zwickl", 500, 5.2);
        Liquid schwarzwaldDryGinLiquid = new Liquid("Schwarzwald Dry Gin", 40, 47);
        Liquid sonnleitenWelschrieslingLiquid = new Liquid("Welschriesling", 125, 11.0);

        //Create Dinks
        Beer nullKommaJosef = new Beer("NullKomaJosef", "Otterkringer", nullKomaJosefLiquid, 0.0086);
        Beer otterkringer = new Beer("Beer","Otterkringer",zwickelOtterkringerLiquid, 0.0084);
        Drink schwarzwaldDry = new Gin("Schwarzwald Dry Gin","Monkey 47",schwarzwaldDryGinLiquid, 0.1575);
        Drink sonnleitenWelsch = new Wine("Wine" , "Sonnleiten",sonnleitenWelschrieslingLiquid, 0.0232);

        //Create Stuffmembers
        Staff staff1 = new Staff("Testkellner1");
        Staff staff2 = new Staff("Testkellner2");

        //Sell drinks
        nullKommaJosef.sell(staff2);
        otterkringer.sell(staff1);
        schwarzwaldDry.sell(staff2);
        sonnleitenWelsch.sell(staff1);
        otterkringer.sell(staff1);

        //get statistics for all dinks sold
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
