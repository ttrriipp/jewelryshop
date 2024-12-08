package Frame;

import Model.AdminCredentials;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;

public class LoginPage extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JLabel lblNewLabel_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminCredentials adminCredentials = new AdminCredentials();
					LoginPage frame = new LoginPage(adminCredentials.getLoginInfo());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	HashMap<String, String> loginInfo = new HashMap<String, String>();
	/**
	 * Create the frame.
	 */

	public LoginPage(HashMap<String, String> loginInfoOriginal) {
		loginInfo = loginInfoOriginal;
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
		
		JLabel lblNewLabel = new JLabel("Gintuan ni Lemon");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(106, 7, 293, 76);
		contentPane.add(lblNewLabel);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(116, 109, 283, 25);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(116, 94, 92, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(115, 145, 82, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Customer Store");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StorePage storePage = new StorePage();
				storePage.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 153, 153));
		btnNewButton.setBounds(116, 209, 130, 46);
		btnNewButton.setFocusable(false);
		contentPane.add(btnNewButton);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = textFieldUsername.getText();
				String password = String.valueOf(passwordField.getPassword());

				if(loginInfo.containsKey(username)){
					if(loginInfo.get(username).equals(password)) {
						dispose();
						AdminDashboard adminDashboard = new AdminDashboard(username, password);
						adminDashboard.setVisible(true);
					} else if (!password.isEmpty() & !loginInfo.get(username).equals(password))
						JOptionPane.showMessageDialog(null, "Wrong Password!", "Wrong Password", JOptionPane.ERROR_MESSAGE);
				} else if (!username.isEmpty() & !loginInfo.containsKey(username) & !password.isEmpty()){
					JOptionPane.showMessageDialog(null, "Wrong Username!", "Wrong Username", JOptionPane.ERROR_MESSAGE);
				}
				if(username.isEmpty())
					JOptionPane.showMessageDialog(null, "Please input all fields!", "Blank Fields", JOptionPane.INFORMATION_MESSAGE);
				else if (password.isEmpty())
					JOptionPane.showMessageDialog(null, "Please input all fields!", "Blank Fields", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(0, 51, 102));
		btnLogin.setBounds(269, 209, 130, 46);
		btnLogin.setFocusable(false);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(71, 25, 50, 50);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("img/diamond_size.png"));
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setIcon(new ImageIcon("img/diamond_size.png"));
		lblNewLabel_3_1.setBounds(387, 25, 50, 50);
		contentPane.add(lblNewLabel_3_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(116, 162, 283, 23);
		contentPane.add(passwordField);

		setLocationRelativeTo(null);
		setResizable(false);
	}
}
