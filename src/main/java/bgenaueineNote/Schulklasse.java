package bgenaueineNote;

import java.util.Set;
import java.util.TreeSet;

 /**
   * Klasse zur Verwaltung einer Schulklasse mit Schülern.
   */
public class Schulklasse {
    private String name;
    private Set<Schueler> schuelerListe;

    public Schulklasse(String name) {
        this.name = name;
        this.schuelerListe = new TreeSet<>();
    }

    public void addSchueler(Schueler schueler) {
        schuelerListe.add(schueler);
    }

    public Set<Schueler> getSchuelerListe() {
        return schuelerListe;
    }
    
    public String getName() {
        return name;
    }
}
