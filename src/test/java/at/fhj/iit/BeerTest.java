package at.fhj.iit;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class BeerTest {

    public Beer beerTest;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Liquid beerTestLiquid = new Liquid("TestType",500,4.7);
        beerTest = new Beer("TestBeer","TestCompany", beerTestLiquid,0.0088);
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
        assertEquals(testString,"This is a beer called " + beerTest.getBrand()+ " " + beerTest.getType()  +
                " with " + beerTest.getAlcoholPercent() + " percent alcohol by volume", "should print the output line");
    }
    @org.junit.jupiter.api.Test
    void calculatePrice() {

        assertEquals(beerTest.calculatePrice(),0.0088*500, "wrong price");
    }
    @org.junit.jupiter.api.Test
    void getPricePerUnit(){
        beerTest.setPricePerUnit(0.2);
        assertEquals(beerTest.getPricePerUnit(),0.2,"getter or setter doesn't work");

    }

    @org.junit.jupiter.api.Test
    void sell()

    {

        Liquid beerTestLiquid = new Liquid("TestType", 500, 4.7);
        beerTest = new Beer("TestBeer", "TestCompany", beerTestLiquid, 0.0088);
        Staff staff1 = new Staff("Testkellner1");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = simpleDateFormat.format(new Date());
        Sale actualSale = new Sale(new Date(), beerTest, staff1);
        assertEquals(beerTest.sell(staff1).seller.name, "Testkellner1", "wrong name seller");
        assertEquals(beerTest.sell(staff1).typeOfDink.name, "TestBeer", "wrong type of drink");
        assertEquals(simpleDateFormat.format(beerTest.sell(staff1).dateOfSale), date, "wrong date in sale");

    }

}