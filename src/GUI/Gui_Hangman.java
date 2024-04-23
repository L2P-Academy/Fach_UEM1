package GUI;

import java.awt.Color;

import javax.swing.*;

public class Gui_Hangman extends JFrame {
	
		//Variablen
	private JButton startGame;
	private int scaledWidth,scaledHeight;
	private JPanel panelBildHangman;
	private JPanel panelBtnPruefen;
	private JLabel resImageHangman;
	private JTextField wordToLookFor;
	private String[] imageHangmanPath;

	public Gui_Hangman() {
		// Hier Fenster initialisieren -> Title, Size, CloseOperation
		
			setTitle("Hangman");
			setSize(1200,900);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// getContentPane(); für Panel
			
			// SetVisible
			setVisible(true);
			
	}	
//			
//		// Panel für den Hangman
//			
//			panelBildHangman = new JPanel ();
//			
//			
//			
//		
//		// Objeke mit "new"
//	imageHangmanPath = new String[] {"res/Hangman_1_8.jpg","res/Hangman_2_8.jpg","res/Hangman_3_8.jpg","res/Hangman_4_8.jpg","res/Hangman_5_8.jpg","res/Hangman_6_8.jpg","res/Hangman_7_8.jpg","res/Hangman_8_8.jpg"};
//	startGame = new jButton("Neues Spiel Starten");
//	
//		// Hinzufügen von Objekten
//		
//		// getContentPane und setVisible (am Ende)
//		
//		JPanel panel = new JPanel();
//		JLabel label = new JLabel("Sie Sie das ?");
//		JTextField tfName = new JTextField("Max Mustermann", 33);
//		tfName.setForeground(Color.BLUE);
//		tfName.setBackground(Color.YELLOW);
//		panel.add(tfName);
//		JButton button = new JButton("Ja");
//		panel.add(button);
//	}

}