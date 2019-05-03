package watchneighbors.controller;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import watchneighbors.view.LoginFrame;

public class MainController {

	private static LoginFrame loginFrame;

	public MainController() {
		loginFrame = new LoginFrame();
		LoginFrameController loginFrameController = new LoginFrameController(loginFrame);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				        if ("Nimbus".equals(info.getName())) {
				            UIManager.setLookAndFeel(info.getClassName());
				            break;
				        }
				    }
				    
				    MainController mainController = new MainController();
					loginFrame.show();
				} catch (Exception e) {
				    // If Nimbus is not available, you can set the GUI to another look and feel.
				}
		
			}
		});
	}
}
