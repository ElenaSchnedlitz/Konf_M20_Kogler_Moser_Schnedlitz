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
 - *Elena* erstellen eines neuen branches testdrinkswine

 ## verwendete Unterlagen
 zum Aufbau der readme.md wurden folgende Unterlagen verwendet:
 - [makeareadme](https://www.makeareadme.com/)
 - [Markdown Reference](https://commonmark.org/help/)
 - [github mastering markdown](https://guides.github.com/features/mastering-markdown/)


# Vorgehen Abgabe 2
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

#### sonstiges zurr .gitignore
Zeilen 56-63 (auto-import für Gradle und Marven) einkommentiert.

.gitignore auf das Repo gepushed

## Tests für jeweilige Klasse im InteliJ erstellen
### Vorbereitung und Anlage
 - In die Klasse gehen
 - dort <kbd>Alt</kbd>+<kbd>Enter</kbd>
 - im Context-Menü *create Test*
 - ....

 verwendete Resourcen:
 https://www.jetbrains.com/help/idea/create-tests.html

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


#### Gin Class - by Tobias Kogler

#### Beer Class - by Philip Moser
keine 100% Testabdeckung, da kein Alkoholfreies Getränk getestet wurde.
