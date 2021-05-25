package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Invoice {
    //static vars
    public static HashMap<Integer,Invoice> listOfAllInvoices = new HashMap<Integer, Invoice>();

    //object vars
    int tableNumber;
    List<Sale> listOfSales = new ArrayList<Sale>();

    //Constructor
    Invoice(int tableNumber){
        addNewInvoiceToTable(tableNumber);
        this.listOfSales = null;
    }

    //Object Methods
    public void addToInvoice(int tableNumber, Sale sale){
        this.tableNumber = tableNumber;
        this.listOfSales.add(sale);
    }

    public static void openNewTable(int tableNumber){
        if(!checkIfTableExists(tableNumber)){
            listOfAllInvoices.put(tableNumber,this);
        }else{
            System.out.println("Table is not empty, will be added to table!");
        }
    }

    //static Methods
    public static Invoice getByTablenumber(int tableNumber){
        return listOfAllInvoices.get(tableNumber);
    }

    private static boolean checkIfTableExists(int tableNumber){
        for(int listedTables:listOfAllInvoices.keySet()){
            if(tableNumber == listedTables){
                return true;
            }
        }
        return false;
    }

    public static void clearTable(int tableNumber){
        listOfAllInvoices.remove(tableNumber);
    }
}


