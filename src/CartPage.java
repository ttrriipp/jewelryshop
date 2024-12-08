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
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(255, 153, 102));
		panel.setBounds(0, 0, 729, 79);
		contentPane.add(panel);
		
		JButton btnReturn = new JButton("Return to Selection");
		btnReturn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				UserPage selection = new UserPage();
				selection.setVisible(true);
			}
		});
		btnReturn.setFocusable(false);
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReturn.setBackground(new Color(255, 153, 102));
		btnReturn.setBounds(25, 22, 186, 30);
		panel.add(btnReturn);
		
		JLabel lblNewLabel = new JLabel("Your Cart");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(22, 90, 174, 41);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(22, 132, 430, 96);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("img/placeholder.jpg"));
		lblNewLabel_1.setBounds(10, 11, 83, 74);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Product Title");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(103, 23, 142, 21);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Price");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3.setForeground(new Color(0, 51, 204));
		lblNewLabel_3.setBounds(105, 45, 66, 14);
		panel_1.add(lblNewLabel_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(310, 35, 56, 27);
		panel_1.add(spinner);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("img/trash.png"));
		btnNewButton.setBounds(386, 33, 30, 30);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(474, 90, 245, 187);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Order Summary");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(20, 11, 137, 35);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Total:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(20, 69, 72, 26);
		panel_2.add(lblNewLabel_5);
		
		JLabel priceTotal = new JLabel("Price Total");
		priceTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		priceTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		priceTotal.setBounds(156, 69, 79, 26);
		panel_2.add(priceTotal);
		
		JButton btnNewButton_1 = new JButton("Proceed to Checkout");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(10, 145, 225, 31);
		panel_2.add(btnNewButton_1);
		setLocationRelativeTo(null);
	}
}
