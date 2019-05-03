package watchneighbors.view;

import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class MainFrame {

	private JFrame mainFrame;
	private UserInfoInputForm modifyForm;

	private JPanel mainPanel;
	private JPanel profilePanel;
	private JPanel SignalsPanel;

	private JButton profileBtn;
	private JButton signalsBtn;
	private JButton logOutBtn;

	public MainFrame() {
		initComponents();
	}

	protected void initComponents() {

		modifyForm = new UserInfoInputForm();
		initJButtons();
		initMainFrame();
	}

	protected void initJButtons() {
		profileBtn = new JButton("Profile");
		signalsBtn = new JButton("Signals");
		logOutBtn = new JButton("Log Out");
	}

	protected void initProfilePanel() {

		profilePanel = new JPanel(new MigLayout());
		profilePanel.add(modifyForm.getPersonalInfoPanel());
	}

	protected void initSignalsPanel() {

	}

	protected void initMainPanel() {

	}

	protected void initMainFrame() {
		mainFrame = new JFrame();
		mainFrame.getContentPane().setBackground(SystemColor.inactiveCaption);
		mainFrame.getContentPane().setLayout(new MigLayout("fill", "[][]", "[][]"));
		mainFrame.setTitle("WatchNeighbors - Main Frame");
		mainFrame.setSize(400, 400);
		mainFrame.setResizable(false);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().add(profileBtn, "cell 0 1, alignx center");
		mainFrame.getContentPane().add(signalsBtn, "cell 1 1, alignx center");
		mainFrame.getContentPane().add(logOutBtn, "cell 1 0,alignx right,aligny top");
		mainFrame.setVisible(true);
	}
}
