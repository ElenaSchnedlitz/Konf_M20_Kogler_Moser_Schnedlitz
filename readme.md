# Readme
Team C: Tobias Kogler, Philip Moser, Elena Schnedlitz

### Aufgabenteilung
 - Philip Moser - implements beer-Subclass
 - Elena Schnedlitz - implements wine-Subclass
 - Tobias Kogler - implements gin-Subclass

### Vorgehen Abgabe 1
 - *Elena:* 	neues [Repo](https://github.com/ElenaSchnedlitz/Konf_M20_Kogler_Moser_Schnedlitz) auf gitHub erstellt.
 - *Moe:* 	readme.md auf lokalem Rechner erstellt und dann mittels
```bash
		git add
		git commit -m "inital commit of readme.txt"
		git push
```

	in das Repo gepushed
 - *Tobias:*	Repo auf lokalen Client geklont mit
```bash
		 git clone https://github.com/ElenaSchnedlitz/Konf_M20_Kogler_Moser_Schnedlitz
```
 - *Elena:* 	File via git pull geholt
 - *Moe:* 	drinks-Files in den Workspace-Ordner gespeichert
	upload mit obrigen Befehlen
 - *Elena:*	update des Ordners via git pull
 - *Tobias:* update des Ordners via git pull
 - *Moe:*	upload der Sub-Klasse Beer.java
 - *Tobias* update des Ordners via git pull
 - *Tobias* upload der Sub-Klasse Gin.java
 - *Elena*  update über Veränderungen über git status und git pull
 - *Elena* upload der Sub-Klasse Wine.java
 - *Tobias* update via gitpull
 - *Tobias* bearbeiten der main Klasse und der Gin Klasse
 - *Tobias* uplpoad via git push
 - *Elena* Bearbeitung der main-klasse und hinzufügen ser sysout für die wine.java
 - *Elena* upload durch git push
 - *Tobias* neuer branch gindrinkstest
 - *Elena* erstellen eines neuen branches winetest
 - *Elena* weiterarbeiten an winetest und pushen des branches
 - *Elena* arbeiten an den JavaDoc Kommentaren in Wine.java und hochladen mittels git push
 - *Elena* überarbeiten der JavaDoc Kommentaren und hochladen mittels git push
 - *Tobias* aufgrund von falscherstellten docs neuen branch erstellt mit zuvorliegenden hashcode"
 - *Tobias* mit git branch -f <branch-name> <neuer branch name> den branch head auf den neuen branch replaziert
 - *Tobias* mit git push -f <remote> <branch> den alten branch hard überschrieben
 - *Elena* mergen von den branches main und winetest

# Vorgehen Abgabe 2
- *Tobias* neuer branch gindrinkstest
- *Elena* erstellen eines neuen branches winetest
- *Moe* erstellen eines neuen branches beertest
- *Elena* weiterarbeiten an winetest und pushen des branches
- *Elena* arbeiten an den JavaDoc Kommentaren in Wine.java und hochladen mittels git push
- *Elena* überarbeiten der JavaDoc Kommentaren und hochladen mittels git push

# Vorgehen Abgabe 3
- *Tobias* neuer branch JUnitTest und auf diesem JUnit Tests erstellt
- *Tobias* Testabdeckung.md hinzugefügt.
- *Tobias*  Testklassen public gesetzt.
- *Tobias*  Bei Liqiud Test throw argument abgedeckt" 
## Repo taggen
#### Tag erstellen
git tag -a v1.0 -m "my version 1.0"
#### Tag anzeigen
git tag
#### Tag löschen
git -d v1.0
#### Tag am Remote-Repo erstellen
git push origin v1.0

## .gitignore erstellen
#### Vorlagen für .gitignore
[InteliJ .gitignore Vorlage](https://github.com/github/gitignore/blob/master/Global/JetBrains.gitignore)

[Java .gitignore Vorlage](https://github.com/github/gitignore/blob/master/Java.gitignore)

#### sonstiges zur .gitignore
Zeilen 56-63 (auto-import für Gradle und Marven) einkommentiert.

.gitignore wird mit auf das Repo gepushed

## Tests für jeweilige Klasse im InteliJ erstellen
### Vorbereitung und Anlage
 - In die Klasse gehen
 - dort <kbd>Alt</kbd>+<kbd>Enter</kbd>
 - im Context-Menü *create Test*
 - Methoden, Setup before, Setup after auswählen
 - JUnit importieren

 #### verwendete Resourcen:

 [Testerstllung in InteliJ](https://www.jetbrains.com/help/idea/create-tests.html)

### Tests erstellen
  - in `BeforeEach` das Testobjekt anlegen
  - `tearDown` muss in diesem Fall nicht implementiert werden, da nichts nachhaltig verändert wird, und zurück gesetzt werden müsste, bevor der nächste Test rennen kann.
##### Vorgehen bei der Testerstellung
 - benutzte Methode: `assertEquals(actual,expected,message)`
 - `actual`: es wird der zu prüfende Wert über die Methode gerufen.
 - `expected`: es wird der erwartete Wert "hardcoded" eingetragen.
 - `message` : im Fehlerfall wird diese Message ausgegeben.

### Anmerkungen zu den Tests
#### Wine Class - by Elena Schnedlitz
es konnten keine 100% abgedeckt werden, da man nicht überprüft ob der Drink nicht alkoholisch ist.

#### Gin Class - by Tobias Kogler
da kein Alkoholfreies Getränk getetstet wurde, keine 100% Testabdeckung.
#### Beer Class - by Philip Moser
keine 100% Testabdeckung, da kein Alkoholfreies Getränk getestet wurde.


## JavaDoc
#### Grundsätzliches zu JavaDoc
JavaDoc Einträge werden direkt im Code über der zu dokumentierenden Methode geschrieben.

Der Beginn wird durch ein `\**` gekennzeichnet. Der Weitere Body gleicht dem eines mehrzeiligen Kommentars.

Durch spezielle Tags können bestimmte Eigenschaften der Funktion referenziert werden.
Die häufigsten sind:
 - `@param`: referenziert einen Input-Parameter
 - `@return`: referenziert den Return-Wert  
 - `@author`: gibt den Author des Codes an
 - `@version`: gibt die Version des Codes an
 - `@since`: gibt an seit wann der Code existiert

#### @Obvious Tag
Es wurde ein Tag mit der Bezeichnung @Obvious eingeführt. Damit sind alle Funktionen gekennzeichnet deren Funktionsweise aus dem Namen direkt ableitbar ist und als bekannt angenommen werden darf. Wir erhoffen uns davon eine bessere Lesbarkeit der Dokumentation, da so für erfahrene Programierer ersichtlich ist, dass die Methode den Erwartungen ensprechend funktioniert und diser Teil der Dokumentation nicht zwingend gelesen werden muss.

verwendete Resourcen:
 - [InteliJ JavaDoc documentation](https://www.jetbrains.com/help/idea/working-with-code-documentation.html)
 - [Handle obvious code documentation](https://www.adam-bien.com/roller/abien/entry/how_to_javadoc_efficient_and)
 - [Java Dokumentation zu JavaDoc](https://www.tutorialspoint.com/java/java_documentation.htm)
 - [JavaDoc getter and setter] (https://stackoverflow.com/questions/1028967/simple-getter-setter-comments)

# verwendete Unterlagen
Linksammlung zu den verwendeten Quellen soweit nicht kontextgebunden im Fließtext
#### Markdown
- [makeareadme](https://www.makeareadme.com/)
- [Markdown Reference](https://commonmark.org/help/)
- [github mastering markdown](https://guides.github.com/features/mastering-markdown/)

#### git
 - [git Lernspiel](https://ohmygit.org/)
- [move branchpointer to different commit] (https://www.w3docs.com/snippets/git/how-to-move-branch-pointer-to-different-commit.html)
- [force gitpush to overwrite remote] (https://stackoverflow.com/questions/10510462/force-git-push-to-overwrite-remote-files)
