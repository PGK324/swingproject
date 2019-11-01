import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;

public class project2 {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	private JTextField t8;
	private JTextField t9;
	private JTextField t10;
	private JTextField t11;
	private JTextField t12;
	private JTextField t13;
	private JTextField t14;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project2 window = new project2();
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
	public project2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 1022, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new TitledBorder(null, "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBounds(12, 26, 467, 250);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student_id");
		lblNewLabel.setBounds(12, 20, 70, 16);
		panel.add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(94, 17, 116, 22);
		panel.add(t1);
		t1.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setBounds(12, 49, 70, 16);
		panel.add(lblFirstName);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(94, 46, 116, 22);
		panel.add(t2);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(12, 84, 70, 16);
		panel.add(lblSurname);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(94, 81, 116, 22);
		panel.add(t3);
		
		JLabel lblCouseCode = new JLabel("Couse code");
		lblCouseCode.setBounds(12, 110, 70, 16);
		panel.add(lblCouseCode);
		
		JLabel lblTotalScore = new JLabel("Total score");
		lblTotalScore.setBounds(12, 158, 70, 16);
		panel.add(lblTotalScore);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(94, 155, 116, 22);
		panel.add(t4);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setBounds(12, 187, 70, 16);
		panel.add(lblAverage);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(94, 184, 116, 22);
		panel.add(t5);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setBounds(12, 215, 70, 16);
		panel.add(lblRanking);
		
		t6 = new JTextField();
		t6.setColumns(10);
		t6.setBounds(94, 212, 116, 22);
		panel.add(t6);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setBounds(242, 13, 56, 16);
		panel.add(lblMaths);
		
