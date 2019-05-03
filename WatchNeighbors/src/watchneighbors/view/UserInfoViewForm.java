package watchneighbors.view;

import java.awt.SystemColor;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;
import watchneighbors.model.CustomMapKit;

public class UserInfoViewForm {

	private JPanel mainPanel;
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

	private JLabel userNameLbl;
	private JLabel userSurnameLbl;
	private JLabel userEmailLbl;
	private JLabel userPasswordLbl;
	private JLabel userIdLbl;
	private JLabel userCountryLbl;
	private JLabel userStateLbl;
	private JLabel userDistrictLbl;

	public UserInfoViewForm() {
		initJLabels();
		initCustomMapKit();
		initPersonalInfoPanel();
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
		userNameLbl = new JLabel("Name:");
		userSurnameLbl = new JLabel("Surname:");
		userEmailLbl = new JLabel("Email:");
		userPasswordLbl = new JLabel("Password:");
		userIdLbl = new JLabel("ID:");
		userCountryLbl = new JLabel("Country:");
		userStateLbl = new JLabel("State:");
		userDistrictLbl = new JLabel("District:");
	}

	protected void initCustomMapKit() {
		mapKit = new CustomMapKit();
		mapKit.setZoomSliderSize(12, 140);
		mapKit.setMiniMapVisible(false);
	}

	protected void initPersonalInfoPanel() {
		personalInfoPanel = new JPanel(new MigLayout("wrap 4", "[][][][]", "[][][][][]"));
		personalInfoPanel.setBackground(SystemColor.text);
		personalInfoPanel.add(nameLbl, "cell 0 0");
		personalInfoPanel.add(userNameLbl, "cell 1 0");
		personalInfoPanel.add(surnameLbl, "cell 2 0");
		personalInfoPanel.add(userSurnameLbl, "cell 3 0");
		personalInfoPanel.add(emailLbl, "cell 0 1");
		personalInfoPanel.add(userEmailLbl, "cell 1 1");
		personalInfoPanel.add(passwordLbl, "cell 2 1");
		personalInfoPanel.add(userPasswordLbl, "cell 3 1");
		personalInfoPanel.add(idLbl, "cell 0 2");
		personalInfoPanel.add(userIdLbl, "cell 1 2");
		personalInfoPanel.add(userCountryLbl, "cell 2 2");
		personalInfoPanel.add(userStateLbl, "cell 3 2");
		personalInfoPanel.add(userDistrictLbl, "cell 0 3");
		personalInfoPanel.add(mapKit, "cell 0 4 4 1");

	}

	public JPanel getPersonalInfoPanel() {
		return this.personalInfoPanel;
	}

	public JPanel getGeolocationPanel() {
		return this.geolocationPanel;
	}

}
