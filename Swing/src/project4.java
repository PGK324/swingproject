import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;

public class project4 {

private JFrame frame;
private JTextField t1;
private JTextField t2;
private JTextField t3;
private JTextField t5;
private JTextField t6;
private JTextField t7;
private JTextField t9;
private JTextField t10;
private JTextField t11;
private JTextField t4;
private JTextField t8;
private JTextField tc;
double num1;
double num2;
double result;
String ans;
String op;
double india=30;
double china=25;
double europe=30;
double canada=32;

double meals=75;
double tea=9;
double cb=50;
double cof=13;
double br=50;
double cola=8;

double n1;
double n2;
double n3;
double n4;
double sub;
String aa;
double nn;
double tax;
String c;
String c1;
String cin;
String chi;
String can;
String eu;
String tt;
double tot;
double dd;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
project4 window = new project4();
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
public project4() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 1163, 626);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JLabel lblNewLabel = new JLabel("HOTEL MANAGEMENT SYSTEMS");
lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
lblNewLabel.setBounds(303, 11, 333, 29);
frame.getContentPane().add(lblNewLabel);

JPanel panel = new JPanel();
panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
panel.setBounds(12, 49, 522, 247);
frame.getContentPane().add(panel);
panel.setLayout(null);

JLabel lblNewLabel_1 = new JLabel("chicken burger");
lblNewLabel_1.setBounds(24, 23, 120, 14);
panel.add(lblNewLabel_1);

JLabel lblChickenBurgerMeal = new JLabel("chicken burger meal");
lblChickenBurgerMeal.setBounds(24, 57, 148, 14);
panel.add(lblChickenBurgerMeal);

JLabel lblCheesBurger = new JLabel("chees burger");
lblCheesBurger.setBounds(24, 93, 96, 14);
panel.add(lblCheesBurger);

JLabel lblDrink = new JLabel("drink");
lblDrink.setBounds(74, 147, 46, 14);
panel.add(lblDrink);

JLabel lblQty = new JLabel("qty");
lblQty.setBounds(184, 147, 56, 14);
panel.add(lblQty);

t1 = new JTextField();
t1.setBounds(204, 20, 189, 20);
panel.add(t1);
t1.setColumns(10);

t2 = new JTextField();
t2.setColumns(10);
t2.setBounds(204, 54, 189, 20);
panel.add(t2);

t3 = new JTextField();
t3.setColumns(10);
t3.setBounds(204, 90, 189, 20);
panel.add(t3);

t4 = new JTextField();
t4.setColumns(10);
t4.setBounds(181, 174, 86, 20);
panel.add(t4);

JComboBox comboBox = new JComboBox();
comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "tea", "cofee", "cola"}));
comboBox.setBounds(51, 174, 69, 20);
panel.add(comboBox);

JRadioButton rd1 = new JRadioButton("Home delivery");
rd1.setBounds(35, 203, 109, 23);
panel.add(rd1);

JRadioButton rd2 = new JRadioButton("tax");
rd2.setBounds(191, 203, 109, 23);
panel.add(rd2);

JPanel panel_1 = new JPanel();
panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
panel_1.setBounds(546, 51, 240, 245);
frame.getContentPane().add(panel_1);
panel_1.setLayout(null);

JLabel lblCurrencyCunverter = new JLabel("Currency Converter");
lblCurrencyCunverter.setFont(new Font("Tahoma", Font.BOLD, 18));
lblCurrencyCunverter.setBounds(25, 13, 203, 29);
panel_1.add(lblCurrencyCunverter);

t8 = new JTextField();
t8.setColumns(10);
t8.setBounds(65, 90, 86, 20);
panel_1.add(t8);

JComboBox comboBox_1 = new JComboBox();
comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"select", "india", "china", "europe", "canada"}));
comboBox_1.setBounds(50, 46, 126, 20);
panel_1.add(comboBox_1);

