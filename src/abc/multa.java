package abc;

import java.util.Scanner; 

public class multa {

	public static void main(String[] args) {
		
	boolean Conferma;
	float VR; 
	String fine; 
	do {
		Scanner sc=new Scanner(System.in);
		Conferma = false; 
		
		
		System.out.print("Quale limite di velocità considerare? "); 
		sc.nextLine();
		
		System.out.print("Inserire la velocità rilevata: ");
		VR= sc.nextFloat();

	
	if (VR <0) {
		System.out.println("Inserisci i dati corretti");
		sc.nextLine();
	}
	
	if (VR<10) {
		System.out.println("La multa è tra i 42 e i 173 euro");
		System.out.print("Vuoi inserire un'altra velocità? (true/false)");
		Conferma = sc.nextBoolean();
	} else 
		if (VR<40) {
			System.out.println("La multa è tra i 173 e i 694 euro + perdita 3 punti");
			System.out.print("Vuoi inserire un'altra velocità? (true/false)");
			Conferma = sc.nextBoolean();
		} else
			if (VR<60) {
				System.out.println("La multa è tra i 543 e i 2170 euro + perdita 6 punti");
				System.out.print("Vuoi inserire un'altra velocità?) (true/false)");
				Conferma = sc.nextBoolean();
			} else { 
					System.out.println("La multa è tra i 845 e i 3383 euro + perdita 10 punti");
					System.out.print("Vuoi inserire un'altra velocità?) (true/false)");
					Conferma = sc.nextBoolean();
				}
			{
				System.out.print("Vuoi eseguire un'altra operazione? (true/false)" );
				Conferma = sc.nextBoolean();
				sc.close();
				
			}
	}
		while (Conferma == true); {
			System.out.println("Torna presto a trovarci!");
	}
	}
}

