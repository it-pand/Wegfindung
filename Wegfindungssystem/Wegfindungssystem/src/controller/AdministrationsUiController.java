package controller;

import view.AdministrationsUi;
import view.MainUi;

public class AdministrationsUiController {

	
		public static void backtomain() {
			AdministrationsUi.frame.setVisible(false);
			MainUi MainUi = new MainUi();
		};
}
