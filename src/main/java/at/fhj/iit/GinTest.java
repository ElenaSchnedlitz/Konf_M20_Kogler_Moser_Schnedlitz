package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

class GinTest {

    public Gin ginTest;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
         ginTest = new Gin("TestGin", "TestCompany", 20,  50.1);
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
        assertEquals(ginTest.getVolume(),volumeGin- 1, "didnt drink");
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        String ginString = ginTest.toString();
        assertEquals(ginString, "This Gin is called " + ginTest.getBrand() +" with " + ginTest.getAlcoholPercent() + " percent alcohol by volume");
    }
}