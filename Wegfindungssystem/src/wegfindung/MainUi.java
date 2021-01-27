package wegfindung;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Insets;
import javax.swing.JPasswordField;


public class MainUi {
	private static JPasswordField pwf_login;
	
	public static void main(String[] args) {
		initialize();
	}
	
	public static void initialize() {
		JFrame frame = new JFrame("MainUi");
		frame.setBounds(0, 0, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btn_login = new JButton("Login");
		btn_login.setMargin(new Insets(8, 14, 2, 14));
		btn_login.setFont(new Font("Calibri", Font.BOLD, 28));
		btn_login.setBounds(10, 11, 100, 50);
		frame.getContentPane().add(btn_login);
		
		JButton btn_Hilfe = new JButton("Hilfe");
		btn_Hilfe.setMargin(new Insets(10, 14, 2, 14));
		btn_Hilfe.setFont(new Font("Calibri", Font.BOLD, 28));
		btn_Hilfe.setBounds(10, 72, 100, 50);
		frame.getContentPane().add(btn_Hilfe);
		
		JButton btn_exit = new JButton("Exit");
		btn_exit.setMargin(new Insets(10, 14, 2, 14));
		btn_exit.setFont(new Font("Calibri", Font.BOLD, 28));
		btn_exit.setBounds(10, 133, 100, 50);
		frame.getContentPane().add(btn_exit);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setVisible(false);
		loginPanel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		loginPanel.setBounds(402, 212, 250, 150);
		frame.getContentPane().add(loginPanel);
		loginPanel.setLayout(null);
		
		JButton btn_bestaetigen = new JButton("Best\u00E4tigen");
		btn_bestaetigen.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_bestaetigen.setBounds(65, 90, 120, 40);
		loginPanel.add(btn_bestaetigen);
		
		pwf_login = new JPasswordField();
		pwf_login.setBounds(65, 43, 120, 25);
		loginPanel.add(pwf_login);
		
		
		
		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		
		btn_login.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				loginPanel.setVisible(true);
	
			}
		});
		
		btn_Hilfe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
			
		
		btn_bestaetigen.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String Password = pwf_login.getText();
				
				if(Password.equals("login")) {
				pwf_login.setText("");
				frame.setVisible(false);
				AdministrationsUi AuI = new AdministrationsUi();
				AuI.initialize();
				}else if(Password.equals("login2")) {
					pwf_login.setText("");
					frame.setVisible(false);
					MitarbeiterUi MuI = new MitarbeiterUi();
					MuI.initialize();
				}else {
					JOptionPane.showMessageDialog(loginPanel, "Entweder wurde der Pin falsch eingetippt \noder dieser existiert nicht.", "Falscher Pin", JOptionPane.DEFAULT_OPTION);
		
				}
				
			}
		});
		
		
		
	}
}
