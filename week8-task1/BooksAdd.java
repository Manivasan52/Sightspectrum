package task1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class BooksAdd extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JButton b1;
	private JButton b2;
	private JLabel lb1;
	private JLabel lb2;
	private JLabel lb3;
	private JLabel lb4;
	private JLabel lb5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BooksAdd frame = new BooksAdd();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public BooksAdd() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBooksAvailable = new JLabel("BOOKS AVAILABLE");
		lblBooksAvailable.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblBooksAvailable.setBounds(127, 11, 394, 47);
		contentPane.add(lblBooksAvailable);
		
		panel = new JPanel();
		panel.setBackground(new Color(123, 148, 213));
		panel.setBounds(0, 0, 581, 69);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(275, 102, 225, 33);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(275, 171, 225, 33);
		contentPane.add(txt2);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(275, 242, 225, 33);
		contentPane.add(txt3);
		
		txt4 = new JTextField();
		txt4.setColumns(10);
		txt4.setBounds(275, 306, 225, 33);
		contentPane.add(txt4);
		
		txt5 = new JTextField();
		txt5.setColumns(10);
		txt5.setBounds(275, 374, 225, 33);
		contentPane.add(txt5);
		
		b1 = new JButton("ADD");
		b1.addActionListener(new ActionListener() {
			String url="jdbc:mysql://localhost/library";
			String mysqluser="root";
			String mysqlpass="11402";
			String sql = "insert into books(book_id, category, name, Author, copies) values(?, ?, ?, ?, ?)";
			Connection conn=DriverManager.getConnection(url,mysqluser,mysqlpass);
		    PreparedStatement pst = conn.prepareCall(sql);

			public void actionPerformed(ActionEvent e) {
				try{
		            
		            pst = conn.prepareStatement(sql);
		            pst.setString(1, txt1.getText());
		            pst.setString(2, txt2.getText());
		            pst.setString(3, txt3.getText());
		            pst.setString(4, txt4.getText());
		            pst.setString(5, txt5.getText());
		            pst.execute();
		            JOptionPane.showMessageDialog(null, "Inserted successfully!");
		        }catch(Exception ex){
		            JOptionPane.showMessageDialog(null, ex);
		        }
		    }
				
		});
		b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		b1.setBounds(127, 461, 123, 35);
		contentPane.add(b1);
		
		b2 = new JButton("CANCEL");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.hide();
				DashBoard d4=new DashBoard();
				d4.setVisible(true);
			}

			private void hide() {
				// TODO Auto-generated method stub
				
			}
		});
		b2.setFont(new Font("Segoe UI", Font.BOLD, 25));
		b2.setBounds(342, 461, 147, 35);
		contentPane.add(b2);
		
		lb1 = new JLabel("BOOK ID");
		lb1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lb1.setBounds(26, 102, 173, 33);
		contentPane.add(lb1);
		
		lb2 = new JLabel("CATEGORY");
		lb2.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lb2.setBounds(26, 171, 173, 33);
		contentPane.add(lb2);
		
		lb3 = new JLabel("NAME");
		lb3.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lb3.setBounds(26, 242, 173, 33);
		contentPane.add(lb3);
		
		lb4 = new JLabel("AUTHOR");
		lb4.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lb4.setBounds(26, 315, 173, 33);
		contentPane.add(lb4);
		
		lb5 = new JLabel("COPIES");
		lb5.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lb5.setBounds(26, 374, 173, 33);
		contentPane.add(lb5);
	}
}
