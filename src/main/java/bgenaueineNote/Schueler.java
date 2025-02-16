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
    private Map<Fach, Integer> noten;

    /**
     * Konstruktor für einen Schüler mit Noten.
     * @param name Name des Schülers
     * @param geburtsdatum Geburtsdatum im Format "yyyy-MM-dd"
     * @param noten Noten als Map von Fächern mit einer Note
     */
    public Schueler(String name, String geburtsdatum, Map<Fach, Integer> noten) {
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
    
    public void setNote(Fach fach, int note) {
        if (note < 1 || note > 6) {
            throw new IllegalArgumentException("Die Note muss zwischen 1 und 6 liegen.");
        }
        noten.put(fach, note);
    }
    
    public Map<Fach, Integer> getNoten() {
        return Collections.unmodifiableMap(noten);
    }
    
    @Override
    public int compareTo(Schueler other) {
        return this.name.compareTo(other.name);
    }
}