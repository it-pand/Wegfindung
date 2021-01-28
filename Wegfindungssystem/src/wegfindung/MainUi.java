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
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;


public class MainUi {
	private static JPasswordField pwf_login;
	
	public static void main(String[] args) {
		initialize();
	}
	
	public static void initialize() {
		JFrame frame = new JFrame("MainUi");
		frame.setBounds(0, 0, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		
		JButton btn_login = new JButton("Login");
		btn_login.setBounds(10, 11, 100, 50);
		btn_login.setMargin(new Insets(8, 14, 2, 14));
		btn_login.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn_login);
		
		JButton btn_help = new JButton("Hilfe");
		btn_help.setBounds(10, 72, 100, 50);
		btn_help.setMargin(new Insets(10, 14, 2, 14));
		btn_help.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn_help);
		
		JButton btn_exit = new JButton("Exit");
		btn_exit.setBounds(10, 133, 100, 50);
		btn_exit.setMargin(new Insets(10, 14, 2, 14));
		btn_exit.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn_exit);
		
		JPanel loginpanel = new JPanel();
		loginpanel.setBounds(830, 231, 250, 150);
		loginpanel.setVisible(false);
		loginpanel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		frame.getContentPane().add(loginpanel);
		loginpanel.setLayout(null);
		
		JButton btn_bestaetigen = new JButton("Best\u00E4tigen");
		btn_bestaetigen.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_bestaetigen.setBounds(65, 90, 120, 40);
		loginpanel.add(btn_bestaetigen);
		
		JButton btn_helpexit = new JButton("Zur\u00FCck");
		
		pwf_login = new JPasswordField();
		pwf_login.setBounds(65, 43, 120, 25);
		loginpanel.add(pwf_login);
		
		JScrollPane spane_help = new JScrollPane();
		spane_help.setBounds(339, 103, 330, 241);
		spane_help.setBorder(new LineBorder(new Color(130, 135, 144), 5));
		spane_help.setVisible(false);
		frame.getContentPane().add(spane_help);
		
		
		btn_helpexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spane_help.setVisible(false);
			}
		});
		spane_help.setRowHeaderView(btn_helpexit);
		
		
		
		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		
		btn_login.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				loginpanel.setVisible(true);
	
			}
		});
		
		btn_help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Vela HAVLE VELA KUVETTE");
				spane_help.setVisible(true);
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
					JOptionPane.showMessageDialog(loginpanel, "Entweder wurde der Pin falsch eingetippt \noder dieser existiert nicht.", "Falscher Pin", JOptionPane.DEFAULT_OPTION);
		
				}
				
			}
		});
		
		
		
	}
}
