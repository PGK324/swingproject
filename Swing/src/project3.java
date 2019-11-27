import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class project3 {

	private JFrame frame;
	private JTextField t1;
	private JTextField t3;
	private JTextField t2;
	private JTextField t4;
	private JTextField name;
	private JTextField frm;
	private JTextField to;
	private JTextField date;
	private JTextField tktno;
	private JTextField price;
	private JTextField route;
	private JTable table1;
	private JTextField tym;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project3 window = new project3();
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
	public project3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 999, 601);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(35, 117, 425, 264);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(23, 10, 91, 16);
		panel.add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(138, 7, 116, 22);
		panel.add(t1);
		t1.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Standarad");
		r1.setBounds(8, 38, 104, 25);
		panel.add(r1);
		
		JRadioButton r2 = new JRadioButton("Single ticket");
		r2.setBounds(138, 38, 104, 25);
		panel.add(r2);
		
		JRadioButton r3 = new JRadioButton("Adult");
		r3.setBounds(287, 38, 104, 25);
		panel.add(r3);
		
		JRadioButton r4 = new JRadioButton("First class");
		r4.setBounds(8, 65, 93, 25);
		panel.add(r4);
		
		JRadioButton r5 = new JRadioButton("Ac");
		r5.setBounds(105, 68, 61, 25);
		panel.add(r5);
		
		JRadioButton r7 = new JRadioButton("Child");
		r7.setBounds(297, 65, 67, 25);
		panel.add(r7);
		
		JRadioButton r6 = new JRadioButton("Sleeper");
		r6.setBounds(201, 68, 81, 25);
		panel.add(r6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Andraparadesh", "kanyakumari", "goa", "delhi", "mumbai", "kerala"}));
		comboBox.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		comboBox.setBounds(23, 99, 110, 22);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"kolkata", "orissa", "himalaya", "karnataka"}));
		comboBox_1.setBounds(145, 99, 109, 22);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_2.setBounds(271, 99, 104, 22);
		panel.add(comboBox_2);
		
		JLabel lblNewLabel_2 = new JLabel("Tax");
		lblNewLabel_2.setBounds(23, 135, 56, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblSubTotal = new JLabel("Sub total");
		lblSubTotal.setBounds(23, 157, 56, 16);
		panel.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("total");
		lblTotal.setBounds(23, 181, 56, 16);
		panel.add(lblTotal);
		
		t3 = new JTextField();
		t3.setBounds(126, 154, 116, 22);
		panel.add(t3);
		t3.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(126, 129, 116, 22);
		panel.add(t2);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(126, 178, 116, 22);
		panel.add(t4);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setForeground(Color.BLACK);
		btnTotal.setBackground(Color.LIGHT_GRAY);
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
                
                Calendar timer=Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
                tym.setText(tTime.format(timer.getTime()));
                //Date
                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
                date.setText(tdate.format(timer.getTime()));
                
                String v=" ";
                if(r5.isSelected()) {
                    v="AC";
                }
                else {
                    v="NON";
                }
                
                Random ran=new Random();
                int n=ran.nextInt(1000000)+1;
                String val=String.valueOf(n);
               tktno.setText(val);
               
               String va=" ";
               String Ac=" ";
               String non=" ";
               double no=Double.parseDouble((String)comboBox_2.getSelectedItem());
                
                   if ((r2.isSelected()==true) && (r5.isSelected()==true) && (r6.isSelected()==true ))
                  {
                       va="3400";
                       double nn=Double.parseDouble(va);
                       double sub=no*nn;
                       Ac="200";
                       String aa=String.format("%s",sub);    
                         t3.setText(aa);
                         String a1=String.format("%s", Ac);    
                          t2.setText(a1);
                  }
                  
                   if ((r2.isSelected()==false) && (r5.isSelected()==true) && (r6.isSelected()==true ))
                      {
                       va="4000";
                       double nn=Double.parseDouble(va);
                       double sub=no*nn;
                       Ac="200";
                       String aa=String.format("%s",sub);    
                          t3.setText(aa);
                         String a1=String.format("%s", Ac);    
                          t2.setText(a1);                        }
                      
                  
                   if ((r2.isSelected()==true) && (r5.isSelected()==false) && (r6.isSelected()==true ))
                      {
                       va="3000";
                       double nn=Double.parseDouble(va);
                       double sub=no*nn;
                       non="100";
                       String aa=String.format("%s",sub);    
                          t3.setText(aa);
                         String a1=String.format("%s", non);    
                          t2.setText(a1);
                      }
                  
                   if ((r2.isSelected()==false) && (r5.isSelected()==false) && (r6.isSelected()==true ))
                      {
                       va="3400";
                       double nn=Double.parseDouble(va);
                       double sub=no*nn;
                       non="100";
                       String aa=String.format("%s",sub);    
                          t3.setText(aa);
                         String a1=String.format("%s", non);    
                          t2.setText(a1);
                      }
                      
                   if ((r2.isSelected()==true) && (r5.isSelected()==true) && (r6.isSelected()==false ))
                      {
                       va="3200";
                       double nn=Double.parseDouble(va);
                       double sub=no*nn;
                       Ac="200";
                       String aa=String.format("%s",sub);    
                          t3.setText(aa);
                         String a1=String.format("%s", Ac);    
                          t2.setText(a1);
                      }
                   if ((r2.isSelected()==false) && (r5.isSelected()==false) && (r6.isSelected()==true ))
                      {
                       va="3800";
                       double nn=Double.parseDouble(va);
                       double sub=no*nn;
                       non="100";
                       String aa=String.format("%s",sub);    
                          t3.setText(aa);
                         String a1=String.format("%s", non);    
                          t2.setText(a1);
                      }
                   if ((r1.isSelected()==false) && (r2.isSelected()==false) && (r3.isSelected()==false ) && (r4.isSelected()==false)&&(r5.isSelected()==false)&&(r6.isSelected()==false)&&(r7.isSelected()==false))
                      {
                       JOptionPane.showMessageDialog(null, "Please choose the facilities");
                      }

                   String num=t1.getText();
                   name.setText(num);
                   String num1=(String)comboBox.getSelectedItem();
                   frm.setText(num1);
                   String num2=(String)comboBox_1.getSelectedItem();
                   to.setText(num2);
                   double a=Double.parseDouble(t2.getText());
                   double b=Double.parseDouble(t3.getText());
                   double c=a+b;
                    t4.setText(String.valueOf(c));
                   String num3=t4.getText();
                   price.setText(num3);
                   route.setText("any");

                   if(comboBox.getSelectedItem().toString().equals("Start")){
                       JOptionPane.showMessageDialog(null, "SELECT Starting place");
                  
                   }
                 if(comboBox_1.getSelectedItem().toString().equals("End")){
                       JOptionPane.showMessageDialog(null, "SELECT ending place");
                  
                   }
               
			}
		});
		btnTotal.setBounds(23, 226, 89, 25);
		panel.add(btnTotal);
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(Color.LIGHT_GRAY);
		btnReset.setBounds(145, 226, 89, 25);
		panel.add(btnReset);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.setBounds(271, 226, 83, 25);
		panel.add(btnExit);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 212, 364, -6);
		panel.add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(8, 213, 390, 0);
		panel.add(separator_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(1, 39, 390, 0);
		panel.add(separator_1);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBackground(Color.BLACK);
		separator_5.setBounds(8, 39, 390, 0);
		panel.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBackground(Color.BLACK);
		separator_6.setBounds(398, 38, 0, 213);
		panel.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(8, 35, 390, 3);
		panel.add(separator_7);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(8, 129, 372, 0);
		panel.add(separator_4);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(23, 129, 364, 2);
		panel.add(separator_8);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(23, 213, 364, 0);
		panel.add(separator_3);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(10, 211, 381, 2);
		panel.add(separator_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setBounds(399, 38, -1, 170);
		panel.add(separator_10);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setBackground(Color.BLACK);
		separator_11.setBounds(387, 38, 4, 211);
		panel.add(separator_11);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setBounds(399, 38, -1, 213);
		panel.add(separator_12);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setBounds(390, 37, 1, 214);
		panel.add(separator_13);
		
		JSeparator separator_14 = new JSeparator();
		separator_14.setBounds(399, 37, 0, 214);
		panel.add(separator_14);
		
		JSeparator separator_15 = new JSeparator();
		separator_15.setBounds(390, 38, 1, 198);
		panel.add(separator_15);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					frame=new JFrame("Exit");
		               if(JOptionPane.showConfirmDialog(frame, "Comfirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
		               {
		               System.exit(0);
		               }
			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
				r1.setSelected(false);
				r2.setSelected(false);
				r3.setSelected(false);
				r4.setSelected(false);
				r5.setSelected(false);
				r6.setSelected(false);
				r7.setSelected(false);

			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ticket_Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(486, 134, 453, 223);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String v=" ";
                if(r5.isSelected()) {
                    v="AC";
                }
                else {
                    v="NON";
                }
                DefaultTableModel model=(DefaultTableModel)table1.getModel();
                model.addRow(new String[] {t1.getText(),tktno.getText(),frm.getText(),to.getText(),(String)comboBox_2.getSelectedItem(),tym.getText(),date.getText(),v,price.getText()});


			}
		});
		btnNewButton.setBounds(173, 187, 116, 31);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setBounds(23, 29, 57, 16);
		panel_1.add(lblNewLabel_3);
		
		name = new JTextField();
		name.setBounds(92, 26, 116, 22);
		panel_1.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("from");
		lblNewLabel_4.setBounds(23, 58, 56, 16);
		panel_1.add(lblNewLabel_4);
		
		frm = new JTextField();
		frm.setBounds(91, 55, 116, 22);
		panel_1.add(frm);
		frm.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("to");
		lblNewLabel_5.setBounds(23, 97, 59, 16);
		panel_1.add(lblNewLabel_5);
		
		to = new JTextField();
		to.setBounds(91, 94, 116, 22);
		panel_1.add(to);
		to.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("date");
		lblNewLabel_6.setBounds(23, 164, 56, 16);
		panel_1.add(lblNewLabel_6);
		
		date = new JTextField();
		date.setBounds(92, 126, 116, 22);
		panel_1.add(date);
		date.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Ticket no");
		lblNewLabel_7.setBounds(279, 30, 56, 16);
		panel_1.add(lblNewLabel_7);
		
		tktno = new JTextField();
		tktno.setBounds(259, 52, 116, 22);
		panel_1.add(tktno);
		tktno.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("price");
		lblNewLabel_8.setBounds(290, 77, 56, 16);
		panel_1.add(lblNewLabel_8);
		
		price = new JTextField();
		price.setBounds(259, 94, 116, 22);
		panel_1.add(price);
		price.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("route");
		lblNewLabel_9.setBounds(290, 123, 56, 16);
		panel_1.add(lblNewLabel_9);
		
		route = new JTextField();
		route.setBounds(259, 142, 116, 22);
		panel_1.add(route);
		route.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("time");
		lblNewLabel_10.setBounds(23, 123, 56, 16);
		panel_1.add(lblNewLabel_10);
		
		tym = new JTextField();
		tym.setBounds(92, 161, 116, 22);
		panel_1.add(tym);
		tym.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(342, 46, 251, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		panel_2.setBounds(35, 437, 931, 65);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table1 = new JTable();
		table1.setModel(new DefaultTableModel(
			new Object[][] {
				{"name", "booking no", "from", "to", "no of seat", "time", "date", "ac/non ac", "price"},
			},
			new String[] {
				"name", "booking no", "from", "to", "no of seat", "time", "date", "ac/non ac", "price"
			}
		));
		table1.setBounds(12, 0, 858, 116);
		panel_2.add(table1);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					DefaultTableModel model=(DefaultTableModel)table1.getModel();
	                int rowno=table1.getSelectedRow();
	                
	                 try
	                    {
	                        int row = table1.getSelectedRow();
	                        
	                        model.removeRow(rowno);
	                    } catch (Exception msg)
	                    {
	                        JOptionPane.showMessageDialog(null, "Please choose the particular row");
	                    }	
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(308, 525, 113, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Print");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Thanks for booking..Happy journey!"
                        +" \nName :\t\t\t\t"+name.getText()
                        +"\n=================================================="
                        +"\nTicket No :\t\t\t\t"+tktno.getText()
                        +"\nFrom:\t\t\t\t"+frm.getText()
                        +"\nTo :\t\t\t\t"+to.getText()
                        +"\nDate :\t\t\t\t"+date.getText()
                        +"\nTime :\t\t\t\t"+tym.getText()
                        
                        +"\nTotal :\t\t\t\t"+price.getText()
                        +"\nRoute :\t\t\t\t"+route.getText()
                        
                        );

			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(474, 525, 108, 25);
		frame.getContentPane().add(btnNewButton_2);
	}
}
