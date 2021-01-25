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

	private JFrame frame;
	private JTextField txt_login;

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
		
		
		JPanel panel = new JPanel();
		panel.setVisible(false);
		panel.setBounds(395, 115, 268, 210);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txt_login = new JTextField();
		txt_login.setBounds(91, 59, 86, 20);
		panel.add(txt_login);
		txt_login.setColumns(10);
		
		JButton Btn_bestaetigen = new JButton("Best\u00E4tigen");
		Btn_bestaetigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = txt_login.getText();
				if (password.equals("Hallo")) {
					panel.setVisible(false);		
				} else {
					JOptionPane.showMessageDialog(panel , "Falscher Pin", "Fehler", JOptionPane.PLAIN_MESSAGE);
				}
				
			}
		});
		Btn_bestaetigen.setBounds(91, 90, 89, 23);
		panel.add(Btn_bestaetigen);
		
		
		JButton btn_login = new JButton("Login");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.setVisible(true);
				
			}
		});
		btn_login.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		btn_login.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btn_login.setBounds(10, 11, 98, 35);
		frame.getContentPane().add(btn_login);
	}
}
