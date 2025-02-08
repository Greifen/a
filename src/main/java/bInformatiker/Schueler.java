package bInformatiker;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Schueler {
	//	private Date geburtsdatum; und alter berechnen
	private int alter;

	private String name;
    private Map<String, Map<Integer, Integer>> noten;
	

	/**Dies ist der Konstruktor um einen Schüler zu erzeugen.
	 * @alter Alter
	 * @name Name
	 * @noten Notenliste
	 */
	public Schueler(int alter, String name, Map<String, Map<Integer, Integer>> noten) {
		super();
		this.alter = alter;
		this.name = name;
		this.noten = noten;
	}


	public int getAlter() {
		return alter;
	}

//	public void setAlter(int a) {
//		alter = a;
//	}

	public String getName() {
		return name;
	}



//	public void setName(String n) {
//		name = n;
//	}
	
//	public int[] getNoten() {
//		return noten;
//	}
	
	// Notenverwaltung
    public void addNote(String fach, int arbeitNummer, int note) {
        noten.putIfAbsent(fach, new HashMap<>());
        noten.get(fach).put(arbeitNummer, note);
    }
	
	//Noten: 2 3 4
	public void printNoten() {
		System.out.println(name + "'s Noten: " + noten);
	}
	
	public static void main(String[] args) {
		Map<String, Map<Integer, Integer>> noten = new HashMap<>();
		noten.put("Mathematik", new HashMap<>());
		noten.get("Mathematik").put(1, 2);
		noten.get("Mathematik").put(2, 3);
		noten.get("Mathematik").put(3, 4);
		noten.put("Deutsch", new HashMap<>());
		noten.get("Deutsch").put(1, 2);
		noten.get("Deutsch").put(2, 3);
		noten.get("Deutsch").put(3, 4);
		Schueler schueler = new Schueler(10,"Karin",noten);
		schueler.printNoten();
	}
}
