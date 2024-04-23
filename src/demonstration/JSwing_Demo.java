package demonstration;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JSwing_Demo extends JFrame implements ActionListener{ 

	private JMenuBar menubar;
	private JMenuItem restartItem, endGameItem;
	private JButton tryBtn;
	private JLabel wordToGuessLbl, imgLabel;
	private JPanel mainPanel, topPanel, botPanel;
	private JTextField inputText;
	private String imgPath;
	private ImageIcon imgIcon;
	private int countImg;
	
	
	public JSwing_Demo() {
		
		// Initialisieren des Fensters
		setTitle("Java Swing Demo");
		setSize(1200, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		countImg = 1;
		
		// Bildpfad für Initialisierung
		imgPath = "res/hangman_1_8.jpg";
		imgIcon = new ImageIcon(imgPath);
		Image originalImage = imgIcon.getImage();
		imgLabel = new JLabel(imgIcon);
		
		// Bild skalieren
		
		// Erzeugen notwendiger Objekte
		inputText = new JTextField();
		tryBtn = new JButton("Prüfen");
		wordToGuessLbl = new JLabel("_ _ _ _ _ _", (int) CENTER_ALIGNMENT);
		
		// Panel erstellen
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		botPanel = new JPanel();
		botPanel.setLayout(new BorderLayout());
		
		// alle Panel befüllen
		topPanel.add(imgLabel, BorderLayout.NORTH);
		topPanel.add(wordToGuessLbl, BorderLayout.SOUTH);
		
		botPanel.add(inputText, BorderLayout.NORTH);
		botPanel.add(tryBtn, BorderLayout.SOUTH);
		
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(botPanel, BorderLayout.SOUTH);
		
		tryBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Hier Aktion durchführen
				int replaceFromIndex = countImg + 48;
				int replaceWithIndex = replaceFromIndex + 1;
				
				char startIndexToChar = (char) replaceFromIndex;
				char nextIndexToChar = (char) replaceWithIndex;
				
				imgPath = imgPath.replace(startIndexToChar, nextIndexToChar);
				imgIcon = new ImageIcon(imgPath);
				imgLabel.setIcon(imgIcon);
				countImg++;
				
			}
		});
		
		// Panel hinzufügen
		getContentPane().add(mainPanel);
		
		// Sichtbarkeit
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
