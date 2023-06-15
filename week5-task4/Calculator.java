import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.SystemColor;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double third;
	double addnumber;
	double result;
	double result2;
	String operator;
	String answer;

	/**
	 * Launch the application.
	 */
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
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.getContentPane().setLayout(null);
		
		JLabel calculaterLabel = new JLabel("            CALCULATOR");
		calculaterLabel.setForeground(new Color(0, 0, 0));
		calculaterLabel.setBackground(new Color(0, 0, 0));
		calculaterLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		calculaterLabel.setBounds(0, 0, 417, 56);
		frame.getContentPane().add(calculaterLabel);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(true);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn1.setBounds(23, 150, 70, 62);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn2.setBounds(121, 150, 70, 62);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn3.setBounds(215, 150, 70, 62);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn4.setBounds(315, 150, 70, 62);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
			
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn5.setBounds(23, 246, 70, 62);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn6.setBounds(121, 246, 70, 62);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn7.setBounds(215, 246, 70, 62);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn8.setBounds(315, 246, 70, 62);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn9.setBounds(23, 339, 70, 62);
		frame.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn0.setBounds(121, 339, 70, 62);
		frame.getContentPane().add(btn0);
		
		JButton oneBotton_9_1 = new JButton("+");
		oneBotton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operator="+";
				
				
			}
		});
		oneBotton_9_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		oneBotton_9_1.setBounds(215, 339, 70, 62);
		frame.getContentPane().add(oneBotton_9_1);
		
		JButton oneBotton_9_2 = new JButton("-");
		oneBotton_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operator="-";
			}
		});
		oneBotton_9_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		oneBotton_9_2.setBounds(315, 339, 70, 62);
		frame.getContentPane().add(oneBotton_9_2);
		
		JButton oneBotton_9_3 = new JButton("*");
		oneBotton_9_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operator="*";
			}
		});
		oneBotton_9_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		oneBotton_9_3.setBounds(23, 428, 70, 62);
		frame.getContentPane().add(oneBotton_9_3);
		
		JButton oneBotton_9_4 = new JButton("/");
		oneBotton_9_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operator="/";
			}
		});
		oneBotton_9_4.setFont(new Font("Tahoma", Font.BOLD, 40));
		oneBotton_9_4.setBounds(121, 428, 70, 62);
		frame.getContentPane().add(oneBotton_9_4);
		
		JButton oneBotton_9_5 = new JButton("%");
		oneBotton_9_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operator="%";
				
			}
		});
		oneBotton_9_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		oneBotton_9_5.setBounds(315, 428, 70, 62);
		frame.getContentPane().add(oneBotton_9_5);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setForeground(new Color(255, 255, 255));
		textField.setFont(new Font("Times New Roman", Font.BOLD, 40));
		textField.setBackground(new Color(0, 0, 0));
		textField.setBounds(20, 63, 386, 62);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton oneBotton_9_5_1 = new JButton("C");
		oneBotton_9_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		oneBotton_9_5_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		oneBotton_9_5_1.setBounds(215, 428, 70, 62);
		frame.getContentPane().add(oneBotton_9_5_1);
		
		JButton oneBotton_9_5_2 = new JButton("=");
		oneBotton_9_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operator=="+")
				{
					result=first+second;
					result2=result+addnumber;
					answer=String.format("%,2f", result2);
					textField.setText(answer);
				}
				else if(operator=="-")
				{
					result=first-second;
					result2=result-addnumber;
					answer=String.format("%,2f", result2);
					textField.setText(answer);
				}
				else if(operator=="*")
				{
					result=first*second;
					answer=String.format("%,2f", result);
					textField.setText(answer);
				}
				else if(operator=="/")
				{
					result=first/second;
					
					answer=String.format("%,2f", result);
					textField.setText(answer);
				}
				else if(operator=="%")
				{
					result=first%second;
					answer=String.format("%,2f", result);
					textField.setText(answer);
				}
				
				
				
			}
		});
		oneBotton_9_5_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		oneBotton_9_5_2.setBounds(23, 501, 259, 86);
		frame.getContentPane().add(oneBotton_9_5_2);
		
		JButton oneBotton_9_5_3 = new JButton("<-");
		oneBotton_9_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder sb=new StringBuilder(textField.getText());
					sb.deleteCharAt(textField.getText().length()-1);
					backspace=sb.toString();
					textField.setText(backspace);
				}
			}
		});
		oneBotton_9_5_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		oneBotton_9_5_3.setBounds(315, 501, 70, 86);
		frame.getContentPane().add(oneBotton_9_5_3);
	}
}
