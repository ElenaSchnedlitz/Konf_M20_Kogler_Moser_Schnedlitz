package at.fhj.iit;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class GinTest {

    public Gin ginTest;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Liquid ginTestLiquid = new Liquid("TestGin", 20, 50.1);
         ginTest = new Gin("TestGin", "TestCompany", ginTestLiquid ,0.0672);
        Staff staff1 = new Staff("Testkellner1");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = simpleDateFormat.format(new Date());
        Sale actualSale = new Sale(new Date(), ginTest, staff1);


    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getBrand() {
        assertEquals(ginTest.getBrand(), "TestCompany", "wrong brand");
    }

    @org.junit.jupiter.api.Test
    void getVolume() {

        assertEquals(ginTest.getVolume(), 20, "wrong percentage");
    }

    @org.junit.jupiter.api.Test
    void getAlcoholPercent() {

        assertEquals(ginTest.getAlcoholPercent(),50.1,"wrong percentage");
    }

    @org.junit.jupiter.api.Test
    void isAlcoholic() {
        assertTrue(ginTest.isAlcoholic(), "is no real gin");
    }

    @org.junit.jupiter.api.Test
    void takeASip() {
        double volumeGin = ginTest.getVolume();
        ginTest.takeASip();
        assertEquals(ginTest.getVolume(),volumeGin- 5, "didnt drink");
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        String ginString = ginTest.toString();
        assertEquals(ginString, "This Gin is called " + ginTest.getBrand() +" with " + ginTest.getAlcoholPercent() + " percent alcohol by volume");
    }
    @org.junit.jupiter.api.Test

    void getPricePerUnit() {
        ginTest.setPricePerUnit(0.2);
        assertEquals(ginTest.getPricePerUnit(),0.2,"wrong prize per unit");
    }

    @org.junit.jupiter.api.Test
    void calculatePrice(){
        assertEquals(ginTest.calculatePrice(),20*0.0672,"wrong prize");
    }
    @org.junit.jupiter.api.Test
    void sell(){
        Liquid ginTestLiquid = new Liquid("TestGin", 20, 50.1);
        ginTest = new Gin("TestGin", "TestCompany", ginTestLiquid ,0.0672);
        Staff staff1 = new Staff("Testkellner1");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = simpleDateFormat.format(new Date());
        Sale actualSale = new Sale(new Date(), ginTest, staff1);
    assertEquals(ginTest.sell(staff1).seller.name,"Testkellner1","wrong name seller");
    assertEquals(ginTest.sell(staff1).typeOfDink.name,"TestGin","wrong type of drink");
    assertEquals(simpleDateFormat.format(ginTest.sell(staff1).dateOfSale),date,"wrong date in sale");
    }

}