package at.fhj.iit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

/**
 * represents the cash register
 * provides functionality to get statistics over all sales
 *
 * @author Philip Moser
 * @version  1.0
 * @since 25.05.2021
 */
public class CashRegister {

    public static double getTotalTurnoverAntiAlc(){
        double overAllPrice = 0.0;
        for(Sale oneSale:Sale.listOfAllSales){
            if(!oneSale.typeOfDink.isAlcoholic()){
                overAllPrice += oneSale.typeOfDink.calculatePrice();
            }
        }
        return overAllPrice;
    }

    public static double getTotalTurnoverLowAlc(){
        double overAllPrice = 0.0;
        for(Sale oneSale:Sale.listOfAllSales){
            if(oneSale.typeOfDink.isAlcoholic() && oneSale.typeOfDink.getAlcoholPercent() <= 16){
                overAllPrice += oneSale.typeOfDink.calculatePrice();
            }
        }
        return overAllPrice;
    }

    public static double getTotalTurnoverHighAlc(){
        double overAllPrice = 0.0;
        for(Sale oneSale:Sale.listOfAllSales){
            if(oneSale.typeOfDink.isAlcoholic() && oneSale.typeOfDink.getAlcoholPercent() > 16){
                overAllPrice += oneSale.typeOfDink.calculatePrice();
            }
        }
        return overAllPrice;
    }
    public static double getTurnoverByDay (String dateForTurnover) throws Exception{
        double overAllPrice=0.0;
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateForTurnover);
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        for(Sale oneSale:Sale.listOfAllSales){
            if(format.format(oneSale.dateOfSale).equals(format.format(date))){
                overAllPrice += oneSale.typeOfDink.calculatePrice();
            }
        }
        return overAllPrice;
    }

    public static double getTurnoverByStuff(String name){
        double overAllPrice = 0.0;
        for(Sale oneSale:Sale.listOfAllSales){
            if(oneSale.seller.name.equals(name)){
                overAllPrice += oneSale.typeOfDink.calculatePrice();
            }
        }
        return overAllPrice;
    }

    public static double getTurnoverPerDayByStuff(String dateForTurnover,String name) throws Exception{
        double overAllPrice=0.0;
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateForTurnover);
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        for(Sale oneSale:Sale.listOfAllSales) {
            if (format.format(oneSale.dateOfSale).equals(format.format(date)) && oneSale.seller.name.equals(name)) {
                overAllPrice += oneSale.typeOfDink.calculatePrice();
            }
        }
        return overAllPrice;
    }
}