JLabel l7 = new JLabel("New label");
l7.setBounds(86, 138, 56, 16);
panel_1.add(l7);

JButton btnConvert = new JButton("convert");
btnConvert.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		double bp=sub;
		if(comboBox_1.getSelectedItem().equals("india"));
		{
		 c=String.format("%.2f",bp*india);
		 l7.setText(c);
		 
		 
		 tot=dd+tax;
		  tt=String.format(" %.2f",tot);
		  t11.setText(tt);
		 
		
		}
		if(comboBox_1.getSelectedItem().equals("china"));
		{
		 c=String.format("%.2f",bp*china);
		 l7.setText(c);
		 
		
		}
		if(comboBox_1.getSelectedItem().equals("europe"));
		{
		 c=String.format("%.2f",bp*europe);
		 l7.setText(c);
		 
		 
		
		}
		if(comboBox_1.getSelectedItem().equals("canada"));
		{
		 c=String.format("%.2f",bp*canada);
		 l7.setText(c);
		 
		 
		  
		 
		
		}
		
		 tax=(sub*18)/100;
		 c1=String.format(" %.2f",tax);
		 t9.setText(c1);
		t10.setText(aa);
		tot=sub+tax;
		  tt=String.format(" %.2f",tot);
		  t11.setText(tt);
		   
		   
		   
		
	}
});
btnConvert.setBounds(12, 211, 89, 23);
panel_1.add(btnConvert);

JButton btnClose = new JButton("close");
btnClose.setBounds(124, 211, 89, 23);
panel_1.add(btnClose);


JPanel panel_2 = new JPanel();
panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
panel_2.setBounds(10, 318, 526, 139);
frame.getContentPane().add(panel_2);
panel_2.setLayout(null);

JLabel lblCostOfDrink = new JLabel("cost of drink");
lblCostOfDrink.setBounds(27, 29, 102, 14);
panel_2.add(lblCostOfDrink);

JLabel lblCostOfMeal = new JLabel("cost of meal");
lblCostOfMeal.setBounds(27, 64, 102, 14);
panel_2.add(lblCostOfMeal);

JLabel lblCostOfDelivery = new JLabel("cost of delivery");
lblCostOfDelivery.setBounds(27, 100, 102, 14);
panel_2.add(lblCostOfDelivery);

t5 = new JTextField();
t5.setColumns(10);
t5.setBounds(173, 26, 86, 20);
panel_2.add(t5);

t6 = new JTextField();
t6.setColumns(10);
t6.setBounds(173, 61, 86, 20);
panel_2.add(t6);

t7 = new JTextField();
t7.setColumns(10);
t7.setBounds(173, 97, 86, 20);
panel_2.add(t7);

JPanel panel_3 = new JPanel();
panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
panel_3.setBounds(546, 318, 240, 139);
frame.getContentPane().add(panel_3);
panel_3.setLayout(null);

JLabel lblTax = new JLabel("tax");
lblTax.setBounds(23, 22, 46, 14);
panel_3.add(lblTax);

JLabel lblSubTotal = new JLabel("sub total");
lblSubTotal.setBounds(23, 58, 68, 14);
panel_3.add(lblSubTotal);

JLabel lblTotal = new JLabel("total");
lblTotal.setBounds(23, 100, 68, 14);
panel_3.add(lblTotal);

t9 = new JTextField();
t9.setColumns(10);
t9.setBounds(103, 19, 100, 20);
panel_3.add(t9);

t10 = new JTextField();
t10.setColumns(10);
t10.setBounds(103, 55, 100, 20);
panel_3.add(t10);

t11 = new JTextField();
t11.setColumns(10);
t11.setBounds(103, 97, 100, 20);
panel_3.add(t11);

JPanel panel_4 = new JPanel();
panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
panel_4.setBounds(10, 468, 1127, 75);
frame.getContentPane().add(panel_4);
panel_4.setLayout(null);

