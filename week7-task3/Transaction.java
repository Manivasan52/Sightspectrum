package task3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Transaction extends JFrame {
    private double balance = 0.0;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transaction frame = new Transaction();
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
	public Transaction() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 486);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(151, 151, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(0, 0, 523, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ATM MACHINE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(147, 11, 222, 37);
		panel.add(lblNewLabel);
		
		JButton btnWithdraw = new JButton("Withdrawal");
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String withdrawalAmount = JOptionPane.showInputDialog("Enter withdrawal amount:");
                double withdrawal = Double.parseDouble(withdrawalAmount);
                
				if (withdrawal <= balance) {
                    balance -= withdrawal;
                    JOptionPane.showMessageDialog(null, "Withdrawal Successfully.");
                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient balance.");
                }
			}
		});
		btnWithdraw.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnWithdraw.setBounds(336, 191, 160, 35);
		contentPane.add(btnWithdraw);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String depositAmount = JOptionPane.showInputDialog("Enter deposit amount:");

                // Update the balance
                double deposit = Double.parseDouble(depositAmount);
                balance += deposit;
                JOptionPane.showMessageDialog(null, "Deposit Successfully.");

			}
		});
		btnDeposit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDeposit.setBounds(23, 191, 160, 35);
		contentPane.add(btnDeposit);
		
		JButton btnBalance = new JButton("Balance");
		btnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Current Balance: $" + balance);
			}
		});
		btnBalance.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBalance.setBounds(336, 289, 160, 35);
		contentPane.add(btnBalance);
		
		JLabel lblNewLabel_1 = new JLabel(" Choose your Transaction");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBackground(new Color(0, 128, 64));
		lblNewLabel_1.setBounds(81, 96, 399, 57);
		contentPane.add(lblNewLabel_1);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(23, 289, 160, 35);
		contentPane.add(btnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(81, 96, 399, 57);
		contentPane.add(panel_1);
	}
}
