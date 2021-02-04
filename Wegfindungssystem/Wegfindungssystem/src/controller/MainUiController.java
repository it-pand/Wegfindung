package controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import view.AdministrationsUi;
import view.MainUi;
import view.MitarbeiterUi;
import javax.swing.JPasswordField;

public class MainUiController {

	public static void btnlogin() {
		String Password = String.copyValueOf(MainUi.pwf_login.getPassword());
		MainUi.passwordinput = "";
		
		if(Password.equals("1234")) {
			MainUi.pwf_login.setText("");
			MainUi.frame.setVisible(false);
			AdministrationsUi AuI = new AdministrationsUi();
		}else if(Password.equals("4321")) {
			MainUi.pwf_login.setText("");
			MainUi.frame.setVisible(false);
			MitarbeiterUi MuI = new MitarbeiterUi();
		}else {
			JOptionPane.showMessageDialog(MainUi.loginpanel, "Entweder wurde der Pin falsch eingetippt \noder dieser existiert nicht.", "Falscher Pin", JOptionPane.DEFAULT_OPTION);

		}
	}
	
}