JButton btnNewButton = new JButton("Total");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
		 
         String hm=" ";
         
         
           n1=Double.parseDouble(t1.getText());
           n2=Double.parseDouble(t2.getText());
           n3=Double.parseDouble(t3.getText());
           n4=Double.parseDouble(t4.getText());
             if ((rd1.isSelected()==true) && (rd2.isSelected()==true) && comboBox.getSelectedItem().equals("tea"))
            {
                
                 String c=String.format(" %.2f",n1*br);
                 String d=String.format(" %.2f",n2*meals);
                 String f=String.format(" %.2f",n3*cb);
                 String ff=String.format(" %.2f",n4*tea);
                  
                 hm="25";
                 double nh=Double.parseDouble(hm);
                  sub=(n1*br)+(n2*meals)+(n3*cb)+(n4*tea)+nh;
                  aa=String.format("%s",sub);    
                   t8.setText(aa);
                   t5.setText(ff);
                   t6.setText(d);
                   t7.setText(hm);
                   
            }
             if ((rd1.isSelected()==true) && (rd2.isSelected()==true) && comboBox.getSelectedItem().equals("cofee"))
             {
                 
                  String c=String.format("%.2f",n1*br);
                  String d=String.format(" %.2f",n2*meals);
                  String f=String.format(" %.2f",n3*cb);
                  String ff=String.format("%.2f",n4*cof);
                  
                  hm="25";
                  double nh=Double.parseDouble(hm);
                   sub=(n1*br)+(n2*meals)+(n3*cb)+(n4*cof)+nh;
                   aa=String.format("%s",sub);    
                    t8.setText(aa);
                    t5.setText(ff);
                    t6.setText(d);
                    t7.setText(hm);
                    
             }
             if ((rd1.isSelected()==true) && (rd2.isSelected()==true) && comboBox.getSelectedItem().equals("cola"))
             {
                 
                  String c=String.format(" %.2f",n1*br);
                  String d=String.format(" %.2f",n2*meals);
                  String f=String.format(" %.2f",n3*cb);
                  String ff=String.format(" %.2f",n4*cola);
                   
                  hm="25";
                  double nh=Double.parseDouble(hm);
                   sub=(n1*br)+(n2*meals)+(n3*cb)+(n4*cola)+nh;
                   aa=String.format("%s",sub);    
                    t8.setText(aa);
                    t5.setText(ff);
                    t6.setText(d);
                    t7.setText(hm);
                    
             }
             
             if ((rd1.isSelected()==false) && (rd2.isSelected()==true) && comboBox.getSelectedItem().equals("tea"))
             {
                  
                  String c=String.format(" %.2f",n1*br);
                  String d=String.format(" %.2f",n2*meals);
                  String f=String.format(" %.2f",n3*cb);
                  String ff=String.format(" %.2f",n4*tea);
                   
                  hm="0";
                  double nh=Double.parseDouble(hm);
                   sub=(n1*br)+(n2*meals)+(n3*cb)+(n4*tea)+nh;
                   aa=String.format("%s",sub);    
                    t8.setText(aa);
                    t5.setText(ff);
                    t6.setText(d);
                    t7.setText(hm);
                    
             }
             if ((rd1.isSelected()==false) && (rd2.isSelected()==true) && comboBox.getSelectedItem().equals("cofee"))
             {
                 
                  String c=String.format(" %.2f",n1*br);
                  String d=String.format(" %.2f",n2*meals);
                  String f=String.format(" %.2f",n3*cb);
                  String ff=String.format("R %.2f",n4*cof);
                  
                  hm="25";
                  double nh=Double.parseDouble(hm);
                   sub=(n1*br)+(n2*meals)+(n3*cb)+(n4*cof)+nh;
                   aa=String.format("%s",sub);    
                    t8.setText(aa);
                    t5.setText(ff);
                    t6.setText(d);
                    t7.setText(hm);
                    
             }
             if ((rd1.isSelected()==false) && (rd2.isSelected()==true) && comboBox.getSelectedItem().equals("cola"))
             {
                
                  String c=String.format(" %.2f",n1*br);
                  String d=String.format(" %.2f",n2*meals);
                  String f=String.format(" %.2f",n3*cb);
                  String ff=String.format(" %.2f",n4*cola);
                   
                  hm="0";
                  double nh=Double.parseDouble(hm);
                   sub=(n1*br)+(n2*meals)+(n3*cb)+(n4*cola)+nn+nh;
                   aa=String.format("%s",sub);    
                    t8.setText(aa);
                    t5.setText(ff);
                    t6.setText(d);
                    t7.setText(hm);
                    
             }
	}
});
btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
btnNewButton.setBounds(270, 24, 89, 23);
panel_4.add(btnNewButton);


