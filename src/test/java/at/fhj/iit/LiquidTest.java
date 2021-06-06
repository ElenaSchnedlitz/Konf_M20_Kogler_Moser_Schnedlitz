package at.fhj.iit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LiquidTest {
    Liquid testLiquid;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
     testLiquid = new Liquid("testLiqiud",500,0);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getName(){
        testLiquid.setName("new");
        assertEquals(testLiquid.getName(),"new","wrong getter or setter");
    }
    @org.junit.jupiter.api.Test
    void getAlcoholPercent(){
testLiquid.setAlcoholPercent(0.1);
assertEquals(testLiquid.getAlcoholPercent(),0.1,"wrong get alcohol or set alcoholpercent");
    }
    @org.junit.jupiter.api.Test
    void checkVolume(){
        
        assertThrows(IllegalArgumentException.class,() ->{new Liquid("test",-2,5);},"liquid  testLiqiud  must have a volume > 0");
    }

}