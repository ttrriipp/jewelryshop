package Frame;

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
import Model.CartStack;
import Model.CartItem;
import Model.Product;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.SpinnerNumberModel;
import java.awt.Dimension;
import java.text.NumberFormat;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

public class CartPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static CartStack cartStack = new CartStack();
	private JPanel cartItemsPanel;
	private JLabel priceTotalLabel;

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
		
		cartItemsPanel = new JPanel();
		cartItemsPanel.setBackground(new Color(255, 255, 255));
		cartItemsPanel.setLayout(new BoxLayout(cartItemsPanel, BoxLayout.Y_AXIS));
		
		JScrollPane scrollPane = new JScrollPane(cartItemsPanel);
		scrollPane.setBounds(22, 132, 430, 240);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBorder(null);
		
		contentPane.add(scrollPane);
		
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
		
		priceTotalLabel = new JLabel("Price Total");
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
		checkoutButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Check the cart if empty or not
				if (cartStack.isEmpty()) {
					JOptionPane.showMessageDialog(null, 
						"Your cart is empty!", 
						"Empty Cart", 
						JOptionPane.WARNING_MESSAGE);
				} else {
					int choice = JOptionPane.showConfirmDialog(null,
						"Do you want to proceed with checkout?",
						"Checkout Confirmation",
						JOptionPane.YES_NO_OPTION);
						
					if (choice == JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null,
							"Thank you for your purchase!\nYour order has been placed successfully.",
							"Order Confirmation",
							JOptionPane.INFORMATION_MESSAGE);
							
						// Clear the cart after successful checkout
						while (!cartStack.isEmpty()) {
							cartStack.pop();
						}
						updateCartDisplay();
					}
				}
			}
		});
		summaryPanel.add(checkoutButton);
		setLocationRelativeTo(null);
		
		updateCartDisplay();
	}

	public static void addToCart(Product product, int quantity) {
		cartStack.push(new CartItem(product, quantity));
	}

	private void updateCartDisplay() {
		cartItemsPanel.removeAll();
		double total = 0;
		
		CartItem[] items = cartStack.getAllItems();
		for (CartItem item : items) {
			JPanel productPanel = createProductPanel(item);
			cartItemsPanel.add(productPanel);
			cartItemsPanel.add(Box.createRigidArea(new Dimension(0, 10)));
			total += item.getTotal();
		}
		
		priceTotalLabel.setText(NumberFormat.getCurrencyInstance().format(total));
		cartItemsPanel.revalidate();
		cartItemsPanel.repaint();
	}

	//For adding products
	private JPanel createProductPanel(CartItem item) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setPreferredSize(new Dimension(410, 96));
		panel.setMaximumSize(new Dimension(410, 96));
		panel.setMinimumSize(new Dimension(410, 96));
		panel.setLayout(null);

		JLabel productImageLabel = new JLabel();
		productImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productImageLabel.setIcon(new ImageIcon("img/" + item.getProduct().getType() + ".png"));
		productImageLabel.setBounds(10, 11, 83, 74);
		panel.add(productImageLabel);

		JLabel productTitleLabel = new JLabel(item.getProduct().getName());
		productTitleLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		productTitleLabel.setBounds(103, 23, 142, 21);
		panel.add(productTitleLabel);

		JLabel priceLabel = new JLabel(String.format(NumberFormat.getCurrencyInstance().format((item.getProduct().getPrice()))));
		priceLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		priceLabel.setForeground(new Color(0, 51, 204));
		priceLabel.setBounds(105, 45, 66, 14);
		panel.add(priceLabel);

		JSpinner quantitySpinner = new JSpinner(new SpinnerNumberModel(item.getQuantity(), 1, 10, 1));
		quantitySpinner.setBounds(310, 35, 56, 27);
		quantitySpinner.addChangeListener(e -> {
			item.setQuantity((Integer) quantitySpinner.getValue());
			updateCartDisplay();
		});

		JLabel quantityLabel = new JLabel("Quantity:");
		quantityLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		quantityLabel.setBounds(250, 40, 60, 14);
		panel.add(quantityLabel);
		panel.add(quantitySpinner);

		JButton deleteButton = new JButton("");
		deleteButton.setBackground(new Color(255, 255, 255));
		deleteButton.setIcon(new ImageIcon("img/trash.png"));
		deleteButton.setBounds(386, 33, 30, 30);
		deleteButton.addActionListener(e -> {
			CartItem poppedItem = cartStack.pop();
			updateCartDisplay();
		});
		panel.add(deleteButton);
		
		return panel;
	}
}
