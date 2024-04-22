package Game;

import java.util.Scanner;

public class SpielCode{

	private static final String[] WORDS = {"wort1","wort2"};
	Scanner sc = new Scanner(System.in);
	
	
	int maxAttempt= 8; 
	int remainingAttemps = maxAttempt;
	String wordToGuess;
	String currentWord;
	
	
	public void Hangman() {
		System.out.println("Zu erratendes Word eingeben");
		String wordToGuess = sc.next();
		playGame();
	}
	
	public void playGame(){
	
		
		
		System.out.println("Erate mein Wort");
		String currentWord = sc.next();
		
		if (currentWord == wordToGuess) {
			System.out.println("Du geiler Ficker hast Gewonnen!");
			Hangman();
					
		}
		
		else {
			remainingAttemps --;
			System.out.println("Leider nicht, du hast noch" + remainingAttemps + " versuche");
			drawMan();
			
		}	
		}
		
		
	public void drawMan(){
		
		
		
		if (remainingAttemps == 7) {
			System.out.println("Wrong guess, try again");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
			playGame();
		}
		if (remainingAttemps == 6) {
			System.out.println("Wrong guess, try again");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
			playGame();
		}
		if (remainingAttemps == 5) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
			playGame();
		}
		if (remainingAttemps == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
			playGame();
		}
		if (remainingAttemps == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
			playGame();
		}
		if (remainingAttemps == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			playGame();
		}
		if (remainingAttemps == 1) {
			System.out.println("GAME OVER!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      	    ");
			playGame();
		}
		if (remainingAttemps == 0) {
			System.out.println("GAME OVER!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("GAME OVER! Das Word ist " + wordToGuess);
			Hangman();
		}

	
	
	
	
	
	
	
	
	}
	
	}

	
