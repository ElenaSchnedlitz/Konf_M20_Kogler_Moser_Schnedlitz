# Tutorial

## Ein neues Getränk anlegen
In Version 3 stehen zur Zeit folgende Getränke zur auswahl:

Spezifische Getänke:
* Bier
* Wein
* Gin

Generisches Getränk zur Abbildung anderer Getränke
* SimpleDrink

### Erstellen eines Liquids eines Getränkklasse
Für jedes Getänk muss ein Liquid erstellt werden, dass quasi die Flüssigkeit des Getränks repräsentiert.
Für jedes Liquid-Objekt existiert ein Konstruktor der wie folgt aussieht:

```java
Liquid(Sting name, double volume, double alcoholPercent);
```

wobei:

|Datentyp | Attribut | Inhalt|
| --- | --- | --- |
| String | name | Typ der Flüssigkeit|
| double | volume | Abgabemenge beim Ausschank
| double | alcoholPercent | Volumesprozent Alcohol im Getränk |

#### Beispielcode für Liquids
```java
Liquid zwickelOtterkringerLiquid = new Liquid("Zwickl", 500, 5.2);
Liquid sonnleitenWelschrieslingLiquid = new Liquid("Welschriesling", 125, 11.0);
Liquid schwarzwaldDryGinLiquid = new Liquid("Schwarzwald Dry Gin", 40, 47);
```

### Erstellen eines Getränks einer spzeifischen Getränkklasse
Für jedes spezifische Getränkeobjekt existiert ein Konstruktor der wie folgt aussieht:

```java
ObjectType(String name,String brand, Liquid liquid,double pricePerUnit)
```
wobei:

|Datentyp | Attribut | Inhalt |
| --- | --- | --- |
| String | name | Name des Getränks |
| String | brand | Firmenname des Herstellers |
| Liquid | liquid | Liquid-Object für das Getränk |
| Double | pricePerUnit | Preis pro ml bei Ausschank |

#### Beispielcode für jede spezifische Getränkklasse
```java
Beer otterkringer = new Beer("Beer","Otterkringer","rotes Zwickl",500,5.2, 0.0084);
Drink sonnleitenWelsch = new Wine("Wine" , "Sonnleiten", "Welschriesling", 500, 11.0, 0.0232);
Drink schwarzwaldDry = new Gin("Schwarzwald Dry Gin","Monkey 47",40,47, 0.1575);
```

### Erstellen eines generischen Getränks
Generische Getränke existieren um komplexere Getränke oder Getränke welche noch nicht implementiert wurden abzubilden.
Komplexere Getränke wie Coctails sind derzeit noch nicht enthalten, können aber ohne allzugroßen Aufwand implementiert werden.

Zur Zeit gibt es nur das generische Getränk SimpleDrink.

Um dieses zu erzeugen muss wieder zuerst ein Liquid-Object angelegt werden.
Dieses Liquid kann dann über einen SimpleDrink über folgenden Konstruktor dem Verkauf zur verfügung gestellt werden:

```java
SimpleDrink(String name, Liquid l, double pricePerUnit)
```
Die Attribute des Konstruktors sind sinngemäß gleich der Verwendung bei Spezifischen Getränken zu verwenden. (Siehe Tabelle oben)

---

## Personal anlegen
Für jede Person im verkaufenden Personal muss ein Objekt der Klasse Staff angelegt werden.

Der Konstruktor übernimmt nur einen String der den Namen repräsentiert. Es darf nicht zweimal der selbe Name vergeben werden.

Beispiel:

```java
Staff hansMayer = new Staff("Johann Mayer");
```
---

## Verkaufen von Getränken
Für jedes anglegte Getränkeobjekt gibt es die Funktion sell welche nur eine Stuffobjekt übernimmt und einen Verkauf repräsentiert.

Beispiel:
```java
otterkringer.sell(hansMayer);
```

---

## Auswertung der Verkäufe
Das System hat verschiedene Auswertungsfunktionen. Alle werden über die Klasse CashRegister zur verfügung gestellt.

