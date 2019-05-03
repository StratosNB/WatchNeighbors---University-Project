package watchneighbors.view;

import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;
import watchneighbors.model.CustomMapKit;

public class SignalsDialog {

	private JDialog mainDialog;

	private JPanel filterPanel;
	private JPanel mapPanel;
	private JPanel signalInfoPanel;

	private JLabel signalIdLbl;
	private JLabel eventLbl;
	private JLabel createdByLbl;
	private JLabel stateLbl;

	private JTextField signalIdTxtField;
	private JTextField eventTxtField;
	private JTextField createdByTxtField;
	private JTextField stateTxtField;

	private CustomMapKit mapKit = new CustomMapKit();

	private final String[] columnNames = new String[]{"Signal Id","Event","Created By","State"};
	private JTable signalInfoTable;
	private DefaultTableModel tableModel;

	private JButton closeBtn;
	private JButton filterBtn;

	public SignalsDialog() {
		initComponents();
	}

	protected void initComponents() {
		initJLabels();
		initJTextFields();
		initCustomMapKit();
		initSignalInfoTable();
		initJButtons();
		initFilterPanel();
		initMapPanel();
		initSignalInfoPanel();
		initMainDialog();
	}

	protected void initJLabels() {
		signalIdLbl = new JLabel("Signal Id:");
		eventLbl = new JLabel("Event:");
		createdByLbl = new JLabel("Created by:");
		stateLbl = new JLabel("State:");
	}

	protected void initJTextFields() {
		signalIdTxtField = new JTextField(10);
		eventTxtField = new JTextField(10);
		createdByTxtField = new JTextField(10);
		stateTxtField = new JTextField(10);
	}

	protected void initCustomMapKit() {
		mapKit = new CustomMapKit();
		mapKit.setZoomSliderSize(8, 100);
		mapKit.setMiniMapSize(150, 100);
	}

	protected void initSignalInfoTable() {
		tableModel = new DefaultTableModel(columnNames, 1);
		signalInfoTable = new JTable(tableModel);

	}

	protected void initJButtons() {
		closeBtn = new JButton("Close");
		filterBtn = new JButton("Filter");
	}

	protected void initFilterPanel() {
		filterPanel = new JPanel(new MigLayout("", "[][][]", "[]"));
		filterPanel.add(signalIdLbl);
		filterPanel.add(signalIdTxtField);
		filterPanel.add(eventLbl);
		filterPanel.add(eventTxtField);
		filterPanel.add(createdByLbl);
		filterPanel.add(createdByTxtField);
		filterPanel.add(stateLbl);
		filterPanel.add(stateTxtField);
		filterPanel.add(filterBtn);
	}

	protected void initMapPanel() {
		mapPanel = new JPanel(new MigLayout("fill", "[]", "[]"));
		mapPanel.add(mapKit, "cell 0 0,grow");
	}

	protected void initSignalInfoPanel() {
		signalInfoPanel = new JPanel(new MigLayout("", "[][][]", "[]"));
		signalInfoPanel.add(new JScrollPane(signalInfoTable));
	}

	protected void initMainDialog() {
		mainDialog = new JDialog();
		mainDialog.getContentPane().setBackground(SystemColor.activeCaption);
		mainDialog.setTitle("Signals");
		mainDialog.setBounds(450, 160, 600, 520);
		mainDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainDialog.setModal(true);
		mainDialog.setResizable(false);
		mainDialog.getContentPane().setLayout(new MigLayout("fill, wrap 1", "[][][][]", "[]"));
		mainDialog.getContentPane().add(filterPanel);
		mainDialog.getContentPane().add(mapPanel, "grow");
		mainDialog.getContentPane().add(signalInfoPanel, "alignx center");
		mainDialog.getContentPane().add(closeBtn, "alignx center,aligny center");
		mainDialog.setVisible(true);
	}

	protected void setActionCommands() {

	}
}
