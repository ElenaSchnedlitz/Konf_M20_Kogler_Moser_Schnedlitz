# Design Decision für Drink

## neue Klasse Staff
in der Klasse Staff wird Verkaufspersonal einfach nur durch einen String mit dem Namen abgebildet.

## neue Klasse Sale
repräsentiert einen einzelnen Verkauf eines Getränks.
Nimmt dabei den Typ des Getänks, den Verkäufer wie auch das Datum auf.

Stellt außerdem noch eine statische Liste bereit in der alle Verkäufe gespeichert werden können.

## neues Interface Sellable
Es wurde ein neues Interface Sellable erstellt, das für alle verkaufbaren Produkte festlegt, dass die folgenden Funktionen am Objekt definiert werden müssen:
* setPricePerUnit(double price)
* getPricePerUnit()
* sell(Staff staff)

**ad Unit:** </br> als Unit wurden Millilieter gewählt. Damit lässt sich der Preis immer über das ausgeschenkte Vollume * picePerUnit errechnen.

**ad sell(Staff staff):** </br>
Erstellt ein neues Sale-Object und fügt es der Liste aller Verkäufe zu. Dieses am Drink via Interface zu erstellen, hat den Vorteil, dass nur das Staff-Object übergeben werden muss. Dies hat vorallem bei der Vorstellung, dass die Software über ein Touchpanel betrieben wird, an dem sich der Schankkellner einmalig zu Beginn anmeldet und ansonsten nur anklickt was über den Schanktisch geht Vorteile.

## neue Klasse CashRegister
stellt alle Methoden zur Auswertung der Liste aller Verkäufe zur Verfügung. Verwendet dazu nur statische Methoden. Die Liste aller Verkäufe ist in den Methoden hardcodiert, da nicht davon ausgegangen wird, dass sich dies ändert.

## Verweis auf Liquid nicht vollzogen
Der Verweis auf Liquid wurde bewust nur für die SimpleDrinks Klasse so belassen, da dies nur bei komplexeren, von uns nicht implementierten Getränken und dort nur mit Vorbehalt sinnhaft einsetzbar ist.

So muss bedacht werden, dass der Preis eines Getränks niemals aus der Summe der Preise seiner Flüssigkeiten besteht.

Des Weiteren macht es unseres Erachtens keinen Sinn z.B. vier verschiedene Bier-Liquids anzulegen um daraus wieder vier verschiedene Bier-Sorten zu kreieren, da angenommen wird, das diese in der Flasche geliefert und verkauft werden.
