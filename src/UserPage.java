import java.awt.EventQueue;

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

public class UserPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPage frame = new UserPage();
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
	public UserPage() {
		setTitle("Store Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 525);
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 173, 118);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Silver Necklace");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(30, 140, 129, 14);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("More Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 11, 173, 118);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gold Necklace");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(30, 140, 129, 14);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("More Details");
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
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(10, 11, 173, 118);
		panel_1_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Bronze Necklace");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(30, 140, 129, 14);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("More Details");
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
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 11, 173, 118);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_2 = new JLabel("Silver Ring");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(30, 140, 129, 14);
		panel_2.add(lblNewLabel_1_2);
		
		JButton btnNewButton_2 = new JButton("More Details");
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
		
		JLabel lblNewLabel_4_1 = new JLabel("New label");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(10, 11, 173, 118);
		panel_2_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Gold Ring");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_1.setBounds(30, 140, 129, 14);
		panel_2_1.add(lblNewLabel_1_2_1);
		
		JButton btnNewButton_2_1 = new JButton("More Details");
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
		
		JLabel lblNewLabel_4_2 = new JLabel("New label");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setBounds(10, 11, 173, 118);
		panel_2_2.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Bronze Ring");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_2.setBounds(30, 140, 129, 14);
		panel_2_2.add(lblNewLabel_1_2_2);
		
		JButton btnNewButton_2_2 = new JButton("More Details");
		btnNewButton_2_2.setForeground(Color.WHITE);
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2_2.setBackground(Color.BLACK);
		btnNewButton_2_2.setBounds(10, 163, 173, 23);
		panel_2_2.add(btnNewButton_2_2);
		
		JButton lblNewLabel_5 = new JButton("");
		lblNewLabel_5.setBackground(new Color(255, 153, 102));
		lblNewLabel_5.setIcon(new ImageIcon("img/cart.png"));
		lblNewLabel_5.setBounds(546, 11, 30, 30);
		contentPane.add(lblNewLabel_5);

		setLocationRelativeTo(null);
	}

}
