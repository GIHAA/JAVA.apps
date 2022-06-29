import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Calculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	double first;
	double second;
	double result;
	String opperation;
	String answer;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 365, 627);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 0, 264, 32);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 42, 331, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("R");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnNewButton.setBounds(10, 123, 58, 58);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnx = new JButton("1/x");
		btnx.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnx.setBounds(10, 185, 58, 58);
		frame.getContentPane().add(btnx);
		
		JButton btnXy_1 = new JButton("x^y");
		btnXy_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXy_1.setBounds(10, 246, 58, 58);
		frame.getContentPane().add(btnXy_1);
		
		JButton btnXy = new JButton("x^3");
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXy.setBounds(10, 307, 58, 58);
		frame.getContentPane().add(btnXy);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnX.setBounds(10, 370, 58, 58);
		frame.getContentPane().add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnN.setBounds(10, 431, 58, 58);
		frame.getContentPane().add(btnN);
		
		JButton btnNewButton_6 = new JButton("+/-");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_6.setBounds(10, 499, 58, 58);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnEx = new JButton("e^x");
		btnEx.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEx.setBounds(78, 123, 58, 58);
		frame.getContentPane().add(btnEx);
		
		JButton btnNewButton_1_1 = new JButton("Log");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1_1.setBounds(78, 185, 58, 58);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnpre = new JButton("%");
		btnpre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				opperation = "%";
			}
		});
		btnpre.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnpre.setBounds(78, 246, 58, 58);
		frame.getContentPane().add(btnpre);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 33));
		btn7.setBounds(78, 307, 58, 58);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 33));
		btn4.setBounds(78, 370, 58, 58);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 33));
		btn1.setBounds(78, 431, 58, 58);
		frame.getContentPane().add(btn1);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");

			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSin.setBounds(146, 123, 58, 58);
		frame.getContentPane().add(btnSin);
		
		JButton btnNewButton_1_2 = new JButton("0");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnNewButton_1_2.setBounds(146, 185, 58, 58);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnerase = new JButton("c");
		btnerase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnerase.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnerase.setBounds(146, 246, 58, 58);
		frame.getContentPane().add(btnerase);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 33));
		btn8.setBounds(146, 307, 58, 58);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 33));
		btn5.setBounds(146, 370, 58, 58);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 33));
		btn2.setBounds(146, 431, 58, 58);
		frame.getContentPane().add(btn2);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+zero.getText();
				textField.setText(number);
			}
		});
		zero.setFont(new Font("Tahoma", Font.BOLD, 33));
		zero.setBounds(78, 499, 126, 58);
		frame.getContentPane().add(zero);
		
		JButton btnCos = new JButton("cos");
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCos.setBounds(214, 123, 58, 58);
		frame.getContentPane().add(btnCos);
		
		JButton btnNewButton_1_3 = new JButton("0");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnNewButton_1_3.setBounds(214, 185, 58, 58);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnback = new JButton("\uF0E7");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				
				if(textField.getText().length()>0) {
					
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);				}
			}
		});
		btnback.setFont(new Font("wingdings", Font.PLAIN, 19));
		btnback.setBounds(214, 246, 58, 58);
		frame.getContentPane().add(btnback);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 33));
		btn9.setBounds(214, 307, 58, 58);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 33));
		btn6.setBounds(214, 370, 58, 58);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 33));
		btn3.setBounds(214, 431, 58, 58);
		frame.getContentPane().add(btn3);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btndot.getText();
				textField.setText(number);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btndot.setBounds(214, 499, 58, 58);
		frame.getContentPane().add(btndot);
		
		JButton btnTan = new JButton("tan");
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTan.setBounds(282, 123, 58, 58);
		frame.getContentPane().add(btnTan);
		
		JButton btnNewButton_1_4 = new JButton("0");
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnNewButton_1_4.setBounds(282, 185, 58, 58);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				opperation = "+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnplus.setBounds(282, 246, 58, 58);
		frame.getContentPane().add(btnplus);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				opperation = "-";
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnsub.setBounds(282, 307, 58, 58);
		frame.getContentPane().add(btnsub);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				opperation = "*";
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnmul.setBounds(282, 370, 58, 58);
		frame.getContentPane().add(btnmul);
		
		JButton btndivi = new JButton("/");
		btndivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				opperation = "/";
			}
		});
		btndivi.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btndivi.setBounds(282, 431, 58, 58);
		frame.getContentPane().add(btndivi);
		
		JButton btnequl = new JButton("=");
		btnequl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				
				if(opperation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (opperation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(opperation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(opperation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(opperation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnequl.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnequl.setBounds(282, 499, 58, 58);
		frame.getContentPane().add(btnequl);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.setBounds(10, 96, 58, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OFF");
		rdbtnNewRadioButton_1.setBounds(66, 96, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
	}
}
