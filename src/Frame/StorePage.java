package Frame;

import Model.AdminCredentials;
import Model.Product;

import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StorePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel productImage1;
	private JLabel productImage2;
	private JLabel productImage3;
	private JLabel productImage4;
	private JLabel productImage5;
	private JLabel productImage6;
	private JLabel productName1;
	private JLabel productName2;
	private JLabel productName3;
	private JLabel productName4;
	private JLabel productName5;
	private JLabel productName6;
	private int currentPage = 0;
	private static final int PRODUCTS_PER_PAGE = 6;
	private JButton previousButton;
	private JButton nextButton;
	private JButton detailsButton1;
	private JButton detailsButton_1;
	private JButton detailsButton_1_1;
	private JButton detailsButton_2;
	private JButton detailsButton_2_1;
	private JButton detailsButton_2_2;

	LinkedList<Product> products = AdminProduct.getProductList();

	/**
	 * Create the frame.
	 */
	public StorePage() {
		setTitle("Store Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel productPanel1 = new JPanel();
		productPanel1.setBackground(new Color(255, 255, 255));
		productPanel1.setBounds(23, 58, 193, 196);
		contentPane.add(productPanel1);
		productPanel1.setLayout(null);
		
		productImage1 = new JLabel("");
		productImage1.setIcon(new ImageIcon("img/placeholder.jpg"));
		productImage1.setBounds(13, 11, 170, 128);
		productPanel1.add(productImage1);
		
		productName1 = new JLabel("");
		productName1.setFont(new Font("Tahoma", Font.BOLD, 14));
		productName1.setHorizontalAlignment(SwingConstants.CENTER);
		productName1.setBounds(30, 140, 129, 18);
		productPanel1.add(productName1);
		
		detailsButton1 = new JButton("More Details");
		detailsButton1.setForeground(new Color(255, 255, 255));
		detailsButton1.setBackground(new Color(0, 0, 0));
		detailsButton1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		detailsButton1.setBounds(10, 163, 173, 23);
		productPanel1.add(detailsButton1);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME TO GINTUAN NI LEMON");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 11, 427, 34);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(241, 58, 193, 196);
		contentPane.add(panel_1);
		
		productImage2 = new JLabel("");
		productImage2.setIcon(new ImageIcon("img/placeholder.jpg"));
		productImage2.setBounds(10, 11, 170, 128);
		panel_1.add(productImage2);
		
		productName2 = new JLabel("");
		productName2.setHorizontalAlignment(SwingConstants.CENTER);
		productName2.setFont(new Font("Tahoma", Font.BOLD, 14));
		productName2.setBounds(30, 140, 129, 18);
		panel_1.add(productName2);
		
		detailsButton_1 = new JButton("More Details");
		detailsButton_1.setForeground(Color.WHITE);
		detailsButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		detailsButton_1.setBackground(Color.BLACK);
		detailsButton_1.setBounds(10, 163, 173, 23);
		panel_1.add(detailsButton_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(457, 57, 193, 196);
		contentPane.add(panel_1_1);
		
		productImage3 = new JLabel("");
		productImage3.setIcon(new ImageIcon("img/placeholder.jpg"));
		productImage3.setBounds(10, 11, 170, 128);
		panel_1_1.add(productImage3);
		
		productName3 = new JLabel("");
		productName3.setHorizontalAlignment(SwingConstants.CENTER);
		productName3.setFont(new Font("Tahoma", Font.BOLD, 14));
		productName3.setBounds(30, 140, 129, 18);
		panel_1_1.add(productName3);
		
		detailsButton_1_1 = new JButton("More Details");
		detailsButton_1_1.setForeground(Color.WHITE);
		detailsButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		detailsButton_1_1.setBackground(Color.BLACK);
		detailsButton_1_1.setBounds(10, 163, 173, 23);
		panel_1_1.add(detailsButton_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(23, 276, 193, 196);
		contentPane.add(panel_2);
		
		productImage4 = new JLabel("");
		productImage4.setIcon(new ImageIcon("img/placeholder.jpg"));
		productImage4.setBounds(10, 11, 170, 128);
		panel_2.add(productImage4);
		
		productName4 = new JLabel("");
		productName4.setHorizontalAlignment(SwingConstants.CENTER);
		productName4.setFont(new Font("Tahoma", Font.BOLD, 14));
		productName4.setBounds(30, 140, 129, 18);
		panel_2.add(productName4);
		
		detailsButton_2 = new JButton("More Details");
		detailsButton_2.setForeground(Color.WHITE);
		detailsButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		detailsButton_2.setBackground(Color.BLACK);
		detailsButton_2.setBounds(10, 163, 173, 23);
		panel_2.add(detailsButton_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(241, 276, 193, 196);
		contentPane.add(panel_2_1);
		
		productImage5 = new JLabel("");
		productImage5.setIcon(new ImageIcon("img/placeholder.jpg"));
		productImage5.setBounds(10, 11, 170, 128);
		panel_2_1.add(productImage5);
		
		productName5 = new JLabel("");
		productName5.setHorizontalAlignment(SwingConstants.CENTER);
		productName5.setFont(new Font("Tahoma", Font.BOLD, 14));
		productName5.setBounds(30, 140, 129, 18);
		panel_2_1.add(productName5);
		
		detailsButton_2_1 = new JButton("More Details");

		detailsButton_2_1.setForeground(Color.WHITE);
		detailsButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		detailsButton_2_1.setBackground(Color.BLACK);
		detailsButton_2_1.setBounds(10, 163, 173, 23);
		panel_2_1.add(detailsButton_2_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBounds(457, 276, 193, 196);
		contentPane.add(panel_2_2);
		
		productImage6 = new JLabel("");
		productImage6.setIcon(new ImageIcon("img/placeholder.jpg"));
		productImage6.setBounds(10, 11, 170, 128);
		panel_2_2.add(productImage6);
		
		productName6 = new JLabel("");
		productName6.setHorizontalAlignment(SwingConstants.CENTER);
		productName6.setFont(new Font("Tahoma", Font.BOLD, 14));
		productName6.setBounds(30, 140, 129, 18);
		panel_2_2.add(productName6);
		
		detailsButton_2_2 = new JButton("More Details");
		detailsButton_2_2.setForeground(Color.WHITE);
		detailsButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		detailsButton_2_2.setBackground(Color.BLACK);
		detailsButton_2_2.setBounds(10, 163, 173, 23);
		panel_2_2.add(detailsButton_2_2);
		
		JButton lblNewLabel_5 = new JButton("");
		lblNewLabel_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				CartPage cartPage = new CartPage();
				cartPage.setVisible(true);
			}
		});
		lblNewLabel_5.setBackground(new Color(255, 153, 102));
		lblNewLabel_5.setIcon(new ImageIcon("img/cart.png"));
		lblNewLabel_5.setBounds(485, 11, 30, 30);
		contentPane.add(lblNewLabel_5);

		// Add the return to login button
		JButton btnReturnLogin = new JButton("Return to Login");
		btnReturnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminCredentials adminCredentials = new AdminCredentials();
				LoginPage loginPage = new LoginPage(adminCredentials.getLoginInfo());
				loginPage.setVisible(true);
			}
		});
		btnReturnLogin.setBackground(new Color(255, 153, 102));
		btnReturnLogin.setBounds(520, 11, 130, 30);
		contentPane.add(btnReturnLogin);

		previousButton = new JButton("Previous");
		previousButton.setBounds(23, 480, 100, 30);
		previousButton.setEnabled(false); // Disabled initially
		previousButton.addActionListener(e -> {
			if (currentPage > 0) {
				currentPage--;
				updateProductDisplay();
			}
		});
		contentPane.add(previousButton);

		nextButton = new JButton("Next");
		nextButton.setBounds(550, 480, 100, 30);
		nextButton.addActionListener(e -> {
			LinkedList<Product> products = AdminProduct.getProductList();
			if ((currentPage + 1) * PRODUCTS_PER_PAGE < products.size()) {
				currentPage++;
				updateProductDisplay();
			}
		});
		contentPane.add(nextButton);

		setLocationRelativeTo(null);
		setResizable(false);
		
		updateProductDisplay();
	}

	private void updateProductDisplay() {
		// Clear all labels and action listeners first
		productName1.setText("");
		productName2.setText("");
		productName3.setText("");
		productName4.setText("");
		productName5.setText("");
		productName6.setText("");

		// Remove existing action listeners
		for (ActionListener al : detailsButton1.getActionListeners()) {
			detailsButton1.removeActionListener(al);
		}
		for (ActionListener al : detailsButton_1.getActionListeners()) {
			detailsButton_1.removeActionListener(al);
		}
		for (ActionListener al : detailsButton_1_1.getActionListeners()) {
			detailsButton_1_1.removeActionListener(al);
		}
		for (ActionListener al : detailsButton_2.getActionListeners()) {
			detailsButton_2.removeActionListener(al);
		}
		for (ActionListener al : detailsButton_2_1.getActionListeners()) {
			detailsButton_2_1.removeActionListener(al);
		}
		for (ActionListener al : detailsButton_2_2.getActionListeners()) {
			detailsButton_2_2.removeActionListener(al);
		}

		// Calculate start and end indices for current page
		int startIndex = currentPage * PRODUCTS_PER_PAGE;
		int endIndex = Math.min(startIndex + PRODUCTS_PER_PAGE, products.size());

		productImage1.setIcon(new ImageIcon("img/placeholder.jpg"));
		productImage2.setIcon(new ImageIcon("img/placeholder.jpg"));
		productImage3.setIcon(new ImageIcon("img/placeholder.jpg"));
		productImage4.setIcon(new ImageIcon("img/placeholder.jpg"));
		productImage5.setIcon(new ImageIcon("img/placeholder.jpg"));
		productImage6.setIcon(new ImageIcon("img/placeholder.jpg"));

		JLabel[] imageLabels = {
			productImage1,
			productImage2,
			productImage3,
			productImage4,
			productImage5,
			productImage6
		};

		// Update navigation buttons
		previousButton.setEnabled(currentPage > 0);
		nextButton.setEnabled((currentPage + 1) * PRODUCTS_PER_PAGE < products.size());
		
		if (!products.isEmpty()) {
			// Update labels based on current page
			for (int i = startIndex; i < endIndex; i++) {
				Product product = products.get(i);
				int displayIndex = i - startIndex;
				
				String imagePath = "img/" + product.getType().toLowerCase() + ".png";
				if (imageLabels[displayIndex] != null) {
					imageLabels[displayIndex].setIcon(new ImageIcon(imagePath));
				}
				
				switch (displayIndex) {
					case 0:
						productName1.setText(product.getName());
						detailsButton1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								dispose();
								String productName = String.valueOf(product.getName());
								double productPrice = product.getPrice();
								String productDescription = String.valueOf(product.getDescription());
								String productType = String.valueOf(product.getType());
								ProductDetails details = new ProductDetails(productName, productPrice, productDescription, productType);
								details.setVisible(true);
							}
						});
						break;
					case 1:
						productName2.setText(product.getName());
						detailsButton_1.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								dispose();
								String productName = String.valueOf(product.getName());
								double productPrice = product.getPrice();
								String productDescription = String.valueOf(product.getDescription());
								String productType = String.valueOf(product.getType());
								ProductDetails details = new ProductDetails(productName, productPrice, productDescription, productType);
								details.setVisible(true);
							}
						});
						break;
					case 2:
						productName3.setText(product.getName());
						detailsButton_1_1.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								dispose();
								String productName = String.valueOf(product.getName());
								double productPrice = product.getPrice();
								String productDescription = String.valueOf(product.getDescription());
								String productType = String.valueOf(product.getType());
								ProductDetails details = new ProductDetails(productName, productPrice, productDescription, productType);
								details.setVisible(true);
							}
						});
						break;
					case 3:
						productName4.setText(product.getName());
						detailsButton_2.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								dispose();
								String productName = String.valueOf(product.getName());
								double productPrice = product.getPrice();
								String productDescription = String.valueOf(product.getDescription());
								String productType = String.valueOf(product.getType());
								ProductDetails details = new ProductDetails(productName, productPrice, productDescription, productType);
								details.setVisible(true);
							}
						});
						break;
					case 4:
						productName5.setText(product.getName());
						detailsButton_2_1.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								dispose();
								String productName = String.valueOf(product.getName());
								double productPrice = product.getPrice();
								String productDescription = String.valueOf(product.getDescription());
								String productType = String.valueOf(product.getType());
								ProductDetails details = new ProductDetails(productName, productPrice, productDescription, productType);
								details.setVisible(true);
							}
						});
						break;
					case 5:
						productName6.setText(product.getName());
						detailsButton_2_2.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								dispose();
								String productName = String.valueOf(product.getName());
								double productPrice = product.getPrice();
								String productDescription = String.valueOf(product.getDescription());
								String productType = String.valueOf(product.getType());
								ProductDetails details = new ProductDetails(productName, productPrice, productDescription, productType);
								details.setVisible(true);
							}
						});
						break;
				}
			}
		}
	}

}
