package task1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class EditAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditAdmin frame = new EditAdmin();
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
	public EditAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(168, 168, 255));
		panel.setBounds(0, 0, 559, 63);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EDIT ADMIN");
		lblNewLabel.setBounds(163, 0, 259, 52);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 35));
		
		JLabel lblNewLabel_1 = new JLabel("EDIT");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1.setBounds(78, 96, 91, 28);
		contentPane.add(lblNewLabel_1);
		
		JComboBox columnlist = new JComboBox();
		columnlist.setFont(new Font("Segoe UI", Font.BOLD, 25));
		columnlist.setModel(new DefaultComboBoxModel(new String[] {"user_id", "user_name", "user_password", "user_contact"}));
		columnlist.setBounds(78, 130, 186, 35);
		contentPane.add(columnlist);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER UPDATE VALUE");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_2.setBounds(157, 206, 318, 35);
		contentPane.add(lblNewLabel_2);
		
		txt1 = new JTextField();
		txt1.setBounds(148, 252, 298, 49);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JButton b1 = new JButton("UPDATE");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost/library";
				String mysqluser="root";
				String mysqlpass="11402";
				String column=columnlist.getSelectedItem().toString();
				String id=txt1.getText();
				String query="update admin set "+column+"='"+id+"';";
				try {
					Connection con=DriverManager.getConnection(url,mysqluser,mysqlpass);
					Statement smt=con.createStatement();
					int rows=smt.executeUpdate(query);
					if(rows>0)
					{
						JOptionPane.showMessageDialog(null, "Credentails Updated Successfully...");
					}
					txt1.setText("");
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
			}
		});
		b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		b1.setBounds(96, 365, 142, 41);
		contentPane.add(b1);
		
		JButton b2 = new JButton("CANCEL");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		b2.setFont(new Font("Segoe UI", Font.BOLD, 25));
		b2.setBounds(333, 365, 142, 41);
		contentPane.add(b2);
	}
}
