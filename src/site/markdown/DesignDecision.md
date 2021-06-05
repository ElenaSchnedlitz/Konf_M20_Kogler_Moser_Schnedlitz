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

<strong> add Unit:</strong> <br/>
Als Unit wurden Millimeter gewählt. Damit lässt sich der Preis immer über das ausgeschenkte Volumen mal picePerUnit errechnen.

**add sell(Staff staff):** <br/>
Erstellt ein neues Sale-Object und fügt es der Liste aller Verkäufe zu. Dieses am Drink via Interface zu erstellen, hat den Vorteil, dass nur das Staff-Object übergeben werden muss. Dies hat vorallem bei der Vorstellung, dass die Software über ein Touchpanel betrieben wird, an dem sich der Schankkellner einmalig zu Beginn anmeldet und ansonsten nur anklickt was über den Schanktisch geht Vorteile.

## neue Klasse CashRegister
stellt alle Methoden zur Auswertung der Liste aller Verkäufe zur Verfügung. Verwendet dazu nur statische Methoden. Die Liste aller Verkäufe ist in den Methoden hardcodiert, da nicht davon ausgegangen wird, dass sich dies ändert.

## Verweis auf Liquid
Allen Getränken liegt nun ein Liquid-Objekt zugrunde, dass den Flascheninhalt spezifiziert.
Dies war so gewünscht. Die Sinnhaftigkeit, dieses Ansatzes wird aber bezweifelt, da auch bei gemischten Getränken,sich der Preis nicht
aus den Preisen der Zutaten errechnet und die Liquids nicht für mehrere Getränke verwendet werden können, da Attribute wie Volumensprozent sich von Produkt zu Produkt unterscheiden. 
