package wegfindung;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MainUi {

	private JFrame frame;
	private JTextField test;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUi window = new MainUi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainUi() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(0, 0, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_login = new JButton("Login");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame Login = new JFrame();
				Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Login.setBounds(500, 500, 500, 500);
				Login.setVisible(true);
				
				
				
			}
		});
		btn_login.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		btn_login.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btn_login.setBounds(10, 11, 98, 35);
		frame.getContentPane().add(btn_login);
		
		test = new JTextField();
		test.setBounds(121, 121, 86, 20);
		frame.getContentPane().add(test);
		test.setColumns(10);
	}
}
