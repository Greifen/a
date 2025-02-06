package bInformatiker;

public class Schueler {
	private int alter;
	private String name;
	private List<int> noten;
	

	/**Dies ist der Konstruktor um einen Schüler zu erzeugen.
	 * @alter Alter
	 * @name Name
	 * @noten Notenliste
	 */
	public Schueler(int alter, String name, int[] noten) {
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
	
	public void setNoten(int[] n) {
		noten=n;
	}
	
	//Noten: 2 3 4
	public void notenAusgabe() {
		System.out.print("Noten: ");
		
		for(int i=0; i<noten.length; i++) {
			System.out.print(noten[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] noten = {2,3,4};
		Schueler schueler = new Schueler(10,"Karin",noten);
		schueler.notenAusgabe();
	}
}
