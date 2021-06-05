package at.fhj.iit;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class WineTest {
    public Wine wineTest;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
       Date date = new Date();
        String stringDate = simpleDateFormat.format(new Date());
        Liquid wineTestLiquid = new Liquid("TestWineType", 500, 11.0);
        wineTest = new Wine("Wine" , "TestBrand", wineTestLiquid, 0.0232);
        Staff staff1 = new Staff("Testkellner1");
        Sale actualSale = new Sale(date, wineTest, staff1);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getBrand() {
        assertEquals(wineTest.getBrand(), "TestBrand","wrong brand name given. Please check entry");
    }

    @org.junit.jupiter.api.Test
    void getType() {
        assertEquals(wineTest.getType(),"TestWineType","wrong type given for this wine");
    }

    @org.junit.jupiter.api.Test
    void getVolume() {
        assertEquals(wineTest.getVolume(),500,"wrong Volume for this wine");
    }

    @org.junit.jupiter.api.Test
    void getAlcoholPercent() {
        assertEquals(wineTest.getAlcoholPercent(),11.0, "wrong alcohol percentage for this wine");
    }

    @org.junit.jupiter.api.Test
    void isAlcoholic() {
        assertTrue(wineTest.isAlcoholic(), "this wine isn't alcoholic");

    }

    @org.junit.jupiter.api.Test
    void takeASip() {
        double volumeWine = wineTest.getVolume();
        wineTest.takeASip();
        assertEquals(wineTest.getVolume(),volumeWine-40, "sip was not ok");
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        String wineString = wineTest.toString();
        //wineTest.toString();
        assertEquals(wineTest.toString(), "This is a wine called " + wineTest.getBrand() +" "+wineTest.getType() + " with " + wineTest.getAlcoholPercent() + " percent alcohol by volume", "the string is incorrect");
    }
    @org.junit.jupiter.api.Test
    void calculatePrice(){
        assertEquals(wineTest.calculatePrice(),0.0232*500,"wrong prize");
    }




    @org.junit.jupiter.api.Test
     void sell(){
        Liquid wineTestLiquid = new Liquid("TestWineType", 500, 11.0);
        wineTest = new Wine("Wine" , "TestBrand", wineTestLiquid, 0.0232);
        Staff staff1 = new Staff("Testkellner1");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = simpleDateFormat.format(new Date());
        Sale actualSale = new Sale(new Date(), wineTest, staff1);
        assertEquals(wineTest.sell(staff1).seller.name,"Testkellner1","wrong sell");
        assertEquals(simpleDateFormat.format(wineTest.sell(staff1).dateOfSale),date,"wrong date in sell");
        assertEquals(wineTest.sell(staff1).typeOfDink.name,"Wine","wrong type of drink in sell");
    }

    @org.junit.jupiter.api.Test
    void getPricePerUnit() {
        wineTest.setPricePerUnit(0.02);
        assertEquals(wineTest.getPricePerUnit(), 0.02, "setter or getter not working");
    }
}