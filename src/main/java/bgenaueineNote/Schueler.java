package bgenaueineNote;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Klasse zur Darstellung eines Schülers mit Namen, Geburtsdatum und Noten.
 */
class Schueler implements Comparable<Schueler> {
    private String name;
    private LocalDate geburtsdatum;
    private Map<String, Integer> noten;

    /**
     * Konstruktor für einen Schüler mit Noten.
     * @param name Name des Schülers
     * @param geburtsdatum Geburtsdatum im Format "yyyy-MM-dd"
     * @param noten Noten als Map von Fächern mit einer Note
     */
    public Schueler(String name, String geburtsdatum, Map<String, Integer> noten) {
        this.name = name;
        this.geburtsdatum = LocalDate.parse(geburtsdatum, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.noten = noten != null ? new HashMap<>(noten) : new HashMap<>();
    }

    /**
     * Konstruktor für einen Schüler ohne Noten.
     * @param name Name des Schülers
     * @param geburtsdatum Geburtsdatum im Format "yyyy-MM-dd"
     */
    public Schueler(String name, String geburtsdatum) {
        this(name, geburtsdatum, new HashMap<>());
    }

    public String getName() {
        return name;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }
    
    public int getAlter() {
        return Period.between(geburtsdatum, LocalDate.now()).getYears();
    }
    
    public void setNote(String fach, int note) {
        noten.put(fach, note);
    }
    
    public Map<String, Integer> getNoten() {
        return noten;
    }
    
    @Override
    public int compareTo(Schueler other) {
        return this.name.compareTo(other.name);
    }
}