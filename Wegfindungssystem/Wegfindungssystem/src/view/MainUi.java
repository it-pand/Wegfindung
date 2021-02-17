package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;

import controller.MainUiController;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Point;

import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JInternalFrame;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import java.awt.ComponentOrientation;
import javax.swing.UIManager;
import javax.swing.JScrollBar;


public class MainUi {
	public static JFrame frame;
	public static JPasswordField pwf_login;
	public static JTextField txt_searchfield;
	public static JButton btn_login;
	public static JButton btn_help;
	public static JButton btn_exit;
	public static JPanel loginpanel;
	public static JButton btn_bestaetigen;
	public static JScrollPane spane_help;
	public static JPanel helpbuttonspanel;
	public static JButton btn_Symbolerklärung;
	public static JButton btn_Funktionsweise;
	public static JButton btn_back;
	public static JPanel helptextpanel;
	public static JPanel searchpanel;
	public static JButton keypad_0;
	public static JButton keypad_1;
	public static JButton keypad_2;
	public static JButton keypad_3;
	public static JButton keypad_4;
	public static JButton keypad_5;
	public static JButton keypad_6;
	public static JButton keypad_7;
	public static JButton keypad_8;
	public static JButton keypad_9;
	public static JButton keypad_enter;
	public static JButton keypad_delete;
	public static JButton btn_searchfunction;
	public static JLabel lbl_map;
	public static JButton btn_keypadback;
	public static JTextPane txtpn_helptext;
	public static JScrollPane scrollbar;
	
	
	public static String passwordinput = "";
	
	
	public static void main(String[] args) {
		new MainUi();
	}
	
	public MainUi() {
		
		frame = new JFrame("MainUi");
		frame.setBounds(0, 0, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		btn_login = new JButton("Login");
		btn_login.setBounds(10, 11, 100, 50);
		btn_login.setMargin(new Insets(8, 14, 2, 14));
		btn_login.setFont(new Font("Calibri", Font.BOLD, 28));
		
		btn_help = new JButton("Hilfe");
		btn_help.setBounds(120, 10, 100, 50);
		btn_help.setMargin(new Insets(10, 14, 2, 14));
		btn_help.setFont(new Font("Calibri", Font.BOLD, 28));
		
		btn_exit = new JButton("Exit");
		btn_exit.setBounds(230, 10, 100, 50);
		btn_exit.setMargin(new Insets(10, 14, 2, 14));
		btn_exit.setFont(new Font("Calibri", Font.BOLD, 28));
		
		lbl_map = new JLabel("");
		lbl_map.setBounds(10, 72, 907, 657);
		
		loginpanel = new JPanel();
		loginpanel.setBounds(1535, 11, 359, 438);
		loginpanel.setVisible(false);
		loginpanel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		loginpanel.setLayout(null);
		
		spane_help = new JScrollPane();
		spane_help.setBounds(1509, 461, 330, 241);
		spane_help.setBorder(new LineBorder(new Color(130, 135, 144), 5));
		spane_help.createVerticalScrollBar();
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btn_login);
		frame.getContentPane().add(btn_help);
		frame.getContentPane().add(btn_exit);
		frame.getContentPane().add(lbl_map);
		frame.getContentPane().add(loginpanel);
		frame.getContentPane().add(spane_help);
		
		keypad_enter = new JButton("Eingabe");
		keypad_enter.setActionCommand("");
		keypad_enter.setFont(new Font("Tahoma", Font.BOLD, 14));
		keypad_enter.setBounds(170, 360, 109, 60);
		loginpanel.add(keypad_enter);
		
		keypad_delete = new JButton("L\u00F6schen");
		keypad_delete.setFont(new Font("Tahoma", Font.BOLD, 14));
		keypad_delete.setBounds(79, 289, 130, 60);
		loginpanel.add(keypad_delete);
		
		keypad_0 = new JButton("0");
		keypad_0.setFont(new Font("Tahoma", Font.BOLD, 14));
		keypad_0.setBounds(219, 289, 60, 60);
		loginpanel.add(keypad_0);
		
		keypad_1 = new JButton("1");
		keypad_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		keypad_1.setBounds(79, 76, 60, 60);
		loginpanel.add(keypad_1);
		
		keypad_2 = new JButton("2");
		keypad_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		keypad_2.setBounds(149, 76, 60, 60);
		loginpanel.add(keypad_2);
		
		keypad_3 = new JButton("3");
		keypad_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		keypad_3.setBounds(219, 76, 60, 60);
		loginpanel.add(keypad_3);
		
		keypad_4 = new JButton("4");
		keypad_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		keypad_4.setBounds(79, 147, 60, 60);
		loginpanel.add(keypad_4);
		
		keypad_5 = new JButton("5");
		keypad_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		keypad_5.setBounds(149, 147, 60, 60);
		loginpanel.add(keypad_5);
		
		keypad_6 = new JButton("6");
		keypad_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		keypad_6.setBounds(219, 147, 60, 60);
		loginpanel.add(keypad_6);
		
		keypad_7 = new JButton("7");
		keypad_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		keypad_7.setBounds(79, 218, 60, 60);
		loginpanel.add(keypad_7);
		
		keypad_8 = new JButton("8");
		keypad_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		keypad_8.setBounds(149, 218, 60, 60);
		loginpanel.add(keypad_8);
		
		keypad_9 = new JButton("9");
		keypad_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		keypad_9.setBounds(219, 218, 60, 60);
		loginpanel.add(keypad_9);
		
		pwf_login = new JPasswordField();
		pwf_login.setBounds(79, 24, 200, 41);
		loginpanel.add(pwf_login);
		pwf_login.setText("");
		
		btn_keypadback = new JButton("Zur\u00FCck");
		loginpanel.add(btn_keypadback);
		btn_keypadback.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_keypadback.setBounds(79, 360, 81, 60);
		
		helpbuttonspanel = new JPanel();
		spane_help.setRowHeaderView(helpbuttonspanel);
		helpbuttonspanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn_Funktionsweise = new JButton("Funktionsweise");
		helpbuttonspanel.add(btn_Funktionsweise);
		
		btn_Symbolerklärung = new JButton("Symbolerkl\u00E4rung");
		helpbuttonspanel.add(btn_Symbolerklärung);
		
		btn_back = new JButton("Zur\u00FCck");		
		helpbuttonspanel.add(btn_back);
		
		helptextpanel = new JPanel();
		spane_help.setViewportView(helptextpanel);
		helptextpanel.setLayout(null);
		
		txtpn_helptext = new JTextPane();
		txtpn_helptext.setEditable(false);
		txtpn_helptext.setText("Lorem ipsum dolor sit amet, Dominik sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor Alex amet. Lorem ipsum dolor sit amet, consetetur sadipscing Hallo, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem Alex dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam hallo eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita Paul gubergren, no sea takimata sanctus est Lorem ipsum dolor sit Noah.");
		txtpn_helptext.setBackground(UIManager.getColor("Button.background"));
		txtpn_helptext.setBounds(10, 11, 189, 176);
		helptextpanel.add(txtpn_helptext);
		
		scrollbar = new JScrollPane();
		scrollbar.setBounds(197, 93, 2, 2);
		scrollbar = new JScrollPane(txtpn_helptext);
		scrollbar.setBorder(null);
		scrollbar.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollbar.setBounds(0, 0, 182, 198);
		helptextpanel.add(scrollbar);
		
		searchpanel = new JPanel();
		spane_help.setColumnHeaderView(searchpanel);
		searchpanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btn_searchfunction = new JButton("Suche");
		searchpanel.add(btn_searchfunction);
		
		txt_searchfield = new JTextField();
		searchpanel.add(txt_searchfield);
		txt_searchfield.setColumns(10);	
		
		spane_help.setVisible(false);
		
		lbl_map.setIcon(new ImageIcon("/Pictures/map.jpg"));
		
		createEvents();
	}
	
