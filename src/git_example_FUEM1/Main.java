package git_example_FUEM1;

import geometric_shapes.*;
import Game.*;
import demonstration.Hangman_Demo;

public class Main {

	public static void main(String[] args) {
		// System.out.println("Hallo Fachinformatiker! :)");
		
		// 1. Grafische Oberfläche / layouts
		// 2. Mathematische Operatoren (Vergleiche, Bedingungen)
		// 3. Logik, Datenverarbeitung
		// 4. Klassen, Vererbung, Methoden, Polymorphie, Instanziierung
		
		// Demonstration der Datentypen
		// demonstration.DataTypes.demonstrateTypes();
		
		// Flächenberechnung für verschiedene Formen
//		Rectangle rectangle = new Rectangle(10, 20);
//		double totalArea = rectangle.calculateArea();
//		System.out.println(totalArea);
		
		// -> sehr gute Bezeichner, getreu dem Motto "Keep it simple stupid"
		
//		Hangman_Demo game = new Hangman_Demo();
//		game.play();
		
		SpielCode HM = new SpielCode();
	//	
		HM.Hangman();
		HM.playGame();

	}

}
