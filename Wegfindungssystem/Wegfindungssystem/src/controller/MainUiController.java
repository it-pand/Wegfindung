package controller;

import javax.swing.JOptionPane;

import view.AdministrationsUi;
import view.MainUi;

public class MainUiController {

	public static void btnlogin() {
		String Password = String.copyValueOf(MainUi.pwf_login.getPassword());
		MainUi.passwordinput = "";
		
		switch (Password) {
		
		
		case ("1234"):{
			
			
			MainUi.pwf_login.setText("");
			MainUi.frame.setVisible(false);
			AdministrationsUi.main(null);
			break;
			}
		
		case ("4321"):{
			
			
			MainUi.pwf_login.setText("");
			MainUi.btn_logout.setVisible(true);
			MainUi.loginpanel.setVisible(false);
			MainUi.btn_login.setVisible(false);
			break;
			}
		
		default:{
			
			
			JOptionPane.showMessageDialog(MainUi.loginpanel, "Entweder wurde der Pin falsch eingetippt \noder dieser existiert nicht.", "Falscher Pin", JOptionPane.DEFAULT_OPTION);
			break;
			}
		}
	
	}
}
