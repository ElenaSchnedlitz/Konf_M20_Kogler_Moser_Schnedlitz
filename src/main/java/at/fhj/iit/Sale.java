package at.fhj.iit;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * represents a single sale
 *
 * @author Philip Moser
 * @version  1.0
 * @since 25.05.2021
 */
public class Sale {

    public static List<Sale> listOfAllSales = new ArrayList<Sale>();

    Date dateOfSale;
    Drink typeOfDink;
    Staff seller;
    /**
     * @Obvious
     * @param dateOfSale
     * @param typeOfDink
     * @param seller
     */
    public Sale(Date dateOfSale, Drink typeOfDink, Staff seller) {
        this.dateOfSale = dateOfSale;
        this.typeOfDink = typeOfDink;
        this.seller = seller;
    }
    /**
     * adds a sale to the list which contains all of the sales
     */
    public void addToList(){
        listOfAllSales.add(this);
    }


}


