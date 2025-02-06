// Klasse Schulklasse
public class Schulklasse {
    private String name;
    private Schueler[] schuelerListe;
    private int schuelerIndex;

    // Konstruktor
    public Schulklasse(String name, int maxSchueler) {
        this.name = name;
        this.schuelerListe = new Schueler[maxSchueler];
        this.schuelerIndex = 0;
    }

    // Schüler hinzufügen
    public void addSchueler(Schueler schueler) {
        if (schuelerIndex < schuelerListe.length) {
            schuelerListe[schuelerIndex++] = schueler;
        } else {
            System.out.println("Keine weiteren Schüler können hinzugefügt werden.");
        }
    }

    // Ausgabe der Schülernamen
    public void printSchuelerNamen() {
        System.out.println("Schüler in Klasse " + name + ":");
        for (int i = 0; i < schuelerIndex; i++) {
            System.out.println("- " + schuelerListe[i].getName());
        }
    }

    // Alle Noten ausgeben
    public void printAlleNoten() {
        for (int i = 0; i < schuelerIndex; i++) {
            schuelerListe[i].printNoten();
        }
    }
}