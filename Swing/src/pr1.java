import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class pr1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pr1 window = new pr1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pr1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		frame.setBounds(100, 100, 865, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(12, 13, 823, 61);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(408, 5, 1, 1);
		panel.add(layeredPane_1);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(414, 5, 1, 1);
		panel.add(layeredPane);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setForeground(Color.RED);
		layeredPane_2.setBounds(60, 32, 110, -26);
		panel.add(layeredPane_2);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		layeredPane_3.setBounds(23, 25, 147, -19);
		panel.add(layeredPane_3);
		
		JLabel lblNewLabel = new JLabel("Royal Enfield");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 31));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(33, 13, 297, 35);
		panel.add(lblNewLabel);
		
		Label label = new Label("Log In");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		label.setBounds(743, 24, 70, 24);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(12, 123, 159, 452);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("standared");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblNewLabel_1.setBounds(12, 13, 91, 16);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("classic");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblNewLabel_2.setBounds(12, 42, 76, 16);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("thunderbird");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblNewLabel_3.setBounds(12, 79, 110, 16);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Himalaya");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblNewLabel_4.setBounds(12, 122, 91, 16);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Continental gt");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblNewLabel_5.setBounds(12, 151, 130, 28);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Interceptor");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblNewLabel_6.setBounds(12, 192, 110, 16);
		panel_1.add(lblNewLabel_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(12, 77, 823, 42);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Accessories");
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.setBounds(12, 13, 116, 25);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Apperal");
		btnNewButton_1.setForeground(Color.GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_1.setBounds(140, 13, 116, 25);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Rides");
		btnNewButton_2.setForeground(Color.GRAY);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_2.setBounds(268, 13, 116, 25);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Our World");
		btnNewButton_3.setForeground(Color.GRAY);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_3.setBounds(396, 13, 97, 25);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Support");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_4.setForeground(Color.GRAY);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_4.setBounds(505, 13, 97, 25);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Contact");
		btnNewButton_5.setForeground(Color.GRAY);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_5.setBounds(614, 13, 97, 25);
		panel_2.add(btnNewButton_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(174, 123, 661, 452);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setIcon(new ImageIcon("C:\\neymar\\royalenfield.gif"));
		btnNewButton_6.setBounds(0, 0, 661, 452);
		panel_3.add(btnNewButton_6);
	}
}
