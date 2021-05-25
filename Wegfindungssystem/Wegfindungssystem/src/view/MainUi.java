package view;




import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;

import org.json.simple.parser.ParseException;

import controller.MainUiController;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Insets;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;



public class MainUi {
	public static JFrame frame;
	public static JPasswordField pwf_login;
	public static JButton btn_login;
	public static JButton btn_exit;
	public static JPanel loginpanel;
	public static JButton btn_bestaetigen;
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
	public static JButton keypad_back;
	public static JLabel lbl_map;
	public static JButton btn_keypadback;
	public static JButton btn_logout;
	
	public static String passwordinput = "";

	
	
	public static void main(String[] args) {
		new MainUi();
	}
	
	public MainUi() {
		
		frame = new JFrame("MainUi");
		frame.setBounds(0, 0, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);

		btn_login = new JButton("Login");
		btn_login.setBounds(10, 11, 118, 50);
		btn_login.setMargin(new Insets(8, 14, 2, 14));
		btn_login.setFont(new Font("Calibri", Font.BOLD, 28));
		
		btn_exit = new JButton("Exit");
		btn_exit.setBounds(144, 10, 100, 50);
		btn_exit.setMargin(new Insets(10, 14, 2, 14));
		btn_exit.setFont(new Font("Calibri", Font.BOLD, 28));
		
		lbl_map = new JLabel("");
		lbl_map.setBounds(10, 77, 907, 657);
		
		frame.getContentPane().setLayout(null);
		
		loginpanel = new JPanel();
		loginpanel.setBounds(780, 320, 360, 440);
		loginpanel.setVisible(false);
		loginpanel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		loginpanel.setLayout(null);
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btn_login);
		frame.getContentPane().add(btn_exit);
		frame.getContentPane().add(lbl_map);
		frame.getContentPane().add(loginpanel);
		
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
		

		keypad_back = new JButton("Zur\u00FCck");
		loginpanel.add(keypad_back);
		keypad_back.setFont(new Font("Tahoma", Font.BOLD, 14));
		keypad_back.setBounds(79, 360, 81, 60);
		frame.getContentPane().add(btn_login);
		frame.getContentPane().add(btn_exit);
		frame.getContentPane().add(lbl_map);

		
		lbl_map.setIcon(new ImageIcon("src/map.jpg"));
		
		btn_logout = new JButton("Logout");
		btn_logout.setFont(new Font("Calibri", Font.BOLD, 28));
		btn_logout.setBounds(10, 11, 118, 50);
		btn_logout.setVisible(false);
		frame.getContentPane().add(btn_logout);
		
		createEvents();
	}
	
	public static void createEvents() {
		
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
			
		
		keypad_enter.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				try {
					MainUiController.btnlogin();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
		
		keypad_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				loginpanel.setVisible(false);
			}
		});
		
		btn_logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn_logout.setVisible(false);
				btn_login.setVisible(true);
			}
		});
		
	}
}
