package watchneighbors.view;

import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

public class RegisterDialog {

	private JDialog mainDialog;

	private UserInfoInputForm form;

	private JButton cancelBtn;
	private JButton registerBtn;

	public RegisterDialog() {
		form = new UserInfoInputForm();
		initJButtons();
		initMainDialog();
	}

	protected void initJButtons() {
		cancelBtn = new JButton("Cancel");
		registerBtn = new JButton("Register");
	}

	protected void initMainDialog() {
		mainDialog = new JDialog();
		mainDialog.getContentPane().setBackground(SystemColor.activeCaption);
		mainDialog.setTitle("Register");
		mainDialog.setBounds(450, 160, 410, 420);
		mainDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainDialog.setModal(true);
		mainDialog.setResizable(false);
		mainDialog.getContentPane().setLayout(new MigLayout("fill, wrap 1", "[]", "[][][]"));
		mainDialog.getContentPane().add(form.getPersonalInfoPanel(), "cell 0 0,grow");
		mainDialog.getContentPane().add(form.getGeolocationPanel(), "cell 0 1,grow");
		mainDialog.getContentPane().add(cancelBtn, "cell 0 2,alignx right,growy");
		mainDialog.getContentPane().add(registerBtn, "cell 0 2,alignx right,growy");
		mainDialog.setVisible(true);
	}

	protected void setActionCommands() {

	}
}
