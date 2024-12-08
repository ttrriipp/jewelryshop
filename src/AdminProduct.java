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
		
		// Title label matching dashboard style
		JLabel lblNewLabel = new JLabel("Add New Product");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 16));
		lblNewLabel.setBounds(90, 6, 179, 31);
		contentPane.add(lblNewLabel);
		
		// Left sidebar panel matching dashboard
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 153, 102));
		panel.setBounds(0, 0, 108, 389);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnDashboard = new JButton("Dash\r\nBoard");
		btnDashboard.setBounds(10, 27, 85, 35);
		btnDashboard.setFocusable(false);
		btnDashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminDashboard adminDashboard = new AdminDashboard(loggedInUsername, loggedInPassword);
				adminDashboard.setVisible(true);
			}
		});
		panel.add(btnDashboard);
		
		JButton btnProduct = new JButton("Product");
		btnProduct.setBounds(11, 73, 84, 35);
		btnProduct.setFocusable(false);
		panel.add(btnProduct);

		JLabel lblProduct = new JLabel("Product Name:");
		lblProduct.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProduct.setBounds(140, 50, 120, 25);
		contentPane.add(lblProduct);
		
		JTextField productEdit = new JTextField();
		productEdit.setBounds(140, 75, 250, 25);
		contentPane.add(productEdit);
		
		JLabel lblType = new JLabel("Jewelry Type:");
		lblType.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblType.setBounds(140, 110, 120, 25);
		contentPane.add(lblType);
		
		String[] jewelryTypes = {
			"Necklace", "Ring", "Bracelet", "Earrings", "Anklet"
		};
		
		JComboBox<String> typeComboBox = new JComboBox<>(jewelryTypes);
		typeComboBox.setBounds(140, 135, 250, 25);
		contentPane.add(typeComboBox);
		
		JLabel lblPrice = new JLabel("Price (₱):");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrice.setBounds(140, 170, 120, 25);
		contentPane.add(lblPrice);
		
		JFormattedTextField priceEdit = new JFormattedTextField();
		priceEdit.setBounds(140, 195, 120, 25);
		contentPane.add(priceEdit);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDescription.setBounds(140, 230, 120, 25);
		contentPane.add(lblDescription);
		
		JTextArea descPane = new JTextArea();
		descPane.setLineWrap(true);
		descPane.setWrapStyleWord(true);
		
		JScrollPane scrollPane = new JScrollPane(descPane);
		scrollPane.setBounds(140, 255, 250, 70);
		contentPane.add(scrollPane);
		
		JButton btnSubmit = new JButton("Add Product");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSubmit.setBackground(new Color(255, 153, 102));
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFocusable(false);
		btnSubmit.setBounds(140, 335, 120, 30);
		contentPane.add(btnSubmit);

		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String productName = productEdit.getText();
					String selectedType = (String) typeComboBox.getSelectedItem();
					double price = Double.parseDouble(priceEdit.getText());
					String description = descPane.getText();
					
					if (productName.isEmpty() || description.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Please fill all fields!");
						return;
					}
					
					// Include type in product description
					String fullDescription = "Type: " + selectedType + "\n" + description;
					Product newProduct = new Product(productName, price, fullDescription, selectedType);
					productList.add(newProduct);
					
					// Clear fields after successful addition
					productEdit.setText("");
					typeComboBox.setSelectedIndex(0);
					priceEdit.setText("");
					descPane.setText("");
					
					JOptionPane.showMessageDialog(null, "Model.Product added successfully!");
					
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