JButton btnReset = new JButton("Reset");
btnReset.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		t1.setText(null);
		t2.setText(null);
		t3.setText(null);
		t4.setText(null);
		t4.setText(null);
		t5.setText(null);
		t6.setText(null);
		t7.setText(null);
		t8.setText(null);
		t9.setText(null);
		t10.setText(null);
		t11.setText(null);
		tc.setText(null);
		l7.setText(null);
		rd1.setSelected(false);
		rd2.setSelected(false);
		
	}
});
btnReset.setFont(new Font("Tahoma", Font.BOLD, 17));
btnReset.setBounds(633, 24, 89, 23);
panel_4.add(btnReset);

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
btnExit.setFont(new Font("Tahoma", Font.BOLD, 17));
btnExit.setBounds(766, 24, 89, 23);
panel_4.add(btnExit);

JPanel panel_5 = new JPanel();
panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
panel_5.setBounds(798, 51, 341, 406);
frame.getContentPane().add(panel_5);
panel_5.setLayout(null);
JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
tabbedPane.setBounds(12, 33, 317, 360);
panel_5.add(tabbedPane);
JPanel panel_6 = new JPanel();
tabbedPane.addTab("New tab", null, panel_6, null);
panel_6.setLayout(null);

tc = new JTextField();
tc.setBounds(23, 13, 264, 46);
panel_6.add(tc);
tc.setColumns(10);

JButton b0 = new JButton("0");
b0.setFont(new Font("Tahoma", Font.BOLD, 14));
b0.setBounds(23, 281, 57, 36);
panel_6.add(b0);

JButton b1 = new JButton("1");
b1.setFont(new Font("Tahoma", Font.BOLD, 14));
b1.setBounds(23, 228, 57, 40);
panel_6.add(b1);

JButton b2 = new JButton("2");
b2.setFont(new Font("Tahoma", Font.BOLD, 14));
b2.setBounds(92, 228, 57, 40);
panel_6.add(b2);

JButton b4 = new JButton("4");
b4.setFont(new Font("Tahoma", Font.BOLD, 14));
b4.setBounds(23, 174, 57, 41);
panel_6.add(b4);

JButton b5 = new JButton("5");
b5.setFont(new Font("Tahoma", Font.BOLD, 14));
b5.setBounds(92, 174, 57, 41);
panel_6.add(b5);

JButton bdot = new JButton(".");
bdot.setBounds(92, 280, 57, 37);
panel_6.add(bdot);
bdot.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String number=tc.getText()+bdot.getText();
		tc.setText(number);
	}
});
bdot.setFont(new Font("Tahoma", Font.BOLD, 17));

JButton b3dot1 = new JButton("...");
b3dot1.setBounds(161, 280, 57, 37);
panel_6.add(b3dot1);
b3dot1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String number=tc.getText()+b3dot1.getText();
		tc.setText(number);
	}
});
b3dot1.setFont(new Font("Tahoma", Font.BOLD, 17));
JButton bequal = new JButton("=");
bequal.setFont(new Font("Tahoma", Font.BOLD, 14));
bequal.setBounds(230, 281, 57, 36);
panel_6.add(bequal);

