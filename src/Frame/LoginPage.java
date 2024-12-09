package Frame;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;

public class LoginPage extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usernameField;
	private JLabel passwordLabel;
	private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */
	public LoginPage(HashMap<String, String> loginInfoOriginal) {
		setForeground(new Color(0, 128, 255));
		setFont(new Font("Castellar", Font.BOLD, 17));
		setTitle("Gintuan ni Lemon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 338);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("Gintuan ni Lemon");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 25));
		titleLabel.setForeground(new Color(255, 255, 255));
		titleLabel.setBounds(106, 7, 293, 76);
		contentPane.add(titleLabel);
		
		usernameField = new JTextField();
		usernameField.setBounds(116, 109, 283, 25);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		usernameLabel.setForeground(new Color(255, 255, 255));
		usernameLabel.setBounds(116, 94, 92, 14);
		contentPane.add(usernameLabel);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setForeground(new Color(255, 255, 255));
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		passwordLabel.setBounds(115, 145, 82, 14);
		contentPane.add(passwordLabel);
		
		JButton customerStoreButton = new JButton("Customer Store");
		customerStoreButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					StorePage storePage = new StorePage();
					storePage.setVisible(true);
					dispose();
			}
		});
		customerStoreButton.setForeground(new Color(255, 255, 255));
		customerStoreButton.setBackground(new Color(255, 153, 153));
		customerStoreButton.setBounds(116, 209, 130, 46);
		customerStoreButton.setFocusable(false);
		contentPane.add(customerStoreButton);


		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String password = String.valueOf(passwordField.getPassword());

				//Check if login is valid
				if (username.isEmpty() || password.isEmpty())
					JOptionPane.showMessageDialog(null, "Please input all fields!", "Blank Fields", JOptionPane.INFORMATION_MESSAGE);
				else if (!loginInfoOriginal.containsKey(username))
					JOptionPane.showMessageDialog(null, "Wrong Username!", "Wrong Username", JOptionPane.ERROR_MESSAGE);
				else if (!loginInfoOriginal.get(username).equals(password))
					JOptionPane.showMessageDialog(null, "Wrong Password!", "Wrong Password", JOptionPane.ERROR_MESSAGE);
				else if (loginInfoOriginal.containsKey(username) && loginInfoOriginal.get(username).equals(password)) {
						dispose();
						AdminDashboard adminDashboard = new AdminDashboard(username, password);
						adminDashboard.setVisible(true);
				}
			}
		});
		loginButton.setForeground(new Color(255, 255, 255));
		loginButton.setBackground(new Color(0, 51, 102));
		loginButton.setBounds(269, 209, 130, 46);
		loginButton.setFocusable(false);
		contentPane.add(loginButton);
		
		JLabel leftLogoLabel = new JLabel("");
		leftLogoLabel.setBounds(71, 25, 50, 50);
		contentPane.add(leftLogoLabel);
		leftLogoLabel.setIcon(new ImageIcon("img/diamond_size.png"));
		
		JLabel rightLogoLabel = new JLabel("");
		rightLogoLabel.setIcon(new ImageIcon("img/diamond_size.png"));
		rightLogoLabel.setBounds(387, 25, 50, 50);
		contentPane.add(rightLogoLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(116, 162, 283, 23);
		contentPane.add(passwordField);

		setLocationRelativeTo(null);
		setResizable(false);
	}
}
