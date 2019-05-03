package watchneighbors.view;

import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;
import watchneighbors.model.CustomMapKit;

public class UserInfoInputForm {

	private JPanel personalInfoPanel;
	private JPanel geolocationPanel;

	private CustomMapKit mapKit;

	private JLabel nameLbl;
	private JLabel surnameLbl;
	private JLabel emailLbl;
	private JLabel passwordLbl;
	private JLabel idLbl;
	private JLabel countryLbl;
	private JLabel stateLbl;
	private JLabel districtLbl;

	private JTextField nameTxtField;
	private JTextField surnameTxtField;
	private JTextField emailTxtField;
	private JPasswordField passwordTxtField;
	private JTextField idTxtField;

	private JComboBox countryCmbBox;
	private JComboBox stateCmbBox;
	private JComboBox districtCmbBox;

	public UserInfoInputForm() {
		initJLabels();
		initJTextFields();
		initJComboBoxes();
		initCustomMapKit();
		initPersonalInfoPanel();
		initGeolocationPanel();
	}

	protected void initJLabels() {
		nameLbl = new JLabel("Name:");
		surnameLbl = new JLabel("Surname:");
		emailLbl = new JLabel("Email:");
		passwordLbl = new JLabel("Password:");
		idLbl = new JLabel("ID:");
		countryLbl = new JLabel("Country:");
		stateLbl = new JLabel("State:");
		districtLbl = new JLabel("District:");
	}

	protected void initJTextFields() {
		nameTxtField = new JTextField(12);
		surnameTxtField = new JTextField(12);
		emailTxtField = new JTextField(12);
		passwordTxtField = new JPasswordField(12);
		idTxtField = new JTextField(12);
	}

	protected void initJComboBoxes() {
		countryCmbBox = new JComboBox(new String[] { "Italy", "Spain", "France" });
		stateCmbBox = new JComboBox(new String[] { "Milan", "Barcelona", "Paris" });
		districtCmbBox = new JComboBox(new String[] { "Varese" });
	}

	protected void initCustomMapKit() {
		mapKit = new CustomMapKit();
		mapKit.setZoomSliderSize(12, 140);
		mapKit.setMiniMapVisible(false);
	}

	protected void initPersonalInfoPanel() {
		personalInfoPanel = new JPanel(new MigLayout("wrap 4"));
		personalInfoPanel.setBackground(SystemColor.text);
		personalInfoPanel.add(nameLbl);
		personalInfoPanel.add(nameTxtField);
		personalInfoPanel.add(surnameLbl);
		personalInfoPanel.add(surnameTxtField);
		personalInfoPanel.add(emailLbl);
		personalInfoPanel.add(emailTxtField);
		personalInfoPanel.add(passwordLbl);
		personalInfoPanel.add(passwordTxtField);
		personalInfoPanel.add(idLbl);
		personalInfoPanel.add(idTxtField);

	}

	protected void initGeolocationPanel() {
		geolocationPanel = new JPanel(new MigLayout("fill", "[][][][][][]", "[][]"));
		geolocationPanel.setBackground(SystemColor.text);
		geolocationPanel.add(countryLbl, "cell 0 0");
		geolocationPanel.add(countryCmbBox, "cell 1 0,growx");
		geolocationPanel.add(stateLbl, "cell 2 0");
		geolocationPanel.add(stateCmbBox, "cell 3 0,growx");
		geolocationPanel.add(districtLbl, "cell 4 0");
		geolocationPanel.add(districtCmbBox, "cell 5 0,growx");
		geolocationPanel.add(mapKit, "cell 0 1 6 1,growx");

	}

	public JPanel getPersonalInfoPanel() {
		return this.personalInfoPanel;
	}

	public JPanel getGeolocationPanel() {
		return this.geolocationPanel;
	}
}
