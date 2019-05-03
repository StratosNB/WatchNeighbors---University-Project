package watchneighbors.view;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class LoginFrame {

	private JFrame mainFrame;
	private JPanel credentialsPanel;

	private JLabel idLbl;
	private JLabel passwordLbl;

	private JTextField idTxtField;
	private JPasswordField passwordTxtField;

	private JButton loginBtn;
	private JButton registerBtn;
	private JButton signalsBtn;

	public LoginFrame() {
		initComponents();
	}

	protected void initComponents() {
		initLabels();
		initTexts();
		initButtons();
		initCredentialsPanel();
		initFrame();
	}

	protected void initLabels() {
		idLbl = new JLabel("ID:");
		passwordLbl = new JLabel("Password:");
	}

	protected void initTexts() {
		idTxtField = new JTextField(12);
		passwordTxtField = new JPasswordField(12);
	}

	protected void initButtons() {
		loginBtn = new JButton("Login");
		registerBtn = new JButton("Register");
		signalsBtn = new JButton("Signals");
		setActionCommands();
	}

	protected void initCredentialsPanel() {
		credentialsPanel = new JPanel(new MigLayout("fill", "[][]", "[][][][]"));
		credentialsPanel.setBackground(new Color(255, 255, 255));
		credentialsPanel.add(idLbl, "cell 0 1,alignx right");
		credentialsPanel.add(idTxtField, "cell 1 1,growx");
		credentialsPanel.add(passwordLbl, "cell 0 2,alignx right,aligny top");
		credentialsPanel.add(passwordTxtField, "cell 1 2,growx,aligny top");
		credentialsPanel.add(loginBtn, "cell 1 3,alignx right,aligny top");
	}

	protected void initFrame() {
		mainFrame = new JFrame();
		mainFrame.getContentPane().setBackground(SystemColor.inactiveCaption);
		mainFrame.getContentPane().setLayout(new MigLayout("fill", "[][][]", "[]"));
		mainFrame.setTitle("WatchNeighbors - Login");
		mainFrame.setSize(350, 300);
		mainFrame.setResizable(false);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMainFrameComponents();
	}

	protected void setMainFrameComponents() {
		mainFrame.getContentPane().add(credentialsPanel, "cell 1 2");
		mainFrame.getContentPane().add(signalsBtn, "cell 0 4,alignx center");
		mainFrame.getContentPane().add(registerBtn, "cell 2 4,alignx center");
	}

	protected void setActionCommands() {
		registerBtn.setActionCommand("OPEN_REGISTER_DIALOG");
		loginBtn.setActionCommand("OPEN_MAIN_FRAME");
		signalsBtn.setActionCommand("OPEN_SIGNALS_DIALOG");
	}

	public void show() {
		mainFrame.setVisible(true);
	}

	public void addLoginListener(ActionListener loginListener) {
		registerBtn.addActionListener(loginListener);
		loginBtn.addActionListener(loginListener);
		signalsBtn.addActionListener(loginListener);
	}
	
	public JFrame getMainFrame(){
		return this.mainFrame; 
	}
}