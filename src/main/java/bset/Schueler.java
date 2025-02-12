package bset;

import java.util.*;

// Klasse Schüler
class Schueler implements Comparable<Schueler> {
    private String name;
    private int alter;
    private Map<String, Map<Integer, Integer>> noten;

    // Konstruktor
    public Schueler(String name, int alter) {
        this.name = name;
        this.alter = alter;
        this.noten = new HashMap<>();
    }

    // Getter und Setter für Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter und Setter für Alter
    public int getAlter() {
        return alter;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }

    // Notenverwaltung
    public void addNote(String fach, int arbeitNummer, int note) {
        noten.putIfAbsent(fach, new HashMap<>());
        noten.get(fach).put(arbeitNummer, note);
    }
    

    
    public Map<String, Map<Integer, Integer>> getNoten() {
        return noten;
    }
    
    // Notenausgabe
    public void printNoten() {
        System.out.println(name + "'s Noten: " + noten);
    }

    // Vergleichsmethode für Sortierung nach Namen
    @Override
    public int compareTo(Schueler other) {
        return this.name.compareTo(other.name);
    }
}

