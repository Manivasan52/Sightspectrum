import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class employee {

	private JFrame frame;
	private JTextField user;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employee window = new employee();
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
	public employee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 784, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblloginPortal = new JLabel("            Employee Login Portal");
		lblloginPortal.setFont(new Font("Times New Roman", Font.BOLD, 45));
		lblloginPortal.setBounds(0, 0, 768, 75);
		frame.getContentPane().add(lblloginPortal);
		
		JLabel lblusername = new JLabel("UserName");
		lblusername.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblusername.setBounds(164, 133, 131, 38);
		frame.getContentPane().add(lblusername);
		
		JLabel lblpassword = new JLabel("PassWord");
		lblpassword.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblpassword.setBounds(164, 200, 131, 38);
		frame.getContentPane().add(lblpassword);
		
		user = new JTextField();
		user.setBounds(400, 133, 193, 38);
		frame.getContentPane().add(user);
		user.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(400, 200, 193, 38);
		frame.getContentPane().add(password);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String us=user.getText();
				String pass=password.getText();
				if(us.equals("sights")&&(pass.equals("1234")))
				{
					JOptionPane.showMessageDialog(null, "login successful");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "invalid Credentails");
				}
				
			}
		});
		btnlogin.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnlogin.setBounds(423, 274, 144, 38);
		frame.getContentPane().add(btnlogin);
		
		JButton btnreset = new JButton("Reset");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setText(null);
				password.setText(null);
			}
		});
		btnreset.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnreset.setBounds(201, 274, 152, 38);
		frame.getContentPane().add(btnreset);
	}
}
