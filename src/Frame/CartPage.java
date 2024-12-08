package Frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CartPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CartPage frame = new CartPage();
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
	public CartPage() {
		setTitle("Cart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(null);
		headerPanel.setBackground(new Color(255, 153, 102));
		headerPanel.setBounds(0, 0, 729, 79);
		contentPane.add(headerPanel);
		
		JButton returnButton = new JButton("Return to Selection");
		returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				StorePage selection = new StorePage();
					selection.setVisible(true);
			}
		});
		returnButton.setFocusable(false);
		returnButton.setForeground(Color.WHITE);
		returnButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		returnButton.setBackground(new Color(255, 153, 102));
		returnButton.setBounds(25, 22, 186, 30);
		headerPanel.add(returnButton);
		
		JLabel cartTitleLabel = new JLabel("Your Cart");
		cartTitleLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		cartTitleLabel.setHorizontalAlignment(SwingConstants.LEFT);
		cartTitleLabel.setBounds(22, 90, 174, 41);
		contentPane.add(cartTitleLabel);
		
		JPanel productPanel = new JPanel();
		productPanel.setBackground(new Color(255, 255, 255));
		productPanel.setBounds(22, 132, 430, 96);
		contentPane.add(productPanel);
		productPanel.setLayout(null);
		
		JLabel productImageLabel = new JLabel("New label");
		productImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productImageLabel.setIcon(new ImageIcon("img/placeholder.jpg"));
		productImageLabel.setBounds(10, 11, 83, 74);
		productPanel.add(productImageLabel);
		
		JLabel productTitleLabel = new JLabel("Product Title");
		productTitleLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		productTitleLabel.setBounds(103, 23, 142, 21);
		productPanel.add(productTitleLabel);
		
		JLabel priceLabel = new JLabel("Price");
		priceLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		priceLabel.setForeground(new Color(0, 51, 204));
		priceLabel.setBounds(105, 45, 66, 14);
		productPanel.add(priceLabel);
		
		JSpinner quantitySpinner = new JSpinner();
		quantitySpinner.setBounds(310, 35, 56, 27);
		productPanel.add(quantitySpinner);
		
		JButton deleteButton = new JButton("");
		deleteButton.setBackground(new Color(255, 255, 255));
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteButton.setIcon(new ImageIcon("img/trash.png"));
		deleteButton.setBounds(386, 33, 30, 30);
		productPanel.add(deleteButton);
		
		JPanel summaryPanel = new JPanel();
		summaryPanel.setBackground(new Color(255, 255, 255));
		summaryPanel.setBounds(474, 90, 245, 187);
		contentPane.add(summaryPanel);
		summaryPanel.setLayout(null);
		
		JLabel summaryTitleLabel = new JLabel("Order Summary");
		summaryTitleLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		summaryTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		summaryTitleLabel.setBounds(20, 11, 137, 35);
		summaryPanel.add(summaryTitleLabel);
		
		JLabel totalLabel = new JLabel("Total:");
		totalLabel.setHorizontalAlignment(SwingConstants.LEFT);
		totalLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		totalLabel.setBounds(20, 69, 72, 26);
		summaryPanel.add(totalLabel);
		
		JLabel priceTotalLabel = new JLabel("Price Total");
		priceTotalLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		priceTotalLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		priceTotalLabel.setBounds(156, 69, 79, 26);
		summaryPanel.add(priceTotalLabel);
		
		JButton checkoutButton = new JButton("Proceed to Checkout");
		checkoutButton.setFocusable(false);
		checkoutButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		checkoutButton.setForeground(new Color(255, 255, 255));
		checkoutButton.setBackground(new Color(0, 0, 0));
		checkoutButton.setBounds(10, 145, 225, 31);
		summaryPanel.add(checkoutButton);
		setLocationRelativeTo(null);
	}
}