JButton b3 = new JButton("3");
b3.setFont(new Font("Tahoma", Font.BOLD, 14));
b3.setBounds(161, 228, 57, 40);
panel_6.add(b3);
JButton bdiv = new JButton("/");
bdiv.setFont(new Font("Tahoma", Font.BOLD, 14));
bdiv.setBounds(230, 228, 57, 40);
panel_6.add(bdiv);

JButton b6 = new JButton("6");
b6.setFont(new Font("Tahoma", Font.BOLD, 14));
b6.setBounds(161, 174, 57, 41);
panel_6.add(b6);

JButton b7 = new JButton("7");
b7.setFont(new Font("Tahoma", Font.BOLD, 14));
b7.setBounds(22, 127, 57, 34);
panel_6.add(b7);

JButton b8 = new JButton("8");
b8.setFont(new Font("Tahoma", Font.BOLD, 14));
b8.setBounds(92, 127, 57, 34);
panel_6.add(b8);

JButton b9 = new JButton("9");
b9.setFont(new Font("Tahoma", Font.BOLD, 14));
b9.setBounds(161, 127, 57, 34);
panel_6.add(b9);

JButton bb = new JButton("B");
bb.setFont(new Font("Tahoma", Font.BOLD, 14));
bb.setBounds(22, 78, 57, 36);
panel_6.add(bb);

JButton bc = new JButton("c");
bc.setFont(new Font("Tahoma", Font.BOLD, 14));
bc.setBounds(92, 78, 57, 36);
panel_6.add(bc);

JButton b3dot = new JButton("%");
b3dot.setBounds(161, 78, 57, 36);
panel_6.add(b3dot);
b3dot.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		num1=Double.parseDouble(tc.getText());
		tc.setText("");
		op="%";
	}
});
b3dot.setFont(new Font("Tahoma", Font.BOLD, 12));

JButton bplus = new JButton("+");
bplus.setFont(new Font("Tahoma", Font.BOLD, 14));
bplus.setBounds(230, 78, 57, 36);
panel_6.add(bplus);

JButton bminus = new JButton("-");
bminus.setFont(new Font("Tahoma", Font.BOLD, 14));
bminus.setBounds(230, 127, 57, 34);
panel_6.add(bminus);

