package b;

public class Schulklasse {

	private String name;
	private Schueler[] schuelerliste;

	public Schulklasse(String n, Schueler[] s) {
		name = n;
		schuelerliste = s;
	}

	public static void main(String[] args) {
		Schulklasse schulklasse = erzeugeKlasse();
		schülernamenAusgabe(schulklasse);
		System.out.println();
		notenAusgabe(schulklasse);
		System.out.println();
		mathenotenAusgabe(schulklasse);
	}

	/**
	 * Erzeuge Schülerobjekte für die Klasse 10a
	 * @return
	 */
	private static Schulklasse erzeugeKlasse() {
		int[] noten = { 2, 3, 4 };
		Schueler schueler1 = new Schueler(15, "Karin", noten);

		int[] noten2 = { 4, 5, 4 };
		Schueler schueler2 = new Schueler(15, "Torsten", noten2);

		int[] noten3 = { 4, 5, 4 };
		Schueler schueler3 = new Schueler(15, "Maria", noten3);

		int[] noten4 = { 3, 3, 2 };
		Schueler schueler4 = new Schueler(15, "Frida", noten4);

		Schueler[] schuelerliste = { schueler1, schueler2, schueler3, schueler4 };
		return new Schulklasse("10b", schuelerliste);
	}
	
	/**
	 * Lasse alle Schülernamen der Klasse ausgeben
	 * @param schulklasse
	 */
	private static void schülernamenAusgabe(Schulklasse schulklasse) {
		Schueler[] schuelerliste = schulklasse.getSchuelerliste();
		System.out.print("Schüler der Klasse " + schulklasse.getName() + ": ");
		for (int i = 0; i < schuelerliste.length; i++) {
			System.out.print(schuelerliste[i].getName() + " ");
		}
		System.out.println();
	}
	
	/**
	 * Lasse alle Noten ausgeben
	 * @param schulklasse
	 */
	private static void notenAusgabe(Schulklasse schulklasse) {
		Schueler[] schuelerliste = schulklasse.getSchuelerliste();
		System.out.println("Noten der Klasse " + schulklasse.getName() + ": ");
		for (int i = 0; i < schuelerliste.length; i++) {
			
			int[] notenliste = schuelerliste[i].getNoten();
			System.out.print(schuelerliste[i].getName()+ ": ");
			for (int z = 0; z < notenliste.length-1; z++) {
				System.out.print(notenliste[z]+ ", ");
			}
			System.out.println(notenliste[notenliste.length-1]);
		}
	}
	
	/**
	 * Lasse alle Mathenoten
	 * @param schulklasse
	 */
	private static void mathenotenAusgabe(Schulklasse schulklasse) {
		Schueler[] schuelerliste = schulklasse.getSchuelerliste();
		System.out.println("Mathematiknoten der Klasse " + schulklasse.getName() + ": ");
		for (int i = 0; i < schuelerliste.length; i++) {
			
			int[] notenliste = schuelerliste[i].getNoten();
			System.out.print(schuelerliste[i].getName()+ ": ");
			System.out.println(notenliste[1]);
		}
	}

	private String getName() {
		return name;
	}

	private Schueler[] getSchuelerliste() {
		return schuelerliste;
	}

}
