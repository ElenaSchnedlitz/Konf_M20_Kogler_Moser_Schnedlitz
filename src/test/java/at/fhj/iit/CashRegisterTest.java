package at.fhj.iit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CashRegisterTest {

    @BeforeEach
    void setUp() {

        Liquid nullKomaJosefLiquid = new Liquid("Alcoholfree Beer", 500, 0.2);
        Beer nullKommaJosef = new Beer("NullKomaJosef", "Otterkringer", nullKomaJosefLiquid, 0.0086);
        Staff staff1 = new Staff("Testkellner1");
        Liquid zwickelOtterkringerLiquid = new Liquid("Zwickl", 500, 5.2);
        Liquid schwarzwaldDryGinLiquid = new Liquid("Schwarzwald Dry Gin", 40, 47);

        Beer otterkringer = new Beer("Beer","Otterkringer",zwickelOtterkringerLiquid, 0.0084);
        Drink schwarzwaldDry = new Gin("Schwarzwald Dry Gin","Monkey 47",schwarzwaldDryGinLiquid, 0.1575);



        nullKommaJosef.sell(staff1);
        otterkringer.sell(staff1);
        schwarzwaldDry.sell(staff1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String stringDate = simpleDateFormat.format(new Date());






    }

    @AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getTotalTurnoverAntiAlc(){
        assertEquals(500*0.0086,CashRegister.getTotalTurnoverAntiAlc(),"wrong Turnover for AntiAlc");
    }

    @org.junit.jupiter.api.Test
    void getTotalTurnoverLowAlc(){
        assertEquals(500*0.0084,CashRegister.getTotalTurnoverLowAlc(),"wrong turnover for LowAlc " );
    }
    @org.junit.jupiter.api.Test
       void getTotalTurnoverHighAlc(){
        assertEquals( 40 *0.1575,CashRegister.getTotalTurnoverHighAlc(),"wrong turnover for HighAlc");
    }

    @org.junit.jupiter.api.Test
    void getTurnoverByDay () throws Exception{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String stringDate = simpleDateFormat.format(new Date());
        assertEquals(CashRegister.getTurnoverByDay(stringDate),(500*0.0086)+(500*0.0084)+(40 *0.1575),"wrong TurnoverByDay");
    }

    @org.junit.jupiter.api.Test
    void getTurnoverByStuff(){
        assertEquals(+CashRegister.getTurnoverByStuff("Testkellner1"),(500*0.0086)+(500*0.0084)+(40 *0.1575),"wrong turnover byStuff");
    }
    @org.junit.jupiter.api.Test
    void getTurnoverPerDayByStuff() throws Exception{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String stringDate = simpleDateFormat.format(new Date());
        assertEquals(CashRegister.getTurnoverPerDayByStuff(stringDate,"Testkellner1" ),(500*0.0086)+(500*0.0084)+(40 *0.1575),"wrong turnoverPerDayPerStuff" );
    }



}