package bInformatiker;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class Schulklasse {

	private String name;
	private Set<Schueler> schuelerListe;


	public Schulklasse(String name, Set<Schueler> schuelerListe) {
		super();
		this.name = name;
		this.schuelerListe = schuelerListe;
	}


	public static void main(String args[]) {
		Schulklasse schulklasse = erzeugeKlasse();
		schülernamenAusgabe(schulklasse);
		notenAusgabe(schulklasse);
	}

	/**
	 * Erzeuge Schülerobjekte für die Klasse 10a
	 * @return
	 */
	private static Schulklasse erzeugeKlasse() {
		Map<String, Map<Integer, Integer>> noten = new HashMap<>();
		noten.put("Mathematik", new HashMap<>());
		noten.get("Mathematik").put(1, 2);
		noten.get("Mathematik").put(2, 3);
		noten.get("Mathematik").put(3, 4);
		noten.put("Deutsch", new HashMap<>());
		noten.get("Deutsch").put(1, 2);
		noten.get("Deutsch").put(2, 3);
		noten.get("Deutsch").put(3, 4);
		Schueler schueler1 = new Schueler(10,"Karin",noten);

		Map<String, Map<Integer, Integer>> noten2 = new HashMap<>();
		noten.put("Mathematik", new HashMap<>());
		noten.get("Mathematik").put(1, 2);
		noten.get("Mathematik").put(2, 3);
		noten.get("Mathematik").put(3, 4);
		noten.put("Deutsch", new HashMap<>());
		noten.get("Deutsch").put(1, 2);
		noten.get("Deutsch").put(2, 3);
		noten.get("Deutsch").put(3, 4);
		Schueler schueler2 = new Schueler(10,"Anton",noten2);
		
		//Treeset aber wie sortieren nach Namen?
		Set<Schueler> schuelerListe = new HashSet<>();
		schuelerListe.add(schueler1);
		schuelerListe.add(schueler2);
		return new Schulklasse("10b", schuelerListe);
	}
	
	/**
	 * Lasse alle Schülernamen der Klasse ausgeben
	 * @param schulklasse
	 */
	private static void schülernamenAusgabe(Schulklasse schulklasse) {
		Set<Schueler> schuelerliste = schulklasse.getSchuelerliste();
		System.out.print("Schüler der Klasse " + schulklasse.getName() + ": ");
		
		for (Schueler schueler : schuelerliste) {
			System.out.print(schueler.getName() + " ");
		}

	}
	
	/**
	 * Lasse alle Noten ausgeben (spezial: alle Mathenoten)
	 * @param schulklasse
	 */
	private static void notenAusgabe(Schulklasse schulklasse) {
		// TODO Auto-generated method stub
		
	}

	private String getName() {
		return name;
	}

	private Set<Schueler> getSchuelerliste() {
		return schuelerListe;
	}

}
