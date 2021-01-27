package wegfindung;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class AdministrationsUi {
		
		public static void main(String[] args) {
			showWindow();
			
		}
	
	public static void showWindow() {
		JFrame frame = new JFrame("AdministrationsUi");
		frame.setBounds(0, 0, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lbl_Test = new JLabel("Das ist ein Testlable");
		lbl_Test.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Test.setFont(new Font("Calibri", Font.BOLD, 20));
		lbl_Test.setBounds(305, 200, 207, 106);
		frame.getContentPane().add(lbl_Test);
	}
		
		
}

