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


public class MainUi {
	
	public static void main(String[] args) {
		showWindow();
	}
	
	public static void showWindow() {
		JFrame frame = new JFrame("MainUi");
		frame.setBounds(0, 0, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setVisible(false);
		loginPanel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		loginPanel.setBounds(340, 217, 268, 205);
		frame.getContentPane().add(loginPanel);
		loginPanel.setLayout(null);
		
		JTextField txt_login = new JTextField();
		txt_login.setBounds(83, 62, 86, 20);
		txt_login.setColumns(10);
		loginPanel.add(txt_login);
		
		
		JButton btn_login = new JButton("login");
		btn_login.setBounds(0, 0, 133, 77);
		frame.getContentPane().add(btn_login);
		btn_login.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				loginPanel.setVisible(true);
	
			}
		});
		
		
		JButton btn_bestaetigen = new JButton("Bestaetigen");
		btn_bestaetigen.setBounds(83, 93, 89, 23);
		loginPanel.add(btn_bestaetigen);
		btn_bestaetigen.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String Password = txt_login.getText();
				
				if(Password.equals("Bumsknecht")) {
				txt_login.setText("");
				frame.setVisible(false);
				AdministrationsUi AuI = new AdministrationsUi();
				AuI.showWindow();
				} else {
					JOptionPane.showMessageDialog(loginPanel, "Falscher Pin");
					
				}
				
			}
		});
		
		
	}
}
