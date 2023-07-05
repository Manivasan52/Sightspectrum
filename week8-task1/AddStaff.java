package task1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddStaff extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStaff frame = new AddStaff();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param <PreparedStatement>
	 * @throws SQLException 
	 */
	public <PreparedStatement> AddStaff() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(151, 151, 255));
		panel.setBounds(0, 0, 575, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD STAFF");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblNewLabel.setBounds(189, 11, 235, 46);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("STAFF ID");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1.setBounds(38, 122, 151, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NAME");
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(38, 211, 151, 47);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("CONTACT");
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(38, 301, 151, 47);
		contentPane.add(lblNewLabel_1_2);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		txt1.setBounds(285, 122, 233, 47);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setFont(new Font("Segoe UI", Font.BOLD, 25));
		txt2.setColumns(10);
		txt2.setBounds(285, 211, 233, 47);
		contentPane.add(txt2);
		
		txt3 = new JTextField();
		txt3.setFont(new Font("Segoe UI", Font.BOLD, 25));
		txt3.setColumns(10);
		txt3.setBounds(285, 301, 233, 47);
		contentPane.add(txt3);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			String url="jdbc:mysql://localhost/library";
			String mysqluser="root";
			String mysqlpass="11402";
			String sql="insert into staff(staff_id,name,contact)values (?,?,?)";
			Connection conn=DriverManager.getConnection(url,mysqluser,mysqlpass);
			 java.sql.PreparedStatement pst = conn.prepareCall(sql);
			public void actionPerformed(ActionEvent e) {
				try{
		            
		            pst = conn.prepareStatement(sql);
		            pst.setString(1, txt1.getText());
		            pst.setString(2, txt2.getText());
		            pst.setString(3, txt3.getText());
		            pst.execute();
		            JOptionPane.showMessageDialog(null, "Inserted successfully!");
		        }catch(Exception ex){
		            JOptionPane.showMessageDialog(null, ex);
		        }
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnNewButton.setBounds(99, 403, 136, 40);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.hide();
				DashBoard d4=new DashBoard();
				d4.setVisible(true);
			}

			private void hide() {
				// TODO Auto-generated method stub
				
			}
		});
		btnBack.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnBack.setBounds(343, 403, 136, 40);
		contentPane.add(btnBack);
	}
}
