import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class Converter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1;
	double num2;
	double res1;
	double res2;
	private JLabel l1;
	private JLabel l2;
	private JLabel lblMetric;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnCancel;
	private JLabel lblConverter;
	private JLabel lblM;
	private JLabel lblKg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter window = new Converter();
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
	public Converter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 239, 213));
		textField.setBounds(109, 113, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 235, 205));
		textField_1.setBounds(109, 157, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			String ans;
			String ans1;
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				res1=num1/3.28;
				ans=String.format("%.2f",res1);
				l1.setText(ans);
				res2=num2/2.205;
				ans1=String.format("%.2f",res2);
				l2.setText(ans1);
			}
		});
		btnNewButton.setBounds(109, 217, 63, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
				l1.setText(null);
				l2.setText(null);
			}
		});
		btnNewButton_1.setBounds(184, 217, 69, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblUsMeasurment = new JLabel("US measurment");
		lblUsMeasurment.setBounds(109, 84, 116, 16);
		frame.getContentPane().add(lblUsMeasurment);
		
		JLabel lblNewLabel = new JLabel("Height");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(41, 116, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Weight");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(41, 160, 56, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		l1 = new JLabel("");
		l1.setBounds(280, 113, 56, 16);
		frame.getContentPane().add(l1);
		
		l2 = new JLabel("");
		l2.setBounds(280, 157, 56, 16);
		frame.getContentPane().add(l2);
		
		lblMetric = new JLabel("Metric");
		lblMetric.setBounds(269, 84, 56, 16);
		frame.getContentPane().add(lblMetric);
		
		lblNewLabel_2 = new JLabel("About");
		lblNewLabel_2.setBounds(321, 13, 56, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Help");
		lblNewLabel_3.setBounds(364, 13, 56, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(265, 217, 81, 25);
		frame.getContentPane().add(btnCancel);
		
		lblConverter = new JLabel("Converter");
		lblConverter.setForeground(Color.WHITE);
		lblConverter.setFont(new Font("Stencil", Font.BOLD, 18));
		lblConverter.setBounds(23, 13, 121, 31);
		frame.getContentPane().add(lblConverter);
		
		lblM = new JLabel("m");
		lblM.setBounds(333, 113, 56, 16);
		frame.getContentPane().add(lblM);
		
		lblKg = new JLabel("kg");
		lblKg.setBounds(333, 157, 56, 16);
		frame.getContentPane().add(lblKg);
	}
}
