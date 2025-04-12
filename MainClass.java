import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Contatore contatore = new Contatore();
		String comando;

		System.out.println("Contatore: (+ per aumentare, - per diminuire, = per vedere lo stato, 0 per uscire)");

		while (true) {
			System.out.print("Comando: ");
			comando = scanner.nextLine();

			switch (comando) {// ogni case e un caso differente
			case "+":
				contatore.aumenta();
				System.out.println("Contatore aumentato.");
				break;
			case "-":
				contatore.diminuisci();
				System.out.println("Contatore diminuito.");
				break;
			case "=":
				System.out.println("Stato attuale contatore: " + contatore.getValore());
				break;
			case "0":
				System.out.println("Uscita dal programma.");
				scanner.close();
				return;
			default:// utilizzato quando nessuno dei casi precedenti corrisponde
				System.out.println("Comando non riconosciuto. riprova in seguito.");
			}
		}
	}
}
