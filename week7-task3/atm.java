package task3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class atm extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					atm frame = new atm();
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
	public atm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ATM MACHINE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(143, 11, 228, 40);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 128, 128));
		panel.setBounds(0, 0, 519, 64);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(145, 172, 238));
		panel_1.setBounds(0, 64, 519, 318);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel txtUsername = new JLabel("Username");
		txtUsername.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtUsername.setBounds(50, 67, 173, 46);
		panel_1.add(txtUsername);
		
		JLabel txtPassword = new JLabel("Password");
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtPassword.setBounds(50, 151, 173, 46);
		panel_1.add(txtPassword);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtUser.setBounds(246, 69, 237, 40);
		panel_1.add(txtUser);
		txtUser.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUser.getText();
	            String password = new String(txtPass.getPassword());
	            if (username.equals("admin") && password.equals("1234")) {
	            	JOptionPane.showMessageDialog(null, "Login Successfull");
	                showMainScreen();
	                Transaction t=new Transaction();
	                t.setVisible(true);
	                
	            } else {
	                JOptionPane.showMessageDialog(null, "Invalid credentials!");
	            }
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnLogin.setBounds(198, 239, 132, 40);
		panel_1.add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnExit.setBounds(361, 239, 132, 40);
		panel_1.add(btnExit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUser.setText("");
				txtPass.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClear.setBounds(31, 239, 132, 40);
		panel_1.add(btnClear);
		
		txtPass = new JPasswordField();
		txtPass.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtPass.setEchoChar('*');
		txtPass.setBounds(246, 155, 237, 42);
		panel_1.add(txtPass);
	}

	protected void showMainScreen() {
		// TODO Auto-generated method stub
		
	}
}
