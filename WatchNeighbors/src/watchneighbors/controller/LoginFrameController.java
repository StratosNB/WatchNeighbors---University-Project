package watchneighbors.controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import watchneighbors.view.LoginFrame;
import watchneighbors.view.MainFrame;
import watchneighbors.view.RegisterDialog;
import watchneighbors.view.SignalsDialog;

public class LoginFrameController {

	private LoginFrame loginFrame;

	public LoginFrameController(LoginFrame loginFrame) {
		this.loginFrame = loginFrame;

		loginFrame.addLoginListener(new LoginListener());

	}

	class LoginListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			switch (e.getActionCommand()) {
			
			case "OPEN_SIGNALS_DIALOG":
				System.out.println("Open signals dialog");
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							new SignalsDialog();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				break;
			case "OPEN_REGISTER_DIALOG":
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							new RegisterDialog();

						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				break;
			case "OPEN_MAIN_FRAME":
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							loginFrame.getMainFrame().dispose();
							new MainFrame();

						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				break;
			}
		}
	}
}
