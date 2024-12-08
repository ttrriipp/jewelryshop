package Frame;

import Model.Product;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.LinkedList;

public class AdminProduct extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static LinkedList<Product> productList = new LinkedList<>();
	private String loggedInUsername;
	private String loggedInPassword;


	// Initialize default products
	static {
		productList.add(new Product("Silver Necklace", 299.99, "Elegant silver necklace with pendant", "Necklace"));
		productList.add(new Product("Gold Ring", 399.99, "Classic gold wedding band", "Ring"));
		productList.add(new Product("Pearl Bracelet", 249.99, "Freshwater pearl bracelet with silver clasp", "Bracelet"));
		productList.add(new Product("Diamond Earrings", 599.99, "Sparkling diamond stud earrings", "Earrings"));
		productList.add(new Product("Rose Gold Anklet", 149.99, "Delicate rose gold chain anklet", "Anklet"));
		productList.add(new Product("Gold Necklace", 499.99, "18k gold chain necklace", "Necklace"));
	}

	/**
	 * Create the frame.
	 */
	public AdminProduct(String loggedInUsername, String loggedInPassword) {
		this.loggedInUsername = loggedInUsername;
		this.loggedInPassword = loggedInPassword;
		setTitle("Admin Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255, 255, 255));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel titleLabel = new JLabel("Add New Product");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Sylfaen", Font.BOLD, 16));
		titleLabel.setBounds(90, 6, 179, 31);
		contentPane.add(titleLabel);

		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(new Color(255, 153, 102));
		sidePanel.setBounds(0, 0, 108, 389);
		contentPane.add(sidePanel);
		sidePanel.setLayout(null);
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setBounds(10, 27, 85, 35);
		btnDashboard.setFocusable(false);
		btnDashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminDashboard adminDashboard = new AdminDashboard(loggedInUsername, loggedInPassword);
				adminDashboard.setVisible(true);
			}
		});
		sidePanel.add(btnDashboard);
		
		JButton btnProduct = new JButton("Product");
		btnProduct.setBounds(11, 73, 84, 35);
		btnProduct.setFocusable(false);
		sidePanel.add(btnProduct);

		JLabel productNameLabel = new JLabel("Product Name:");
		productNameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		productNameLabel.setBounds(140, 50, 120, 25);
		contentPane.add(productNameLabel);
		
		JTextField productNameField = new JTextField();
		productNameField.setBounds(140, 75, 250, 25);
		contentPane.add(productNameField);
		
		JLabel typeLabel = new JLabel("Jewelry Type:");
		typeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		typeLabel.setBounds(140, 110, 120, 25);
		contentPane.add(typeLabel);
		
		String[] jewelryTypes = {
			"Necklace", "Ring", "Bracelet", "Earrings", "Anklet"
		};
		
		JComboBox<String> typeComboBox = new JComboBox<>(jewelryTypes);
		typeComboBox.setBounds(140, 135, 250, 25);
		contentPane.add(typeComboBox);
		
		JLabel priceLabel = new JLabel("Price (₱):");
		priceLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		priceLabel.setBounds(140, 170, 120, 25);
		contentPane.add(priceLabel);
		
		JFormattedTextField priceField = new JFormattedTextField();
		priceField.setBounds(140, 195, 120, 25);
		contentPane.add(priceField);
		
		JLabel descriptionLabel = new JLabel("Description:");
		descriptionLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		descriptionLabel.setBounds(140, 230, 120, 25);
		contentPane.add(descriptionLabel);
		
		JTextArea descriptionArea = new JTextArea();
		descriptionArea.setLineWrap(true);
		descriptionArea.setWrapStyleWord(true);
		
		JScrollPane scrollPane = new JScrollPane(descriptionArea);
		scrollPane.setBounds(140, 255, 250, 70);
		contentPane.add(scrollPane);
		
		JButton submitButton = new JButton("Add Product");
		submitButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		submitButton.setBackground(new Color(255, 153, 102));
		submitButton.setForeground(Color.WHITE);
		submitButton.setFocusable(false);
		submitButton.setBounds(140, 335, 120, 30);
		contentPane.add(submitButton);

		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String productName = productNameField.getText();
					String selectedType = (String) typeComboBox.getSelectedItem();
					double price = Double.parseDouble(priceField.getText());
					String description = descriptionArea.getText();
					
					if (productName.isEmpty() || description.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Please fill all fields!");
						return;
					}

					String fullDescription = "Type: " + selectedType + "\n" + description;
					Product newProduct = new Product(productName, price, fullDescription, selectedType);
					productList.add(newProduct);
					
					// Clear fields after successful addition
					productNameField.setText("");
					typeComboBox.setSelectedIndex(0);
					priceField.setText("");
					descriptionArea.setText("");
					
					JOptionPane.showMessageDialog(null, "Product added successfully!");
					
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Please enter a valid price!");
				}
			}
		});

		setLocationRelativeTo(null);
		setResizable(false);
	}


	public static LinkedList<Product> getProductList() {
		return productList;
	}
}
