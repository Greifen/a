package bset;

import java.util.Set;
import java.util.TreeSet;

// Klasse Schulklasse
public class Schulklasse {
    private String name;
    private Set<Schueler> schuelerListe;

    // Konstruktor
    public Schulklasse(String name) {
        this.name = name;
        this.schuelerListe = new TreeSet<>();
    }

    public Schulklasse(String name, Set<Schueler> schuelerListe) {
        this.name = name;
        this.schuelerListe = new TreeSet<>(schuelerListe);
    }

    // Schüler hinzufügen
    public void addSchueler(Schueler schueler) {
        schuelerListe.add(schueler);
    }

    // Ausgabe der Schülernamen
    public void printSchuelerNamen() {
        System.out.println("Schüler in Klasse " + name + ":");
        for (Schueler s : schuelerListe) {
            System.out.println("- " + s.getName());
        }
    }

    // Alle Noten ausgeben
    public void printAlleNoten() {
        for (Schueler s : schuelerListe) {
            s.printNoten();
        }
    }
}

