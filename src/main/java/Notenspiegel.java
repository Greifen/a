
import java.util.Scanner;

public class Notenspiegel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Geben Sie die Anzahl der Schüler ein: ");
		int anzahlSchueler = scanner.nextInt();
		String x = scanner.next();
		int y = scanner.nextInt();
		double summe = 0;
		double note;
		for (int i = 1; i <= anzahlSchueler; i++) {
			System.out.print("Geben Sie die Note für Schüler " + i + " ein: ");
			note = scanner.nextDouble();
			summe += note;
		}
		double durchschnitt = summe / anzahlSchueler;
		System.out.printf("Der Notenspiegel der Klasse beträgt: %.2f%n", durchschnitt);
		scanner.close();
	}
}
