package at.fhj.iit;

/**
 * represents the cash register
 * provides functionality to get statistics over all sales
 *
 * @author Philip Moser
 * @version  1.0
 * @since 25.05.2021
 */
public class CashRegister {

    private double calculatePrice(Drink drink){
        return drink.getVolume() * drink.getPricePerUnit();
    }

    public static double getTotalTurnoverAntiAlc(){
        double overAllPrice = 0.0;
        for(Sale oneSale:Sale.listOfAllSales){
            if(!oneSale.typeOfDink.isAlcoholic()){
                overAllPrice += oneSale.typeOfDink.c
            }
        }

        return overAllPrice;
    }

    public static void getTotalTurnoverLowAlc(){
        //TODO
    }

    public static void getTotalTurnoverHighAlc(){
        //TODO
    }
    public static void getTurnoverByDay(){
        //TODO
    }

    public static void getTurnoverByStuff(){
        //TODO
    }

    public static void getTurnoverPerDayByStuff(){
        //TODO
    }
}