In Version 3 kann auf folgende Auswertungsfunktionen zurück gegriffen werden:
* getTotalTurnoverAntiAlc()
* getTotalTurnoverLowAlc()
* getTotalTurnoverHighAlc()
* getTurnoverByStuff(String name)
* getTurnoverByDay(String dateForTurnover)
* getTurnoverPerDayByStuff(String dateForTurnover, String name)

##### getTotalTurnoverAntiAlc()
zeigt den Gesamtumsatz von antialkoholischen Getränken (Getränke mit einem alcoholPercent < 0.5).

##### getTotalTurnoverLowAlc()
zeigt den Gesamtumsatz von niederalkoholischen Getränken (Getränke mit einem alcoholPercent <= 16)

##### getTotalTurnoverHighAlc()
zeigt den Gesamtumsatz von hochprozentigen Getränken (Getränke mit einem alcoholPercent > 16)

##### getTurnoverByStuff(String name)
übernimmt als Parameter ein String mit dem Namen des Kellners und gibt als Ergebniss den Gesamtumsatz des jeweiligen Kellners zurück

##### getTurnoverByDay(String dateForTurnover)
übernimmt einen String der das Datum in folgender Formatierung akzeptiert:
**dd/MM/yyyy**
>**Vorsicht:**
Wirft eine Exception wenn das Datum nicht richtig geparsed werden kann. Daher in try-catch-Block setzen.

##### getTurnoverPerDayByStuff(String dateForTurnover, String name)
kombiniert die beiden Methoden getTurnoverByStuff(String name) und getTurnoverByDay(String dateForTurnover) und retouniert den Umsatz eines bestimmten Kellners an einem bestimmten Tag.
>**Vorsicht:**
Wirft eine Exception wenn das Datum nicht richtig geparsed werden kann. Daher in try-catch-Block setzen.

---

## Beispielhafter Programmablauf

Anlegen der Liquids, der Getränke und des Personals
```java
//anlegen der Liquids
Liquid nullKomaJosefLiquid = new Liquid("Alcoholfree Beer", 500, 0.2);
Liquid zwickelOtterkringerLiquid = new Liquid("Zwickl", 500, 5.2);
Liquid schwarzwaldDryGinLiquid = new Liquid("Schwarzwald Dry Gin", 40, 47);
Liquid sonnleitenWelschrieslingLiquid = new Liquid("Welschriesling", 125, 11.0);

//anlegen der drinks
Beer nullKommaJosef = new Beer("NullKomaJosef", "Otterkringer", nullKomaJosefLiquid, 0.0086);
Beer otterkringer = new Beer("Beer","Otterkringer",zwickelOtterkringerLiquid, 0.0084);
Drink schwarzwaldDry = new Gin("Schwarzwald Dry Gin","Monkey 47",schwarzwaldDryGinLiquid, 0.1575);
Drink sonnleitenWelsch = new Wine("Wine" , "Sonnleiten",sonnleitenWelschrieslingLiquid, 0.0232);

//anlegen des Personals
Staff staff1 = new Staff("Testkellner1");
Staff staff2 = new Staff("Testkellner2");
```
Verkaufen von drinks
```java
nullKommaJosef.sell(staff2);
otterkringer.sell(staff1);
schwarzwaldDry.sell(staff2);
sonnleitenWelsch.sell(staff1);
otterkringer.sell(staff1);
```
Auswerten der Verkäufe
```java
System.out.println("Turnover for Non Alc.: "+CashRegister.getTotalTurnoverAntiAlc());
System.out.println("Turnover for Low Alc.: "+CashRegister.getTotalTurnoverLowAlc());
System.out.println("Turnover for High Alc.: "+CashRegister.getTotalTurnoverHighAlc());
System.out.println("Turnover for Testkellner1: "+CashRegister.getTurnoverByStuff("Testkellner1"));
System.out.println("Turnover for Testkellner2: "+CashRegister.getTurnoverByStuff("Testkellner2"));
try{
    System.out.println("Turnover by Date: "+CashRegister.getTurnoverByDay("28/05/2021"));
    System.out.println("Turnover by Date and Stuff: "+CashRegister.getTurnoverPerDayByStuff("28/05/2021","Testkellner1"));
} catch (Exception e){
    System.out.println(e.getLocalizedMessage());
    System.out.println("Enter Date in Format: dd/MM/yyyy");
}
```
