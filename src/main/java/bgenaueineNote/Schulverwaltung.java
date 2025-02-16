package bgenaueineNote;

import java.util.Map;

/**
 * Hauptklasse zur Verwaltung und Demonstration von Schüler- und Klassendaten.
 */
public class Schulverwaltung {
    /**
     * Erstellt eine Schulklasse mit Schülern und deren Noten.
     * @return Eine Schulklasse mit Schülern
     */
    public static Schulklasse createKlasse() {
        var klasse10a = new Schulklasse("10a");
        
        var noten1 = Map.of(
            Fach.MATHEMATIK, 2,
            Fach.ENGLISCH, 1
        );
        
        var noten2 = Map.of(
            Fach.MATHEMATIK, 4,
            Fach.DEUTSCH, 2,
            Fach.ENGLISCH, 5
        );
        
        var s1 = new Schueler("Max", "2008-05-14", noten1);
        var s2 = new Schueler("Anna", "2007-09-23", noten2);
        
        klasse10a.addSchueler(s1);
        klasse10a.addSchueler(s2);
        
        return klasse10a;
    }

    /**
     * Gibt die Namen aller Schüler einer Schulklasse aus.
     * @param klasse Schulklasse-Objekt
     */
    public static void printSchuelerNamen(Schulklasse klasse) {
        System.out.println("Schüler der Klasse " + klasse.getName() + ":");
        for (var s : klasse.getSchuelerListe()) {
            System.out.println("- " + s.getName());
        }
    }

    /**
     * Gibt die Noten aller Schüler aus.
     * @param klasse Schulklasse-Objekt
     */
    public static void printNoten(Schulklasse klasse) {
        System.out.println("Noten der Klasse " + klasse.getName() + ":");
        for (var s : klasse.getSchuelerListe()) {
            System.out.println(s.getName() + "'s Noten: " + s.getNoten());
        }
    }
    
    /**
     * Gibt die Mathematiknoten aller Schüler aus.
     * @param klasse Schulklasse-Objekt
     */
    public static void printMathematikNoten(Schulklasse klasse) {
        System.out.println("Mathematiknoten der Klasse " + klasse.getName() + ":");
        for (var s : klasse.getSchuelerListe()) {
            var matheNote = s.getNoten().get(Fach.MATHEMATIK);
            if (matheNote != null) {
                System.out.println(s.getName() + "'s Mathematiknote: " + matheNote);
            }
        }
    }
    
    public static void main(String[] args) {
        var klasse10a = createKlasse();
        printSchuelerNamen(klasse10a);
        printNoten(klasse10a);
        printMathematikNoten(klasse10a);
    }
}
