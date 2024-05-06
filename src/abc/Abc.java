package abc;

import java.util.Scanner;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome; // Esiste un dato (variabile) che si chiama "nome"
		nome = "Martinaaa"; // Assegno il valore "Martina" alla variabile "nome"
		Scanner sc=new Scanner (System.in);

	
		System.out.println("Ciao mondo!");
		System.out.print("Questo è il corso java di Generation"); // non va a capo
		System.out.println("Italy");
		System.out.println(nome); // stampa il contenuto della variabile nome - se metto le virgolette ciò che è
									// scritto tra virgolette
// dichiarazione delle variabili 
		String nome1;
		int età;
		float altezza;
		double pigreco;
		String cognome = "Rossi"; // dichiarazione di variabile con assegnazione (inizializzazione)

		nome1 = "Mario"; // assegno il valore "Mario" alla variabile "nome"
		età = sc.nextInt(); //leggo il prossimo intero della tastiera
		sc.nextLine(); //forzo la lettura dell'invio (per evitare che venga ignorata la lettura successiva)
		altezza = 1.5f; // assegno il valore 1.75 alla variabile altezza. Nel float si usa il . Per
						// separare le cifre decimali dalle intere. La ‘f’ finale indica un valore
						// float.
		System.out.println("Il mio nome è " + nome1); // stampo sia il messaggio che il contenuto della variabile
		System.out.println("La mia età è " + età);
		System.out.println("Io ho " + età + " anni"); // il + serve a separare più pezzettini della frase

		if (età >= 18)
			System.out.println("Sono maggiorenne"); // istruzioni da eseguire se la condizione è vera
		else
			System.out.println("Sono minorenne"); // istruzioni da eseguire se la condizione è falsa

		if (altezza > 2)
			System.out.println("Sono uno spilungone");
		// n=2+3+5=17
		// n=(2+3)*5=25
		// n=2*3+5=11
		
	if (altezza<1.50f )
		System.out.println("Non pago il biglietto per Gardaland"); //Non pago se entrambe le condizioni sono vere
	else
		System.out.println("Pago il biglietto per Gardaland");
	}
}


