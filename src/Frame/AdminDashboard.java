package Frame;

import Model.AdminCredentials;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;

public class AdminDashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usernameField;
	private JTextField passwordField;
	private String loggedInUsername;
	private String loggedInPassword;
	private HashMap<String, String> loginInfo = new HashMap<String, String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard frame = new AdminDashboard("admin1", "adminpass1");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminDashboard(String username, String password) {
		this.loggedInUsername = username;
		this.loggedInPassword = password;
		
		setTitle("Admin Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255, 255, 255));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("Admin Dashboard");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Sylfaen", Font.BOLD, 16));
		titleLabel.setBounds(90, 6, 179, 31);
		contentPane.add(titleLabel);
		
		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(new Color(255, 153, 102));
		sidePanel.setBounds(0, 0, 108, 389);
		contentPane.add(sidePanel);
		sidePanel.setLayout(null);
		
		JButton dashboardButton = new JButton("Dashboard");
		dashboardButton.setBounds(10, 27, 85, 35);
		dashboardButton.setFocusable(false);
		sidePanel.add(dashboardButton);
		
		JButton productButton = new JButton("Product");
		productButton.setFocusable(false);
		productButton.setBounds(11, 73, 84, 35);
		sidePanel.add(productButton);
		productButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminProduct adminProduct = new AdminProduct(loggedInUsername, loggedInPassword);
				adminProduct.setVisible(true);
			}
		});
		
		JLabel employeeLabel = new JLabel("Employee");
		employeeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		employeeLabel.setBounds(134, 48, 122, 14);
		contentPane.add(employeeLabel);
		
		usernameField = new JTextField(loggedInUsername);
		usernameField.setEditable(false);
		usernameField.setBounds(134, 63, 171, 26);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel passwordTitleLabel = new JLabel("Password");
		passwordTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordTitleLabel.setBounds(135, 96, 79, 14);
		contentPane.add(passwordTitleLabel);
		
		passwordField = new JTextField(loggedInPassword);
		passwordField.setEditable(false);
		passwordField.setBounds(134, 112, 171, 26);
		contentPane.add(passwordField);
		passwordField.setColumns(10);
		
		JButton logoutButton = new JButton("Logout");
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminCredentials adminCredentials = new AdminCredentials();
				LoginPage loginPage = new LoginPage(adminCredentials.getLoginInfo());
				loginPage.setVisible(true);
			}
		});
		logoutButton.setForeground(new Color(255, 255, 255));
		logoutButton.setBackground(new Color(255, 51, 51));
		logoutButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		logoutButton.setBounds(366, 320, 149, 50);
		contentPane.add(logoutButton);

		setLocationRelativeTo(null);
		setResizable(false);
	}
}
