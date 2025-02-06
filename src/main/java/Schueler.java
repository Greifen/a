import java.util.Arrays;

// Klasse Schüler
class Schueler {
    private String name;
    private int alter;
    private int[] noten;
    private int notenIndex;

    // Konstruktor
    public Schueler(String name, int alter, int notenAnzahl) {
        this.name = name;
        this.alter = alter;
        this.noten = new int[notenAnzahl];
        this.notenIndex = 0;
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
    public void addNote(int note) {
        if (notenIndex < noten.length) {
            noten[notenIndex++] = note;
        } else {
            System.out.println("Keine weiteren Noten können hinzugefügt werden.");
        }
    }
    public int[] getNoten() {
        return noten;
    }
    
    // Notenausgabe
    public void printNoten() {
        System.out.println(name + "'s Noten: " + Arrays.toString(noten));
    }
}

