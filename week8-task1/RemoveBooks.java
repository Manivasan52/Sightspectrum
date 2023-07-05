package task1;

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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class RemoveBooks extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveBooks frame = new RemoveBooks();
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
	public RemoveBooks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(157, 157, 255));
		panel.setBounds(0, 0, 552, 51);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REMOVE BOOK");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblNewLabel.setBounds(141, 11, 270, 29);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER BOOK ID  OR  BOOK NAME");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1.setBounds(61, 104, 440, 40);
		contentPane.add(lblNewLabel_1);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		txt1.setBounds(97, 179, 352, 40);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JButton b2 = new JButton("DELETE");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost/library";
				String mysqluser="root";
				String mysqlpass="11402";
				String input=txt1.getText();
				String sql="delete from books where book_id='"+input+"' or name='"+input+"';";
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
						JOptionPane.showMessageDialog(null, "No such book available");
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
		b2.setBounds(209, 289, 132, 40);
		contentPane.add(b2);
		
		JButton b3 = new JButton("CANCEL");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

			private void hide() {
				// TODO Auto-generated method stub
				
			}
		});
		b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
		b3.setBounds(389, 289, 132, 40);
		contentPane.add(b3);
		
		JButton b1 = new JButton("CLEAR");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt1.setText("");
			}
		});
		b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		b1.setBounds(35, 289, 132, 40);
		contentPane.add(b1);
	}

}
