import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class MassIndex {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	double num1;
	double num2;
	double res1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MassIndex window = new MassIndex();
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
	public MassIndex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(50, 205, 50));
		panel.setBounds(12, 13, 408, 53);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Body Mass Index");
		lblNewLabel_2.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		lblNewLabel_2.setBounds(146, 13, 224, 27);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(50, 205, 50));
		panel_1.setBounds(12, 79, 408, 202);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 239, 213));
		textField.setBounds(133, 30, 195, 22);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 239, 213));
		textField_1.setBounds(133, 77, 195, 22);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Height");
		lblNewLabel.setBounds(49, 33, 56, 16);
		panel_1.add(lblNewLabel);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(49, 80, 56, 16);
		panel_1.add(lblWeight);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 140, 0));
		textField_2.setBounds(133, 112, 75, 22);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setBounds(49, 115, 56, 16);
		panel_1.add(lblBmi);
		
		JLabel l1 = new JLabel("");
		l1.setBounds(232, 115, 96, 26);
		panel_1.add(l1);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(191, 154, 61, 25);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				l1.setText(null);
			}
		});
		btnNewButton_1.setBounds(259, 154, 69, 25);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ok");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				String ans;
				res1=num2/(num1*num1);
				ans=String.format("%.2f",res1);	
				textField_2.setText(ans);
				if(res1<18.5)
				{
					l1.setText("Under Weight");
				}
				if(res1>18.5 && res1<24.9)
				{
					l1.setText("Normal Weight");
				}
				if(res1>25 && res1<29.9)
				{
					l1.setText("Over Weight");
				}
				if(res1>30)
				{
					l1.setText("Obese");
				}
			}
			
		});
		btnNewButton_2.setBounds(133, 154, 56, 25);
		panel_1.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(50, 205, 50));
		panel_2.setBounds(12, 294, 408, 97);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
	}
}
