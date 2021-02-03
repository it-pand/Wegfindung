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
import javax.swing.JToolBar;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JInternalFrame;


public class MainUi {
	private static JPasswordField pwf_login;
	private static JTextField textField;
	
	public static void main(String[] args) {
		initialize();
	}
	
	public static void initialize() {
		JFrame frame = new JFrame("MainUi");
		frame.setBounds(0, 0, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JButton btn_login = new JButton("Login");
		btn_login.setBounds(10, 11, 100, 50);
		btn_login.setMargin(new Insets(8, 14, 2, 14));
		btn_login.setFont(new Font("Calibri", Font.BOLD, 28));
		
		JButton btn_help = new JButton("Hilfe");
		btn_help.setBounds(10, 72, 100, 50);
		btn_help.setMargin(new Insets(10, 14, 2, 14));
		btn_help.setFont(new Font("Calibri", Font.BOLD, 28));
		
		JButton btn_exit = new JButton("Exit");
		btn_exit.setBounds(10, 133, 100, 50);
		btn_exit.setMargin(new Insets(10, 14, 2, 14));
		btn_exit.setFont(new Font("Calibri", Font.BOLD, 28));
		
		JPanel loginpanel = new JPanel();
		loginpanel.setBounds(830, 231, 250, 150);
		loginpanel.setVisible(false);
		loginpanel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		loginpanel.setLayout(null);
		
		JButton btn_bestaetigen = new JButton("Best\u00E4tigen");
		btn_bestaetigen.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_bestaetigen.setBounds(65, 90, 120, 40);
		loginpanel.add(btn_bestaetigen);
		
		pwf_login = new JPasswordField();
		pwf_login.setBounds(65, 43, 120, 25);
		loginpanel.add(pwf_login);
		
		JScrollPane spane_help = new JScrollPane();
		spane_help.setBounds(339, 110, 330, 241);
		spane_help.setBorder(new LineBorder(new Color(130, 135, 144), 5));
		spane_help.setVisible(false);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btn_login);
		frame.getContentPane().add(btn_help);
		frame.getContentPane().add(btn_exit);
		frame.getContentPane().add(loginpanel);
		frame.getContentPane().add(spane_help);
		
		JPanel panel = new JPanel();
		spane_help.setRowHeaderView(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btn_help2 = new JButton("Symbolerkl\u00E4rung");
		panel.add(btn_help2);
		
		JButton btn_help1 = new JButton("Funktionsweise");
		btn_help1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btn_help1);
		
		JButton btn_back = new JButton("Zur\u00FCck");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				spane_help.setVisible(false);
			}
		});
		panel.add(btn_back);
		
		JPanel panel_1 = new JPanel();
		spane_help.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl_helptext = new JLabel("New label");
		lbl_helptext.setBounds(10, 11, 189, 189);
		panel_1.add(lbl_helptext);
		
		JPanel panel_2 = new JPanel();
		spane_help.setColumnHeaderView(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lbl_search = new JLabel("Suche:");
		lbl_search.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lbl_search);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		
		
		
		
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
				System.out.println("Funktioniert lel");
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
