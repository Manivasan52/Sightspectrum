package task1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class FirstPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage frame = new FirstPage();
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
	public FirstPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 584, 69);
		panel.setBackground(new Color(255, 0, 0));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LIBRARY MANAGEMENT SYSTEM");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 33));
		lblNewLabel.setBounds(20, 11, 554, 47);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Loginpage ll=new Loginpage();
				ll.setVisible(true);
			}
		});
		lblNewLabel_1.setBounds(87, 153, 428, 226);
		lblNewLabel_1.setIcon(new ImageIcon(FirstPage.class.getResource("/images/library.jpg")));
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(64, 0, 0), 7));
		panel_1.setBackground(new Color(157, 206, 255));
		panel_1.setBounds(143, 80, 318, 45);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("DOUBLE TOP THE IMAGE");
		lblNewLabel_2.setBounds(40, 11, 237, 27);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setBackground(new Color(0, 128, 255));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
	}
}
