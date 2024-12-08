package Frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductDetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public ProductDetails(String name, double price, String description, String type) {
		setTitle("Product Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel productImageLabel = new JLabel("");
		productImageLabel.setIcon(new ImageIcon("img/placeholderbig.jpg"));
		productImageLabel.setBounds(25, 113, 434, 310);
		contentPane.add(productImageLabel);
		
		JLabel productNameLabel = new JLabel(name);
		productNameLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		productNameLabel.setBounds(507, 114, 254, 48);
		contentPane.add(productNameLabel);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(new Color(255, 153, 102));
		headerPanel.setBounds(0, 0, 811, 79);
		contentPane.add(headerPanel);
		headerPanel.setLayout(null);
		
		JButton cartButton = new JButton("");
		cartButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				CartPage cartPage = new CartPage();
				cartPage.setVisible(true);
			}
		});
		cartButton.setIcon(new ImageIcon("img/cart.png"));
		cartButton.setBackground(new Color(255, 153, 102));
		cartButton.setBounds(731, 22, 30, 30);
		headerPanel.add(cartButton);
		
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
		returnButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		returnButton.setForeground(new Color(255, 255, 255));
		returnButton.setBackground(new Color(255, 153, 102));
		returnButton.setBounds(25, 22, 186, 30);
		headerPanel.add(returnButton);
		
		JLabel priceLabel = new JLabel(String.valueOf(price));
		priceLabel.setForeground(new Color(51, 51, 255));
		priceLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		priceLabel.setBounds(490, 180, 143, 26);
		contentPane.add(priceLabel);
		
		JTextArea descriptionArea = new JTextArea();
		descriptionArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		descriptionArea.setText(description);
		descriptionArea.setEditable(false);
		descriptionArea.setBackground(SystemColor.menu);
		descriptionArea.setBounds(490, 217, 271, 58);
		contentPane.add(descriptionArea);
		
		JButton addToCartButton = new JButton("Add to Cart");
		addToCartButton.setIcon(new ImageIcon("img/cartwhite.png"));
		addToCartButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		addToCartButton.setForeground(new Color(255, 255, 255));
		addToCartButton.setBackground(new Color(0, 0, 0));
		addToCartButton.setBounds(490, 286, 169, 36);
		addToCartButton.setFocusable(false);
		contentPane.add(addToCartButton);
		setLocationRelativeTo(null);
	}
}
