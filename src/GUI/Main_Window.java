package GUI;

import java.awt.Color;

import javax.swing.*;

public class Main_Window extends JFrame {

	public Main_Window() {
		
		// Hier Fenster initialisieren -> Title, Size, CloseOperation
		
		// Objeke mit "new"
		
		// Hinzufügen von Objekten
		
		// getContentPane und setVisible (am Ende)
		
		this.setSize(400, 400);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Sie Sie das ?");
		JTextField tfName = new JTextField("Max Mustermann", 33);
		tfName.setForeground(Color.BLUE);
		tfName.setBackground(Color.YELLOW);
		panel.add(tfName);
		JButton button = new JButton("Ja");
		panel.add(button);
	}

}