JButton bmul = new JButton("*");
bmul.setFont(new Font("Tahoma", Font.BOLD, 14));
bmul.setBounds(230, 174, 57, 41);
panel_6.add(bmul);
bmul.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		num1 = Double.parseDouble(tc.getText());
		tc.setText("");
		op = "*";
	}
});
bminus.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
	 num1 = Double.parseDouble(tc.getText());
		tc.setText("");
		op = "-";
}
});
bplus.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		 num1 = Double.parseDouble(tc.getText());
		tc.setText("");
		op = "+";
	}
});
bc.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		tc.setText(null);
	}
});
bb.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String b=null;
        if(tc.getText().length()>0)
        {
            StringBuilder strb=new StringBuilder(tc.getText());
            strb.deleteCharAt(tc.getText().length()-1);
            b=strb.toString();
            tc.setText(b);
        }

	}
});
b9.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String number=tc.getText()+b9.getText();
		tc.setText(number);
	}
});
b8.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String number=tc.getText()+b8.getText();
		tc.setText(number);
	}
});
b7.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String number=tc.getText()+b7.getText();
		tc.setText(number);
	}
});
b6.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String number=tc.getText()+b6.getText();
		tc.setText(number);
	}
});
bdiv.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		num1 = Double.parseDouble(tc.getText());
		tc.setText("");
		op = "/";
	}
	
});
b3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String number=tc.getText()+b3.getText();
		tc.setText(number);
	}
});
bequal.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		 num2 = Double.parseDouble(tc.getText());
		String ans;
		double result;
		if(op=="+")
		{
		result=num1+num2;
		ans=String.format("%.2f",result);
		tc.setText(ans);
		}
		if(op=="-")
		{
		result=num1-num2;
		ans=String.format("%.2f",result);
		tc.setText(ans);
		}
		if(op=="*")
		{
			result=num1*num2;
			ans=String.format("%.2f",result);
			tc.setText(ans);
		}
		if(op=="/")
		{
		result=num1/num2;
		ans=String.format("%.2f",result);
		tc.setText(ans);
		}
		if(op=="%")
		{
		result=num1/num2;
		ans=String.format("%.2f",result);
		tc.setText(ans);
		}
		
	}
});
b5.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String number=tc.getText()+b5.getText();
		tc.setText(number);
	}
});
b4.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String number=tc.getText()+b4.getText();
		tc.setText(number);
	}
});
b2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String number=tc.getText()+b2.getText();
		tc.setText(number);
	}
});
b1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String number=tc.getText()+b1.getText();
		tc.setText(number);
	}
});
b0.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		String number=tc.getText()+b0.getText();
		tc.setText(number);
	}
});
JPanel panel_7 = new JPanel();
tabbedPane.addTab("Receipt",null, panel_7, null);
panel_7.setLayout(null);
JLabel label_1 = new JLabel("chicken burger meal");
label_1.setBounds(12, 75, 148, 14);
panel_7.add(label_1);
JLabel label_2 = new JLabel("chees burger");
label_2.setBounds(12, 118, 96, 14);
panel_7.add(label_2);
JLabel label_3 = new JLabel("tax");
label_3.setBounds(12, 161, 46, 14);
panel_7.add(label_3);
JLabel label_4 = new JLabel("sub total");
label_4.setBounds(12, 203, 68, 14);
panel_7.add(label_4);
JLabel label_5 = new JLabel("total");
label_5.setBounds(12, 245, 68, 14);
panel_7.add(label_5);
JPanel panel_8 = new JPanel();
panel_8.setLayout(null);
panel_8.setBounds(0, 0, 312, 330);
panel_7.add(panel_8);
JLabel label_7 = new JLabel("chicken burger meal");
label_7.setBounds(12, 75, 148, 14);
panel_8.add(label_7);
JLabel label_8 = new JLabel("chees burger");
label_8.setBounds(12, 118, 96, 14);
panel_8.add(label_8);
JLabel label_9 = new JLabel("tax");
label_9.setBounds(12, 161, 46, 14);
panel_8.add(label_9);
JLabel label_10 = new JLabel("sub total");
label_10.setBounds(12, 203, 68, 14);
panel_8.add(label_10);
JLabel label_11 = new JLabel("total");
label_11.setBounds(12, 245, 68, 14);
panel_8.add(label_11);
JLabel ccc = new JLabel("");
ccc.setBounds(172, 74, 56, 16);
panel_8.add(ccc);
JLabel cees = new JLabel("");
cees.setBounds(172, 117, 56, 16);
panel_8.add(cees);
JLabel taxe = new JLabel("");
taxe.setBounds(172, 160, 56, 16);
panel_8.add(taxe);
JLabel subt = new JLabel("");
subt.setBounds(172, 202, 56, 16);
panel_8.add(subt);
JLabel total = new JLabel("");
total.setBounds(172, 244, 56, 16);
panel_8.add(total);
JLabel lblThanksForPurchase = new JLabel("Thanks for purchase");
lblThanksForPurchase.setBounds(12, 301, 131, 16);
panel_8.add(lblThanksForPurchase);


JButton btnRecev = new JButton("Receipt");
btnRecev.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String d=String.format(" %.2f",n2*meals);
		ccc.setText(d);
		 String f=String.format(" %.2f",n3*cb);
		cees.setText(f);
		taxe.setText(c1);
		
		subt.setText(aa);
		
		total.setText(tt);
	}
	
});
btnRecev.setFont(new Font("Tahoma", Font.BOLD, 17));
btnRecev.setBounds(458, 24, 105, 23);
panel_4.add(btnRecev);

}
}

