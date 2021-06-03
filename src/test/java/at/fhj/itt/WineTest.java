package at.fhj.iit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WineTest {
    public Wine wineTest;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Liquid wineTestLiquid = new Liquid("TestWineType", 500, 11.0);
        wineTest = new Wine("Wine" , "TestBrand", wineTestLiquid, 0.0232);
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


}