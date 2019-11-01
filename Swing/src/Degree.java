import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class Degree {

	private JFrame frame;
	private JTextField textField;
	
	private JTextField textField_1;
	double num1;
	double num2;
	double res;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Degree window = new Degree();
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
	public Degree() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 329);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(163, 20, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setBounds(95, 23, 56, 16);
		frame.getContentPane().add(lblInput);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Celsious");
		rdbtnNewRadioButton.setBounds(31, 113, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		boolean isLinuxSelected = rdbtnNewRadioButton.isSelected();
		 
		if (isLinuxSelected) {
		 
			num1=Double.parseDouble(textField_1.getText());
	
			res=(num1*num1);
			ans=String.format("%.2f",res);	
			textField.setText(ans);
		 
		} else {
		 
		    // the Linux option is deselected
		 
		}
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Fareiheit");
		rdbtnNewRadioButton_1.setBounds(31, 155, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("kelvin");
		rdbtnNewRadioButton_2.setBounds(31, 199, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Celsious");
		rdbtnNewRadioButton_3.setBounds(201, 113, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Fareinheat");
		rdbtnNewRadioButton_4.setBounds(201, 155, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("kelvin");
		rdbtnNewRadioButton_5.setBounds(201, 199, 127, 25);
		rdbtnNewRadioButton_5.setSelected(true);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		JLabel lblNewLabel = new JLabel("Input Scale");
		lblNewLabel.setBounds(38, 84, 83, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Output Scale");
		lblNewLabel_1.setBounds(223, 84, 83, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Output");
		lblNewLabel_2.setBounds(95, 243, 56, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 240, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
	
	
}
