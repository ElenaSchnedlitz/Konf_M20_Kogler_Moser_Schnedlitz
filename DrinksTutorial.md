# Tutorial

## Ein neues Getränk anlegen
In Version 3 stehen zur Zeit folgende Getränke zur auswahl:

Spezifische Getänke:
* Bier
* Wein
* Gin

Generisches Getränk zur Abbildung anderer Getränke
* SimpleDrink

### Erstellen eines Getränks einer spzeifischen Getränkklasse
Für jedes spezifische Getränkeobjekt existiert ein Konstruktor der wie folgt aussieht:

```java
ObjectType(String name,String brand, String type, int volume, double alcoholPercent,double pricePerUnit)
```
wobei:

|Datentyp | Attribut | Inhalt |
| --- | --- | --- |
| String | name | Name des Getränks |
| String | brand | Firmenname des Herstellers |
| String | type | Unterart des Getränks |
| Integer | volume | Füllmenge bei Ausschank in ml |
| Double | alcoholPercent | Volumesprozent Alcohol |
| Double | pricePerUnit | Preis pro ml bei Ausschank |

#### Beispielcode für jede spezifische Getränkklasse
```java
Beer otterkringer = new Beer("Beer","Otterkringer","rotes Zwickl",500,5.2, 0.0084);
Drink sonnleitenWelsch = new Wine("Wine" , "Sonnleiten", "Welschriesling", 500, 11.0, 0.0232);
Drink schwarzwaldDry = new Gin("Schwarzwald Dry Gin","Monkey 47",40,47, 0.1575);
```

### Erstellen eines generischen Getränks
Generische Getränke existieren um komplexere Getränke oder Getränke welche auch
im Cocktailbarbetrieb benötigt werden, abzubilden. Komplexere Getränke wie Coctails sind derzeit noch nicht enthalten, können aber ohne allzugroßen Aufwand implementiert werden.

Zur Zeit gibt es nur das generische Getränk SimpleDrink.

Um dieses zu erzeugen muss zuerst ein Liquid-Object angelegt werden. Konstruktor dafür sieht volgendermaßen aus:

```java
public Liquid(String name, double volume, double alcoholPercent)
```

Dieses Liquid kann dann über einen SimpleDrink über folgenden Konstruktor dem Verkauf zur verfügung gestellt werden:

```java
SimpleDrink(String name, Liquid l)
```
Die Attribute beider Konstruktoren sind sinngemäß gleich der Verwendung bei Spezifischen Getränken zu verwenden. (Siehe Tabelle oben)

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

Anlegen der Getränke und des Personals
```java
//anlegen der drinks
Beer nullKommaJosef = new Beer ("NullKommaJosef", "Otterkringer", "alcoholFrei", 500, 0.0, 0.0086);
Beer otterkringer = new Beer("Beer","Otterkringer","rotes Zwickl",500,5.2, 0.0084);
Drink schwarzwaldDry = new Gin("Schwarzwald Dry Gin","Monkey 47",40,47, 0.1575);
Drink sonnleitenWelsch = new Wine("Wine" , "Sonnleiten", "Welschriesling", 500, 11.0, 0.0232);

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