		t7 = new JTextField();
		t7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
			
	                }}});
		t7.setColumns(10);
		t7.setBounds(325, 10, 116, 22);
		panel.add(t7);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setBounds(242, 38, 56, 16);
		panel.add(lblEnglish);
		
		t8 = new JTextField();
		t8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
			
			}}
		});
		t8.setColumns(10);
		t8.setBounds(325, 35, 116, 22);
		panel.add(t8);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setBounds(242, 67, 56, 16);
		panel.add(lblBiology);
		
		t9 = new JTextField();
		t9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
			
			}}
		});
		t9.setColumns(10);
		t9.setBounds(325, 64, 116, 22);
		panel.add(t9);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setBounds(242, 99, 56, 16);
		panel.add(lblComputer);
		
		t10 = new JTextField();
		t10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
			
			}}
		});
		t10.setColumns(10);
		t10.setBounds(325, 99, 116, 22);
		panel.add(t10);
		
		JLabel lblCemistry = new JLabel("Cemistry");
		lblCemistry.setBounds(242, 135, 56, 16);
		panel.add(lblCemistry);
		
		t11 = new JTextField();
		t11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
			
			}}
		});
		t11.setColumns(10);
		t11.setBounds(325, 132, 116, 22);
		panel.add(t11);
		
		JLabel lblPhysics = new JLabel("physics");
		lblPhysics.setBounds(242, 163, 56, 16);
		panel.add(lblPhysics);
		
		t12 = new JTextField();
		t12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
			
			}}
		});
		t12.setColumns(10);
		t12.setBounds(325, 160, 116, 22);
		panel.add(t12);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setBounds(242, 187, 56, 16);
		panel.add(lblTamil);
		
		t13 = new JTextField();
		t13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
			
			}}
		});
		t13.setColumns(10);
		t13.setBounds(325, 184, 116, 22);
		panel.add(t13);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setBounds(242, 215, 71, 16);
		panel.add(lblMalayalam);
		
		t14 = new JTextField();
		t14.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
			
			}}
		});
		t14.setColumns(10);
		t14.setBounds(325, 212, 116, 22);
		panel.add(t14);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"11111", "11112", "11113", "11114"}));
		comboBox.setBounds(94, 107, 116, 22);
		panel.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(148, 143, -133, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 0));
		separator_1.setBounds(12, 143, 205, 2);
		panel.add(separator_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		panel_1.setBorder(new TitledBorder(null, "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(512, 39, 428, 248);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 13, 404, 208);
		panel_1.add(textArea);
		
				JButton btnNewButton_1 = new JButton("Clear");
				btnNewButton_1.setBounds(158, 223, 97, 25);
				panel_1.add(btnNewButton_1);
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textArea.setText(null);
					}
				});
				btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
				btnNewButton_1.setForeground(Color.BLUE);
		
				
		JButton btnNewButton = new JButton("Add Report");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double t=Double.parseDouble(t7.getText());
	            double t21=Double.parseDouble(t8.getText());
	            double t22=Double.parseDouble(t9.getText());
	            double t33=Double.parseDouble(t10.getText());
	            double t44=Double.parseDouble(t11.getText());
	            double t55=Double.parseDouble(t12.getText());
	            double t66=Double.parseDouble(t13.getText());
	            double t77=Double.parseDouble(t14.getText());
	            double tot=t+t21+t22+t33+t44+t55+t66+t77;
	            double avg=tot/8;
	            
	            String tot1=String.format("%.2f",tot);
	            t4.setText(tot1);
	            String avg1=String.format("%.2f",avg);
	            t5.setText(avg1);
	            if(tot>700)
	            {
	            	t6.setText("1");
	            }
	            if(tot>600 && tot<700)
	            {
	            	t6.setText("2");
	            }
	            if(tot>500 && tot<600)
	            {
	            	t6.setText("3");
	            }

				DefaultTableModel model=(DefaultTableModel)table.getModel();
				 model.addRow(new Object[] {t1.getText(),comboBox.getSelectedItem(),t7.getText(),t8.getText(),t9.getText(),t10.getText(),t11.getText(),t12.getText(),t13.getText(),t14.getText(),t4.getText(),t5.getText(),t6.getText()});


		}});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(46, 139, 87));
		btnNewButton.setBounds(117, 382, 122, 19);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
                int rowno=table.getSelectedRow();
                
                 try
                    {
                        int row = table.getSelectedRow();
                        
                        model.removeRow(rowno);
                    } catch (Exception msg)
                    {
                        JOptionPane.showMessageDialog(null, "Please choose the particular row");
                    }	
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDelete.setForeground(new Color(255, 0, 0));
		btnDelete.setBounds(268, 382, 97, 19);
		frame.getContentPane().add(btnDelete);
		
		JButton btnShowReport = new JButton("Show Report");
		btnShowReport.setForeground(new Color(123, 104, 238));
		btnShowReport.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnShowReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("student Record\n"
	                       +"Student Name :\t\t"+t2.getText()+" "+t3.getText()
	                       +"\n=================================================="
	                       +"\nMath :\t\t"+t7.getText()
	                       +"\nEnglish :\t\t"+t8.getText()
	                       +"\nBiology :\t\t"+t9.getText()
	                       +"\ncomputer :\t\t"+t10.getText()
	                       +"\nChemistry :\t\t"+t11.getText()
	                       +"\nPhysics :\t\t"+t12.getText()
	                       +"\nTamil :\t\t"+t13.getText()
	                       +"\nMalayalam :\t\t"+t14.getText()
	                       +"\n================================================"
	                       +"\nTotal Score :\t\t"+t4.getText()
	                       +"\nAverage :\t\t"+t5.getText()
	                       +"\nRanking :\t\t"+t6.getText());
			}
		});
		btnShowReport.setBounds(394, 382, 135, 19);
		frame.getContentPane().add(btnShowReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
	               if(JOptionPane.showConfirmDialog(frame, "Comfirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
	               {
	               System.exit(0);
	               }
			}
		});
		btnExit.setForeground(new Color(255, 0, 0));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(564, 382, 97, 19);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
				t5.setText(null);
				t6.setText(null);
				t7.setText(null);
				t8.setText(null);
				t9.setText(null);
				t10.setText(null);
				t11.setText(null);
				t12.setText(null);
				t13.setText(null);
				t14.setText(null);
			}
		});
		btnReset.setForeground(new Color(218, 112, 214));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBounds(713, 382, 97, 19);
		frame.getContentPane().add(btnReset);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(22, 300, 951, 69);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setForeground(Color.BLACK);
		table.setBackground(Color.LIGHT_GRAY);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_id", "Course_name", "Maths", "English", "Biology", "computer", "chemistry", "physics", "tamil", "malayalam", "Total Score", "Average", "Ranking"},
			},
			new String[] {
				"Student_id", "Course_name", "Maths", "English", "Biology", "computer", "chemistry", "physics", "tamil", "malayalam", "Total Score", "Average", "Ranking"
			}
		));
		table.setBounds(12, 0, 927, 69);
		panel_2.add(table);
	}
}
