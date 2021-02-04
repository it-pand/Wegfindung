package controller;

import view.MainUi;
import view.MitarbeiterUi;

public class MitarbeiterUiController {
		
		public static void backtomain() {
			MitarbeiterUi.frame.setVisible(false);
			MainUi MainUi = new MainUi();
		}

}
