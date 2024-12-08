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
		setTitle("Shopping Cart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255, 255, 255));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(new Color(255, 153, 102));
		headerPanel.setBounds(0, 0, 539, 79);
		contentPane.add(headerPanel);
		headerPanel.setLayout(null);
		
		JButton returnButton = new JButton("Return to Selection");
		returnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				StorePage storePage = new StorePage();
				storePage.setVisible(true);
			}
		});
		returnButton.setForeground(new Color(255, 255, 255));
		returnButton.setBackground(new Color(0, 0, 0));
		returnButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		returnButton.setBounds(25, 22, 186, 30);
		headerPanel.add(returnButton);
		
		JPanel cartItemPanel = new JPanel();
		cartItemPanel.setBackground(new Color(255, 255, 255));
		cartItemPanel.setBounds(10, 90, 519, 180);
		contentPane.add(cartItemPanel);
		cartItemPanel.setLayout(null);
		
		JLabel productImageLabel = new JLabel("");
		productImageLabel.setIcon(new ImageIcon("img/placeholder.jpg"));
		productImageLabel.setBounds(10, 11, 137, 158);
		cartItemPanel.add(productImageLabel);
		
		JLabel productNameLabel = new JLabel("Product Name");
		productNameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		productNameLabel.setBounds(157, 11, 137, 35);
		cartItemPanel.add(productNameLabel);
		
		JLabel priceLabel = new JLabel("Price:");
		priceLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		priceLabel.setBounds(157, 57, 46, 14);
		cartItemPanel.add(priceLabel);
		
		JLabel priceValueLabel = new JLabel("Price Value");
		priceValueLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		priceValueLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		priceValueLabel.setBounds(213, 57, 81, 14);
		cartItemPanel.add(priceValueLabel);
		
		JLabel quantityLabel = new JLabel("Quantity:");
		quantityLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		quantityLabel.setBounds(157, 82, 67, 14);
		cartItemPanel.add(quantityLabel);
		
		JSpinner quantitySpinner = new JSpinner();
		quantitySpinner.setBounds(234, 81, 60, 20);
		cartItemPanel.add(quantitySpinner);
		
		JPanel summaryPanel = new JPanel();
		summaryPanel.setBackground(new Color(255, 255, 255));
		summaryPanel.setBounds(304, 281, 225, 89);
		contentPane.add(summaryPanel);
		summaryPanel.setLayout(null);
		
		JLabel orderSummaryLabel = new JLabel("Order Summary");
		orderSummaryLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		orderSummaryLabel.setBounds(20, 11, 137, 35);
		summaryPanel.add(orderSummaryLabel);
		
		JLabel totalLabel = new JLabel("Total:");
		totalLabel.setHorizontalAlignment(SwingConstants.LEFT);
		totalLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		totalLabel.setBounds(20, 69, 72, 26);
		summaryPanel.add(totalLabel);
		
		JLabel totalAmountLabel = new JLabel("Price Total");
		totalAmountLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		totalAmountLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		totalAmountLabel.setBounds(156, 69, 79, 26);
		summaryPanel.add(totalAmountLabel);
		
		JButton checkoutButton = new JButton("Proceed to Checkout");
		checkoutButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		checkoutButton.setForeground(new Color(255, 255, 255));
		checkoutButton.setBackground(new Color(0, 0, 0));
		checkoutButton.setBounds(10, 281, 284, 89);
		contentPane.add(checkoutButton);
		
		setLocationRelativeTo(null);
		setResizable(false);
	}
}
