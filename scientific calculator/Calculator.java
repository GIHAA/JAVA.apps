import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calculator {

	private JFrame frame;
	private JTextField textField;


	double first;
	double second;
	double result;
	String opperation;
	String answer;
	boolean check = false;
	
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


	public Calculator() {
		initialize();
	}

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
		
		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton.setBounds(10, 123, 58, 58);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnx = new JButton("1/x");
		btnx.setEnabled(false);
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnx.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnx.setBounds(10, 185, 58, 58);
		frame.getContentPane().add(btnx);
		
		JButton btnXy_1 = new JButton("x^y");
		btnXy_1.setEnabled(false);
		btnXy_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double first = Double.parseDouble(textField.getText());
				textField.setText("");
				opperation = "x^y";
			}
		});
		btnXy_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnXy_1.setBounds(10, 246, 58, 58);
		frame.getContentPane().add(btnXy_1);
		
		JButton btnXy = new JButton("x^3");
		btnXy.setEnabled(false);
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				a = a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnXy.setBounds(10, 307, 58, 58);
		frame.getContentPane().add(btnXy);
		
		JButton btnX = new JButton("x^2");
		btnX.setEnabled(false);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a = a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnX.setBounds(10, 370, 58, 58);
		frame.getContentPane().add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.setEnabled(false);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while(a!= 0) {
					fact = fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnN.setBounds(10, 431, 58, 58);
		frame.getContentPane().add(btnN);
		
		JButton btnNewButton_6 = new JButton("+/-");
		btnNewButton_6.setEnabled(false);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_6.setBounds(10, 499, 58, 58);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnEx = new JButton("e^x");
		btnEx.setEnabled(false);
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEx.setBounds(78, 123, 58, 58);
		frame.getContentPane().add(btnEx);
		
		JButton btnNewButton_1_1 = new JButton("Log");
		btnNewButton_1_1.setEnabled(false);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(78, 185, 58, 58);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnpre = new JButton("%");
		btnpre.setEnabled(false);
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
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn7.setBounds(78, 307, 58, 58);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn4.setBounds(78, 370, 58, 58);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn1.setBounds(78, 431, 58, 58);
		frame.getContentPane().add(btn1);
		
		JButton btnSin = new JButton("sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSin.setBounds(146, 123, 58, 58);
		frame.getContentPane().add(btnSin);
		
		JButton btnerase = new JButton("c");
		btnerase.setEnabled(false);
		btnerase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnerase.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnerase.setBounds(146, 246, 58, 58);
		frame.getContentPane().add(btnerase);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn8.setBounds(146, 307, 58, 58);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn5.setBounds(146, 370, 58, 58);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn2.setBounds(146, 431, 58, 58);
		frame.getContentPane().add(btn2);
		
		JButton zero = new JButton("0");
		zero.setEnabled(false);
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+zero.getText();
				textField.setText(number);
			}
		});
		zero.setFont(new Font("Tahoma", Font.BOLD, 28));
		zero.setBounds(78, 499, 126, 58);
		frame.getContentPane().add(zero);
		
		JButton btnCos = new JButton("cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCos.setBounds(214, 123, 58, 58);
		frame.getContentPane().add(btnCos);
		
		JButton btnback = new JButton("\uF0E7");
		btnback.setEnabled(false);
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
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn9.setBounds(214, 307, 58, 58);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn6.setBounds(214, 370, 58, 58);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn3.setBounds(214, 431, 58, 58);
		frame.getContentPane().add(btn3);
		
		JButton btndot = new JButton(".");
		btndot.setEnabled(false);
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
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTan.setBounds(282, 123, 58, 58);
		frame.getContentPane().add(btnTan);
		
		JButton btnplus = new JButton("+");
		btnplus.setEnabled(false);
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
		btnsub.setEnabled(false);
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
		btnmul.setEnabled(false);
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
		btndivi.setEnabled(false);
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
		btnequl.setEnabled(false);
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
				else if(opperation == "x^y") {
					
					double resultt = 1;
					for(int i = 0; i < second; i++)
						resultt = first*resultt;
					answer = String.format("%.2f", resultt);
					textField.setText(answer);				}
			}
		});
		btnequl.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnequl.setBounds(282, 499, 58, 58);
		frame.getContentPane().add(btnequl);
		
		JButton btnAsin = new JButton("asin");
		btnAsin.setEnabled(false);
		btnAsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.asin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnAsin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAsin.setBounds(146, 185, 58, 58);
		frame.getContentPane().add(btnAsin);
		
		JButton btnAcos = new JButton("acos");
		btnAcos.setEnabled(false);
		btnAcos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.acos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnAcos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAcos.setBounds(214, 185, 58, 58);
		frame.getContentPane().add(btnAcos);
		
		JButton btnAtan = new JButton("atan");
		btnAtan.setEnabled(false);
		btnAtan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.atan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnAtan.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAtan.setBounds(282, 185, 58, 58);
		frame.getContentPane().add(btnAtan);
		
		JButton btnNewButton_1 = new JButton("ON / OFF");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(check == true) {
					textField.setText(null);
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					zero.setEnabled(false);
					btnNewButton_6.setEnabled(false);
					btnN.setEnabled(false);
					btnX.setEnabled(false);
					btnXy.setEnabled(false);
					btnXy_1.setEnabled(false);
					btnx.setEnabled(false);
					btnNewButton.setEnabled(false);
					btnEx.setEnabled(false);
					btnSin.setEnabled(false);
					btnCos.setEnabled(false);
					btnTan.setEnabled(false);
					btnNewButton_1_1.setEnabled(false);
					btnAsin.setEnabled(false);
					btnAcos.setEnabled(false);
					btnAtan.setEnabled(false);
					btnpre.setEnabled(false);
					btnerase.setEnabled(false);
					btnback.setEnabled(false);
					btnplus.setEnabled(false);
					btnsub.setEnabled(false);
					btnmul.setEnabled(false);
					btndivi.setEnabled(false);
					btnequl.setEnabled(false);
					btndot.setEnabled(false);
					check = false;
				}
				else{
					btn1.setEnabled(true);
					btn2.setEnabled(true);
					btn3.setEnabled(true);
					btn4.setEnabled(true);
					btn5.setEnabled(true);
					btn6.setEnabled(true);
					btn7.setEnabled(true);
					btn8.setEnabled(true);
					btn9.setEnabled(true);
					zero.setEnabled(true);
					btnNewButton_6.setEnabled(true);
					btnN.setEnabled(true);
					btnX.setEnabled(true);
					btnXy.setEnabled(true);
					btnXy_1.setEnabled(true);
					btnx.setEnabled(true);
					btnNewButton.setEnabled(true);
					btnEx.setEnabled(true);
					btnSin.setEnabled(true);
					btnCos.setEnabled(true);
					btnTan.setEnabled(true);
					btnNewButton_1_1.setEnabled(true);
					btnAsin.setEnabled(true);
					btnAcos.setEnabled(true);
					btnAtan.setEnabled(true);
					btnpre.setEnabled(true);
					btnerase.setEnabled(true);
					btnback.setEnabled(true);
					btnplus.setEnabled(true);
					btnsub.setEnabled(true);
					btnmul.setEnabled(true);
					btndivi.setEnabled(true);
					btnequl.setEnabled(true);
					btndot.setEnabled(true);
					check = true;
				}
			}
		});
		btnNewButton_1.setBounds(10, 92, 107, 21);
		frame.getContentPane().add(btnNewButton_1);
	}
}
