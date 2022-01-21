package Calculator_Ro_Buttons;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator_R_Button extends JFrame {

	private JPanel contentPane;
	private JTextField txtDisplay;
	
	String number, operations, answer;
	double num1, num2;
	double results;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_R_Button frame = new Calculator_R_Button();
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
	public Calculator_R_Button() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 263, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 11, 235, 46);
		contentPane.add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(number);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(0, 120, 55, 46);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(56, 120, 55, 46);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(112, 121, 55, 46);
		contentPane.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(number);
				
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(112, 163, 55, 46);
		contentPane.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(56, 163, 55, 46);
		contentPane.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(0, 162, 55, 46);
		contentPane.add(btn4);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(111, 211, 55, 46);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(56, 211, 55, 46);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(0, 211, 55, 46);
		contentPane.add(btn1);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(178, 117, 67, 46);
		contentPane.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
				
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnMinus.setBounds(178, 68, 67, 46);
		contentPane.add(btnMinus);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
				
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivide.setBounds(178, 166, 67, 46);
		contentPane.add(btnDivide);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
				
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMultiply.setBounds(178, 214, 67, 46);
		contentPane.add(btnMultiply);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(0, 260, 55, 46);
		contentPane.add(btn0);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				num2 = Double.parseDouble(txtDisplay.getText());
				if(operations == ("+"))
				{
					results =  num1 + num2;
					answer = String.format("%.2f", results);
					txtDisplay.setText(answer);
				}
				else if (operations == ("-"))
				
				{
					results = num1 - num2;
					answer = String.format("%.2f", results);
					txtDisplay.setText(answer);
			
				}
				
				else if(operations == ("*"))
					{
						results = num1 * num2;
						answer = String.format("%.2f", results);
						txtDisplay.setText(answer);
					}
					else if (operations == ("/"))
					
					{
						results = num1 / num2;
						answer = String.format("%.2f", results);
						txtDisplay.setText(answer);
				}
					else if (operations == ("%"))
					{
						results = num1 % num2;
						answer = String.format("%.2f", results);
						txtDisplay.setText(answer);
					}
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEquals.setBounds(47, 317, 154, 40);
		contentPane.add(btnEquals);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btnDot.getText();
				txtDisplay.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(56, 260, 55, 46);
		contentPane.add(btnDot);
		
		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisplay.setText(null);
				
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancel.setBounds(0, 68, 54, 46);
		contentPane.add(btnCancel);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
				
			}
		});
		btnPercentage.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPercentage.setBounds(178, 260, 67, 46);
		contentPane.add(btnPercentage);
		
		JButton btnPlusMinus = new JButton("\u00B1");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
		                ops =ops * (-1);
		           txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlusMinus.setBounds(112, 260, 55, 46);
		contentPane.add(btnPlusMinus);
		
		JButton btnBs = new JButton("\u2190");
		btnBs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = (null);
				
				if (txtDisplay.getText().length()>0 ){
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1 );
					number = strB.toString();
					txtDisplay.setText(number);
		
				}
			}
		});
		btnBs.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnBs.setBounds(64, 68, 89, 41);
		contentPane.add(btnBs);
	}
}
