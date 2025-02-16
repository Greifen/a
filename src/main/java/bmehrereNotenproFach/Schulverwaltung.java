package bmehrereNotenproFach;

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
        Schulklasse klasse10a = new Schulklasse("10a");
        
        Map<String, Map<Integer, Integer>> noten1 = Map.of(
            "Mathe", Map.of(1, 2, 2, 3),
            "Englisch", Map.of(1, 1)
        );
        
        Map<String, Map<Integer, Integer>> noten2 = Map.of(
            "Mathe", Map.of(1, 4),
            "Deutsch", Map.of(1, 2),
            "Englisch", Map.of(1, 5)
        );
        
        Schueler s1 = new Schueler("Max", "2008-05-14", noten1);
        Schueler s2 = new Schueler("Anna", "2007-09-23", noten2);
        
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
        for (Schueler s : klasse.getSchuelerListe()) {
            System.out.println("- " + s.getName());
        }
        System.out.println();
    }

    /**
     * Gibt die Noten aller Schüler aus.
     * @param klasse Schulklasse-Objekt
     */
    public static void printNoten(Schulklasse klasse) {
        System.out.println("Noten der Klasse " + klasse.getName() + ":");
        for (Schueler s : klasse.getSchuelerListe()) {
            System.out.println(s.getName() + "'s Noten: " + s.getNoten());
        }
        System.out.println();
    }
    
    /**
     * Gibt die Mathematiknoten aller Schüler aus.
     * @param klasse Schulklasse-Objekt
     */
    public static void printMathematikNoten(Schulklasse klasse) {
        System.out.println("Mathematiknoten der Klasse " + klasse.getName() + ":");
        for (Schueler s : klasse.getSchuelerListe()) {
            Map<Integer, Integer> matheNoten = s.getNoten().get("Mathe");
            if (matheNoten != null) {
                System.out.println(s.getName() + "'s Mathematiknoten: " + matheNoten);
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Schulklasse klasse10a = createKlasse();
        printSchuelerNamen(klasse10a);
        printNoten(klasse10a);
        printMathematikNoten(klasse10a);
    }
}

