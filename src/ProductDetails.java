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

public class ProductDetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductDetails frame = new ProductDetails();
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
	public ProductDetails() {
		setTitle("Product Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admin\\git\\jewelryshop-nw2d-ctcc0513\\img\\placeholderbig.jpg"));
		lblNewLabel.setBounds(25, 113, 434, 310);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Product Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_1.setBounds(507, 114, 254, 48);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 153, 102));
		panel.setBounds(0, 0, 811, 79);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton lblNewLabel_5 = new JButton("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\admin\\git\\jewelryshop-nw2d-ctcc0513\\img\\cart.png"));
		lblNewLabel_5.setBackground(new Color(255, 153, 102));
		lblNewLabel_5.setBounds(731, 22, 30, 30);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Return to Selection");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 153, 102));
		btnNewButton.setBounds(25, 22, 186, 30);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Price");
		lblNewLabel_2.setForeground(new Color(51, 51, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(490, 180, 143, 26);
		contentPane.add(lblNewLabel_2);
		
		JTextArea txtrProductDescription = new JTextArea();
		txtrProductDescription.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrProductDescription.setText("Product Description");
		txtrProductDescription.setEditable(false);
		txtrProductDescription.setBackground(SystemColor.menu);
		txtrProductDescription.setBounds(490, 217, 271, 58);
		contentPane.add(txtrProductDescription);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\admin\\git\\jewelryshop-nw2d-ctcc0513\\img\\cartwhite.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(490, 286, 169, 36);
		contentPane.add(btnNewButton_1);
	}
}
