package demonstration;

import java.util.Iterator;

public class DataTypes {
	
	public static void demonstrateTypes() {
		// Ganzzahl ohne Kommastellen
		int ganzZahl = 10;
		System.out.println("Ganzzahl: " + ganzZahl);
		
		// Gleitkommazahlen
		double kommaZahl = 3.14159;
		System.out.println("Double: " + kommaZahl);
		
		float ungenaueKommaZahl = 5;
		System.out.println("Float: " + ungenaueKommaZahl);
		
		// Zeichen + Zeichenketten
		
		String neueZeichenkette = "Das ist ein Text mit dem Buchstaben: ";
		String zeichenKette2 = new String("Das ist auch ein Text");
		String dasistKeineZahl = "5";
		int dasIstEineZahl;
		
		char einzelnerBuchstabe = 'a';
		
		// Manipulation von Zeichenkette
		neueZeichenkette = neueZeichenkette + einzelnerBuchstabe;
		neueZeichenkette += einzelnerBuchstabe;
		neueZeichenkette = neueZeichenkette.concat(" Angefügte Zeichenkkette");
		dasIstEineZahl = Integer.parseInt(dasistKeineZahl);
		String zahlOderText = dasIstEineZahl + "";
		
		System.out.println(neueZeichenkette);
		System.out.println(dasIstEineZahl);
		
		// Booleans / Wahrheitswerte
		boolean wahrOderFalsch = true;
		
		if (wahrOderFalsch) {
			System.out.println("Das ist nichts als die Wahrheit!");
		}
		
		// Array ("unsortierte Liste")
		int[] intArray = {1, 2, 3, 4, 5};
		System.out.println("Array: ");
		
//		for (int i = 0; i < intArray.length; i++) {
//			System.out.println(intArray[i]);
//		}
		
		for (int i : intArray) {
			System.out.println(i);
		}
		
	}

}
