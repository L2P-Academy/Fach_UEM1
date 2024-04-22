package demonstration;

import java.util.Random;
import java.util.Scanner;

public class Hangman_Demo {
	
	private static final String[] WORDS = {"apfel", "orange", "birne", "erdbeere"};
	private static final int MAX_ATTEMPTS = 6;
	
	private String wordToGuess;
	private StringBuilder currentWord;
	private int remainingAttempts;
	
	// Zufallswort aus der Liste auswählen, Variablen belegen
	public Hangman_Demo() {
		Random random = new Random();
		wordToGuess = WORDS[random.nextInt(WORDS.length)];
		currentWord = new StringBuilder("_".repeat(wordToGuess.length()));
		remainingAttempts = MAX_ATTEMPTS;
	}
	
	public void play() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Willkommen beim Spiel Hangman!");
		
		while (remainingAttempts > 0 && currentWord.indexOf("_") != -1) {
			System.out.println("Das zu erratende Wort: " + currentWord);
			System.out.println("Du hast noch " + remainingAttempts + "Versuche übrig!");
			System.out.println("Errate den nächsten Buchstaben: ");
			char guess = scanner.next().charAt(0);
			
			// Bedingung für falsches Raten
			if (!updateCurrentWord(guess)) {
				remainingAttempts--;
				System.out.println("Der Buchstabe " + guess + " ist leider nicht im Wort enthalten!");		
			}
		}
		
		if (currentWord.indexOf("_") == -1) {
			System.out.println("Herzlichen Glückwunsch! Du hast das Wort " + wordToGuess + " erraten!");
		} else {
			System.out.println("Du hast das Wort leider nicht erraten. Das wort war " + wordToGuess);
		}
		
		System.out.println("Vielen Dank fürs Spielen!");
		scanner.close();
	}
	
	private boolean updateCurrentWord(char guess) {
		boolean found = false;
		for (int i = 0; i < wordToGuess.length(); i++) {
			if (wordToGuess.charAt(i) == guess) {
				currentWord.setCharAt(i, guess);
				found = true;
			}			
		}
		return found;
	}

}
