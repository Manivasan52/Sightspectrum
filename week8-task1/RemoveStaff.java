package task1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class RemoveStaff extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveStaff frame = new RemoveStaff();
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
	public RemoveStaff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REMOVE BOOK");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblNewLabel.setBounds(140, 11, 270, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER STAFF ID  OR  STAFF NAME");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1.setBounds(71, 109, 440, 40);
		contentPane.add(lblNewLabel_1);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		txt1.setColumns(10);
		txt1.setBounds(112, 175, 352, 40);
		contentPane.add(txt1);
		
		JButton b2 = new JButton("DELETE");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost/library";
				String mysqluser="root";
				String mysqlpass="11402";
				String input=txt1.getText();
				String sql="delete from staff where staff_id='"+input+"' or name='"+input+"';";
				try {
					Connection con=DriverManager.getConnection(url,mysqluser,mysqlpass);
					Statement smt=con.createStatement();
					int rows=smt.executeUpdate(sql);
					if(rows>0)
					{
						JOptionPane.showMessageDialog(null, "Delete Successfully...");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No such staff available");
					}
					smt.close();
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		b2.setFont(new Font("Segoe UI", Font.BOLD, 25));
		b2.setBounds(208, 289, 132, 40);
		contentPane.add(b2);
		
		JButton b3 = new JButton("CANCEL");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
		b3.setBounds(408, 289, 132, 40);
		contentPane.add(b3);
		
		JButton b1 = new JButton("CLEAR");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt1.setText("");
			}
		});
		b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		b1.setBounds(40, 289, 132, 40);
		contentPane.add(b1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(170, 170, 255));
		panel.setBounds(0, 0, 558, 62);
		contentPane.add(panel);
	}

}
