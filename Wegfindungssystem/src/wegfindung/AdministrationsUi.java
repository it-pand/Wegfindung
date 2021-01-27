package wegfindung;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class AdministrationsUi {
		
		public static void main(String[] args) {
			initialize();
			
		}
	
	public static void initialize() {
		JFrame frame = new JFrame("AdministrationsUi");
		frame.setBounds(0, 0, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(159, 65, 89, 23);
		frame.getContentPane().add(btnNewButton);
		frame.setVisible(true);
	}
}

