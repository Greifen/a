// Hauptklasse zur Demonstration
public class Schulverwaltung {
    public static void main(String[] args) {
        // Klasse 10a erstellen
        Schulklasse klasse10a = new Schulklasse("10a", 3);
        
        // Schüler erstellen
        Schueler s1 = new Schueler("Max", 15, 3);
        Schueler s2 = new Schueler("Anna", 16, 3);
        Schueler s3 = new Schueler("Lukas", 15, 3);
        
        // Noten hinzufügen
        s1.addNote(2);
        s1.addNote(3);
        s1.addNote(1);
        
        s2.addNote(4);
        s2.addNote(2);
        s2.addNote(5);
        
        s3.addNote(3);
        s3.addNote(1);
        s3.addNote(2);
        
        // Schüler zur Klasse hinzufügen
        klasse10a.addSchueler(s1);
        klasse10a.addSchueler(s2);
        klasse10a.addSchueler(s3);
        
        // Alle Schülernamen ausgeben
        klasse10a.printSchuelerNamen();
        
        // Alle Noten ausgeben
        klasse10a.printAlleNoten();
    }
}