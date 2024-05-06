package abc;

import java.util.Scanner; 

public class Abccc {

	public static void main(String[] args) {
		float peso, altezza, bmi; 
		String intervallo; 
		Scanner sc=new Scanner(System.in);
		boolean conferma = false;
		
		bmi=0;
		System.out.print("Inserisci il tuo peso in kg: ");
		peso = sc.nextFloat(); 
		sc.nextLine();
		
		System.out.print("Inserisci la tua altezza in metri: ");
		altezza= sc.nextFloat();
		
		if (peso<0 || altezza<0 && altezza<2.50) {
			System.out.println("Dati invalidi. Inserire valori positivi e validi.");
		}
		else bmi = peso / (altezza*altezza);
		
		if (bmi<16) {
			intervallo="La fascia BMI è grave magrezza."; 
			System.out.println("L'indice BMI è: " + String.format("%.2f", bmi) + ". La fascia BMI è: " + intervallo); 
		} 
		else if (bmi<18.50) {
			intervallo="La fascia BMI è normopeso.";
			System.out.println("L'indice BMI è: " + String.format("%.2f", bmi) + ". La fascia BMI è: " + intervallo); 
			
		}
		else if (bmi<30) {
			intervallo="La fascia BMI è sovrappeso"; 
			System.out.println("L'indice BMI è: " + String.format("%.2f", bmi) + ". La fascia BMI è: " + intervallo); 
			
		}
		else if (bmi<35) {
			intervallo="La fascia BMI è obeso classe 1";
			System.out.println("L'indice BMI è: " + String.format("%.2f", bmi) + ". La fascia BMI è: " + intervallo); 
			
		}
		else if (bmi<40) {
			intervallo="La fascia BMI è obeso classe 2"; 
			System.out.println("L'indice BMI è: " + String.format("%.2f", bmi) + ". La fascia BMI è: " + intervallo); 
			
		}
		else {
			intervallo="La fascia BMI è obeso classe 3";
			System.out.println("L'indice BMI è: " + String.format("%.2f", bmi) + ". La fascia BMI è: " + intervallo); 
			
		}
		
		if (conferma ==false); {
			System.out.println("Alla prossima!");
		}
			
		
		do {		
			System.out.println("Vuoi effettuare un altro calcolo? (true|false)");
			sc.nextBoolean();
			sc.close();
		}
		while (conferma ==true); 
	}
			
	}


