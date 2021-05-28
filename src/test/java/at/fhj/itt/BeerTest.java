package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

class BeerTest {

    public Beer beerTest;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        beerTest = new Beer("TestBeer","TestCompany","TestType",500,4.7,0.0088);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getBrand() {
        assertEquals(beerTest.getBrand(),"TestCompany","getBrand should deliver brandname");
    }

    @org.junit.jupiter.api.Test
    void getType() {
        assertEquals(beerTest.getType(),"TestType","getType should deliver type of beer");
    }

    @org.junit.jupiter.api.Test
    void getVolume() {
        assertEquals(beerTest.getVolume(),500.0,"getVolume should return volume of beer");
    }

    @org.junit.jupiter.api.Test
    void getAlcoholPercent() {
        assertEquals(beerTest.getAlcoholPercent(),4.7,"getAlcoholPercent should deliver alcohol " +
                "percentage of beer");
    }

    @org.junit.jupiter.api.Test
    void isAlcoholic() {
        assertEquals(beerTest.isAlcoholic(),true,"should return if beer is alcoholic");
    }

    @org.junit.jupiter.api.Test
    void takeASip() {
        double volumeBeforSip = beerTest.getVolume();
        beerTest.takeASip();
        assertEquals(beerTest.getVolume(),volumeBeforSip-40,"should reduce amount of beer by 40");
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        String testString = beerTest.toString();
        assertEquals(testString,"This is a beer called " + beerTest.getBrand()+" "+beerTest.getType() +
                " with " + beerTest.getAlcoholPercent() + " percent alcohol by volume", "should print the output line");
    }
}