import Model.AdminCredentials;
import Model.Product;

import java.awt.EventQueue;
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
	
	// Add these as class fields
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_3_1;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_4_1;
	private JLabel lblNewLabel_4_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_2_1;
	private JLabel lblNewLabel_1_2_2;
	private int currentPage = 0;
	private static final int PRODUCTS_PER_PAGE = 6;
	private JButton btnPrevious;
	private JButton btnNext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StorePage frame = new StorePage();
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
	public StorePage() {
		setTitle("Store Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(23, 58, 193, 196);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img/placeholder.jpg"));
		lblNewLabel.setBounds(13, 11, 170, 128);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(30, 140, 129, 18);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("More Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ProductDetails details = new ProductDetails();
				details.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 163, 173, 23);
		panel.add(btnNewButton);
		
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
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("img/placeholder.jpg"));
		lblNewLabel_3.setBounds(10, 11, 170, 128);
		panel_1.add(lblNewLabel_3);
		
		lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(30, 140, 129, 18);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("More Details");
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ProductDetails details = new ProductDetails();
				details.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(10, 163, 173, 23);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(457, 57, 193, 196);
		contentPane.add(panel_1_1);
		
		lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("img/placeholder.jpg"));
		lblNewLabel_3_1.setBounds(10, 11, 170, 128);
		panel_1_1.add(lblNewLabel_3_1);
		
		lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(30, 140, 129, 18);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("More Details");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ProductDetails details = new ProductDetails();
				details.setVisible(true);
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1.setBounds(10, 163, 173, 23);
		panel_1_1.add(btnNewButton_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(23, 276, 193, 196);
		contentPane.add(panel_2);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("img/placeholder.jpg"));
		lblNewLabel_4.setBounds(10, 11, 170, 128);
		panel_2.add(lblNewLabel_4);
		
		lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(30, 140, 129, 18);
		panel_2.add(lblNewLabel_1_2);
		
		JButton btnNewButton_2 = new JButton("More Details");
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ProductDetails details = new ProductDetails();
				details.setVisible(true);
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBounds(10, 163, 173, 23);
		panel_2.add(btnNewButton_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(241, 276, 193, 196);
		contentPane.add(panel_2_1);
		
		lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon("img/placeholder.jpg"));
		lblNewLabel_4_1.setBounds(10, 11, 170, 128);
		panel_2_1.add(lblNewLabel_4_1);
		
		lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_1.setBounds(30, 140, 129, 18);
		panel_2_1.add(lblNewLabel_1_2_1);
		
		JButton btnNewButton_2_1 = new JButton("More Details");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ProductDetails details = new ProductDetails();
				details.setVisible(true);
			}
		});
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2_1.setBackground(Color.BLACK);
		btnNewButton_2_1.setBounds(10, 163, 173, 23);
		panel_2_1.add(btnNewButton_2_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBounds(457, 276, 193, 196);
		contentPane.add(panel_2_2);
		
		lblNewLabel_4_2 = new JLabel("");
		lblNewLabel_4_2.setIcon(new ImageIcon("img/placeholder.jpg"));
		lblNewLabel_4_2.setBounds(10, 11, 170, 128);
		panel_2_2.add(lblNewLabel_4_2);
		
		lblNewLabel_1_2_2 = new JLabel("");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_2.setBounds(30, 140, 129, 18);
		panel_2_2.add(lblNewLabel_1_2_2);
		
		JButton btnNewButton_2_2 = new JButton("More Details");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ProductDetails details = new ProductDetails();
				details.setVisible(true);
			}
		});
		btnNewButton_2_2.setForeground(Color.WHITE);
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2_2.setBackground(Color.BLACK);
		btnNewButton_2_2.setBounds(10, 163, 173, 23);
		panel_2_2.add(btnNewButton_2_2);
		
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

		// Add navigation buttons at the bottom
		btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(23, 480, 100, 30);
		btnPrevious.setEnabled(false); // Disabled initially
		btnPrevious.addActionListener(e -> {
			if (currentPage > 0) {
				currentPage--;
				updateProductDisplay();
			}
		});
		contentPane.add(btnPrevious);

		btnNext = new JButton("Next");
		btnNext.setBounds(550, 480, 100, 30);
		btnNext.addActionListener(e -> {
			LinkedList<Product> products = AdminProduct.getProductList();
			if ((currentPage + 1) * PRODUCTS_PER_PAGE < products.size()) {
				currentPage++;
				updateProductDisplay();
			}
		});
		contentPane.add(btnNext);

		setLocationRelativeTo(null);
		setResizable(false);
		
		updateProductDisplay();
	}

	private void updateProductDisplay() {
		LinkedList<Product> products = AdminProduct.getProductList();

		// Calculate start and end indices for current page
		int startIndex = currentPage * PRODUCTS_PER_PAGE;
		int endIndex = Math.min(startIndex + PRODUCTS_PER_PAGE, products.size());

		// Clear all labels first
		lblNewLabel_1.setText("");
		lblNewLabel_1_1.setText("");
		lblNewLabel_1_1_1.setText("");
		lblNewLabel_1_2.setText("");
		lblNewLabel_1_2_1.setText("");
		lblNewLabel_1_2_2.setText("");

		lblNewLabel.setIcon(new ImageIcon("img/placeholder.jpg"));
		lblNewLabel_3.setIcon(new ImageIcon("img/placeholder.jpg"));
		lblNewLabel_3_1.setIcon(new ImageIcon("img/placeholder.jpg"));
		lblNewLabel_4.setIcon(new ImageIcon("img/placeholder.jpg"));
		lblNewLabel_4_1.setIcon(new ImageIcon("img/placeholder.jpg"));
		lblNewLabel_4_2.setIcon(new ImageIcon("img/placeholder.jpg"));

		JLabel[] imageLabels = {
			lblNewLabel,          // First product image
			lblNewLabel_3,        // Second product image
			lblNewLabel_3_1,      // Third product image
			lblNewLabel_4,        // Fourth product image
			lblNewLabel_4_1,      // Fifth product image
			lblNewLabel_4_2       // Sixth product image


		};

		// Update navigation buttons
		btnPrevious.setEnabled(currentPage > 0);
		btnNext.setEnabled((currentPage + 1) * PRODUCTS_PER_PAGE < products.size());
		
		if (!products.isEmpty()) {
			// Update labels based on current page
			for (int i = startIndex; i < endIndex; i++) {
				Product product = products.get(i);
				int displayIndex = i - startIndex; // Relative index on current page
				
				// Set the appropriate image based on product type
				String imagePath = "img/" + product.getType().toLowerCase() + ".png";
				if (imageLabels[displayIndex] != null) {  // Add null check
					imageLabels[displayIndex].setIcon(new ImageIcon(imagePath));
				}
				
				switch (displayIndex) {
					case 0:
						lblNewLabel_1.setText(product.getName());
						break;
					case 1:
						lblNewLabel_1_1.setText(product.getName());
						break;
					case 2:
						lblNewLabel_1_1_1.setText(product.getName());
						break;
					case 3:
						lblNewLabel_1_2.setText(product.getName());
						break;
					case 4:
						lblNewLabel_1_2_1.setText(product.getName());
						break;
					case 5:
						lblNewLabel_1_2_2.setText(product.getName());
						break;
				}
			}
		}
	}

}
