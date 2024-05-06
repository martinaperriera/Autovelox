package abc;

import java.util.Random;
import java.util.Scanner;

public class Autovelox {

	public static void main(String[] args) {
		int limiteVelocità, velocitàRilevata, tolleranza, eccesso, sanzione;
		String risposta;
		Scanner sc=new Scanner(System.in);
		Random r=new Random(); // dichiaro un generatore di numeri casuali
		
		
		System.out.println("Calcolo sanzioni autovelox\n\n");			//mostro il titolo e vado a capo 2 volte (\n)

		System.out.print("Inserire il limite di velocità: "); 
		limiteVelocità=sc.nextInt(); 
		sc.nextLine();

		// if (limiteVelocità%2 ==0)
		// System.out.println("Il limite è un multiplo di 2"); 
		// (/ else) if (limiteVelocità%3 ==0)
		// System.out.println("Il limite è un multiplo di 3"); 
		// (/ else) if (limiteVelocità%5 ==0)
		// System.out.println("Il limite è un multiplo di 5"); 
		// CON ELSE IF, NEL CASO DEL NUMERO 6, GLI ALTRI IF VENGONO SALTATI ED ENTRA NEL PRIMO IF VERO.  
		
		do {
			System.out.print("Inserire la velocità rilevata: "); 
			velocitàRilevata=sc.nextInt(); 
			sc.nextLine();
			
		//
			velocitàRilevata=r.nextInt();
			sc.nextLine();

	
			velocitàRilevata=r.nextInt(250)+1; // i numeri estratti andranno da 1 a 250
			System.out.println("Velocità rilevataa: "+velocitàRilevata);
			
			if (velocitàRilevata<0)
				System.out.println("Velocità non valida, reinserire"); 
			else {
				if (velocitàRilevata<100)
				tolleranza=5; //km/h
				else 
					tolleranza=velocitàRilevata*5/100; //km/h
				
				System.out.println("Tolleranza: "+tolleranza);
				eccesso=velocitàRilevata-tolleranza-limiteVelocità;
				
				if (eccesso<=0)
					sanzione=0;
				else if (eccesso<10) //tra 1 e 9: sanzione è da 42 a 173 euro
				sanzione=42+(eccesso-1)*(173-42)/8;
				//eccesso=1 => 42+0*(....)=42
				//eccesso=9 => 42+8*(....)/8=42+(173-42)=173
				else if (eccesso<40) //tra 10 e 39: sanzione è da 173 a 694
					sanzione=173+(eccesso-10)*(694-173)/29;
				else if (eccesso<60) //tra 40 e 59: sanzione è da 543 a 2170
					sanzione=543+(eccesso-40)*(2179-543)/19; 
				else { //oltre i 60: sanzione è da 845 a 3383
					sanzione=845+(eccesso-40)*(3382-845)/59; 
				if (sanzione>3382)
					sanzione=3382;
				}
				System.out.println ("Sanzione: "+sanzione);
				System.out.println ("Sanzione2: "+sanzione);
			}
				
				System.out.println("Vuoi inserire altra rilevazione (s/n)");
				risposta=sc.nextLine(); 
				
		} while(risposta.substring(0, 1).toLowerCase().equals("s")); //risposta.equals("s")); - si può fare: risposta.toLowerCase().equals("s")); - per leggere input sia maiuscola che minuscola e non bloccare il programma. - il substring invece permette di leggere solo le lettere selezionate tra parentesi 
		System.out.println("Arrivederci!");
		sc.close();

	}

}

//differenza tra else if e due if di fila:
// N % 2 = 0  (n modulo due - se il resto della divisione per 2 è 0 è divisibile, multiplo di due), stessa cosa con 3 ecc. - per i numeri multipli di entrambi tipo il 6 otterrò due output - con l'ELSE IF invece escludo una delle casistiche - va sul primo if che è presente, sulla prima condizione vera e ignora il resto. 
//usiamo l'else if quando le condizioni sono esclusive; quando le condizioni non sono esclusive come nel caso precedente è meglio usare if if. 
