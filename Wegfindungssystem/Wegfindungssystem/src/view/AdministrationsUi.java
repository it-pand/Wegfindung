package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;

import controller.AdministrationsUiController;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Insets;

public class AdministrationsUi {
	
		public static JFrame frame;
		public static JButton btn_back;
		
		public static void main(String[] args) {
			new AdministrationsUi();
		}
	
	public AdministrationsUi() {
		frame = new JFrame("AdministrationsUi");
		frame.setBounds(0, 0, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		btn_back = new JButton("Zur\u00FCck");
		btn_back.setBounds(122, 76, 89, 23);
		frame.getContentPane().add(btn_back);
		
		createEvents();
	}
	
	public static void createEvents(){
		
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdministrationsUiController.backtomain();			
		}
		});
	}
}
