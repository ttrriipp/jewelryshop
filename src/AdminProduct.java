import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.LinkedList;

public class AdminProduct extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminProduct frame = new AdminProduct();
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
	public AdminProduct() {
		setTitle("Admin Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product Details");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 16));
		lblNewLabel.setBounds(90, 6, 179, 31);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 153, 102));
		panel.setBounds(0, 0, 108, 389);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnDashboard = new JButton("Dash\r\nBoard");
		btnDashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminDashboard adminDashboard = new AdminDashboard();
				adminDashboard.setVisible(true);
			}
		});
		btnDashboard.setBounds(10, 27, 85, 35);
		panel.add(btnDashboard);
		
		JButton btnProduct = new JButton("Product");
		btnProduct.setBounds(11, 73, 84, 35);
		panel.add(btnProduct);
		
		JLabel lblNewLabel_1 = new JLabel("Product");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(128, 128, 128));
		lblNewLabel_1.setBounds(128, 68, 64, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Price");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_1_1.setBounds(236, 68, 64, 19);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Details");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_1_1_1.setBounds(334, 68, 64, 19);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel labelProduct = new JLabel("Title Product");
		labelProduct.setHorizontalAlignment(SwingConstants.CENTER);
		labelProduct.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelProduct.setBounds(118, 106, 94, 31);
		contentPane.add(labelProduct);
		
		JComboBox priceValue = new JComboBox();
		priceValue.setBounds(236, 111, 53, 22);
		contentPane.add(priceValue);
		
		JTextPane descPane = new JTextPane();
		descPane.setBounds(320, 97, 94, 40);
		contentPane.add(descPane);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnSubmit.setBounds(437, 97, 94, 40);
		contentPane.add(btnSubmit);

		setLocationRelativeTo(null);
		setResizable(false);

		jewelry.push("ring");

	}

	LinkedList<String> jewelry = new LinkedList<String>();

}
