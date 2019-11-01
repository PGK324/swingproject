import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class First {

	private JFrame frame;
	private JTextField txtPowerOff;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First window = new First();
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
	public First() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 774, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(23, 81, 23, -62);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAaaa = new JButton();
		btnAaaa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAaaa.setText("Signin");
		btnAaaa.setBackground(SystemColor.activeCaption);
		btnAaaa.setForeground(Color.BLUE);
		btnAaaa.setFont(new Font("Mangal", Font.BOLD, 13));
		btnAaaa.setBounds(89, 252, 78, 35);
		frame.getContentPane().add(btnAaaa);
		
		txtPowerOff = new JTextField();
		txtPowerOff.setBackground(Color.WHITE);
		txtPowerOff.setText("Username");
		txtPowerOff.setBounds(135, 96, 195, 35);
		frame.getContentPane().add(txtPowerOff);
		txtPowerOff.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setText("Password");
		txtPassword.setBounds(135, 163, 195, 35);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JCheckBox chckbxForgot = new JCheckBox("Remainder");
		chckbxForgot.setBackground(SystemColor.activeCaption);
		chckbxForgot.setBounds(89, 204, 163, 27);
		frame.getContentPane().add(chckbxForgot);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\User 1\\Downloads\\u.png"));
		btnNewButton_1.setBounds(89, 96, 40, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\User 1\\Downloads\\d.png"));
		btnNewButton_2.setBounds(89, 163, 40, 35);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnSignup = new JButton("Signup");
		btnSignup.setBackground(SystemColor.activeCaption);
		btnSignup.setBounds(252, 253, 78, 34);
		frame.getContentPane().add(btnSignup);
		
		JLabel lblLogin = new JLabel("Signin");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setBackground(SystemColor.activeCaption);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblLogin.setBounds(160, 13, 117, 57);
		frame.getContentPane().add(lblLogin);
	}
}
