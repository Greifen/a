package bset;

import java.util.HashSet;
import java.util.Set;

//Hauptklasse zur Demonstration
public class Schulverwaltung {
 public static void main(String[] args) {
     // Klasse 10a erstellen
     Schulklasse klasse10a = new Schulklasse("10a");
     
     // Schüler erstellen
     Schueler s1 = new Schueler("Max", 15);
     Schueler s2 = new Schueler("Anna", 16);
     Schueler s3 = new Schueler("Lukas", 15);
     
     // Noten hinzufügen
     s1.addNote("Mathe", 1, 2);
     s1.addNote("Mathe", 2, 3);
     s1.addNote("Englisch", 1, 1);
     
     s2.addNote("Mathe", 1, 4);
     s2.addNote("Deutsch", 1, 2);
     s2.addNote("Englisch", 1, 5);
     
     s3.addNote("Mathe", 1, 3);
     s3.addNote("Deutsch", 1, 1);
     s3.addNote("Englisch", 1, 2);
     
     // Neue Noten setzen ohne Überschreiben
     s1.addNote("Mathe", 3, 5);
     s2.addNote("Deutsch", 2, 3);
     
     // Schüler zur Klasse hinzufügen
     klasse10a.addSchueler(s1);
     klasse10a.addSchueler(s2);
     klasse10a.addSchueler(s3);
     
     // Alle Schülernamen ausgeben
     klasse10a.printSchuelerNamen();
     
     // Alle Noten ausgeben
     klasse10a.printAlleNoten();
     
     // Neue Schulklasse 10b mit Sortierung nach Namen
     Set<Schueler> schuelerListe = new HashSet<>();
     schuelerListe.add(s1);
     schuelerListe.add(s2);
     schuelerListe.add(s3);
     Schulklasse klasse10b = new Schulklasse("10b", schuelerListe);
     
     // Alle Schüler der Klasse 10b ausgeben
     klasse10b.printSchuelerNamen();
 }
}