	public static void createEvents() {
		
		btn_searchfunction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txtpn_helptext.getText();
				String search = txt_searchfield.getText();
				
				if(text.contains(search)) {
					System.out.println("Geht");
				}
			}
		});
		
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
			
		
		keypad_enter.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				MainUiController.btnlogin();
				pwf_login.setText(passwordinput);
			}
		});

		keypad_delete.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				passwordinput = "";
				pwf_login.setText(passwordinput);
			}
		});

		keypad_0.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				passwordinput = passwordinput + "0";
				pwf_login.setText(passwordinput);
			}
		});

		keypad_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				passwordinput = passwordinput + "1";
				pwf_login.setText(passwordinput);
			}
		});

		keypad_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				passwordinput = passwordinput + "2";
				pwf_login.setText(passwordinput);
			}
		});

		keypad_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				passwordinput = passwordinput + "3";
				pwf_login.setText(passwordinput);
			}
		});

		keypad_4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				passwordinput = passwordinput + "4";
				pwf_login.setText(passwordinput);
			}
		});

		keypad_5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				passwordinput = passwordinput + "5";
				pwf_login.setText(passwordinput);
			}
		});

		keypad_6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				passwordinput = passwordinput + "6";
				pwf_login.setText(passwordinput);
			}
		});

		keypad_7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				passwordinput = passwordinput + "7";
				pwf_login.setText(passwordinput);
			}
		});

		keypad_8.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				passwordinput = passwordinput + "8";
				pwf_login.setText(passwordinput);
			}
		});

		keypad_9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				passwordinput = passwordinput + "9";
				pwf_login.setText(passwordinput);
			}
		});
		
		btn_keypadback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				loginpanel.setVisible(false);
			}
		});
		
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				spane_help.setVisible(false);
			}
		});
		
		btn_Funktionsweise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
	}
}
