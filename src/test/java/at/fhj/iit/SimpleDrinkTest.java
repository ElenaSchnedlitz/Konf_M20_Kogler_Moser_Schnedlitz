package at.fhj.iit;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDrinkTest {


    public SimpleDrink simpleDrinkTest;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Liquid SimpleDrinkTestLiquid = new Liquid("TestSimpleDrink", 20, 0);
        simpleDrinkTest = new SimpleDrink("TestSimpleDrink", SimpleDrinkTestLiquid ,0.0672);
        Staff staff1 = new Staff("Testkellner1");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = simpleDateFormat.format(new Date());
        Sale actualSale = new Sale(new Date(), simpleDrinkTest, staff1);
    }
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getVolume(){
        assertEquals(simpleDrinkTest.getVolume(),20,"wrong volume");
    }
    @org.junit.jupiter.api.Test
    void getAlcoholPercent(){
        assertEquals(simpleDrinkTest.getAlcoholPercent(),0,"wrong alcpercent");
    }
    @org.junit.jupiter.api.Test
    void isAlcoholic(){
        assertEquals(simpleDrinkTest.isAlcoholic(),false,"is alcoholic doesnt work");
    }
    @org.junit.jupiter.api.Test
    void calculatePrice(){
        assertEquals(simpleDrinkTest.calculatePrice(),0.0672*20,"wrong prize");
    }

    @org.junit.jupiter.api.Test
    void testToString(){
        String simpleDrinkString = simpleDrinkTest.toString();
        assertEquals(simpleDrinkString,"Simple Drink called " + simpleDrinkTest.name + " with " + simpleDrinkTest.getAlcoholPercent() + " percent alcohol by volume");
    }

    @org.junit.jupiter.api.Test
    void getPricePerUnit(){
        simpleDrinkTest.setPricePerUnit(0.3);
        assertEquals(simpleDrinkTest.getPricePerUnit(),0.3,"wrong getter or setter");
    }
    @org.junit.jupiter.api.Test
    void sell(){
        Liquid SimpleDrinkTestLiquid = new Liquid("TestSimpleDrink", 20, 0);
        simpleDrinkTest = new SimpleDrink("TestSimpleDrink", SimpleDrinkTestLiquid ,0.0672);
        Staff staff1 = new Staff("Testkellner1");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = simpleDateFormat.format(new Date());
        Sale actualSale = new Sale(new Date(), simpleDrinkTest, staff1);
        assertEquals(simpleDrinkTest.sell(staff1).seller.name,"Testkellner1","wrong sell");
        assertEquals(simpleDateFormat.format(simpleDrinkTest.sell(staff1).dateOfSale),date,"wrong date in sell");
        assertEquals(simpleDrinkTest.sell(staff1).typeOfDink.name,"TestSimpleDrink","wrong type of drink in sell");

    }
}