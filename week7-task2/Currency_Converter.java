package task2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Currency_Converter extends JFrame {

	private JPanel contentPane;
	private JTextField txtAmount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Currency_Converter frame = new Currency_Converter();
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
	public Currency_Converter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 128, 128));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel.setBounds(10, 0, 639, 421);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter The Amount");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(42, 99, 199, 40);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("From Currency");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(42, 177, 199, 40);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("To Currency");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(42, 262, 199, 40);
		panel.add(lblNewLabel_1_2);
		
		txtAmount = new JTextField();
		txtAmount.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtAmount.setBounds(297, 99, 233, 40);
		panel.add(txtAmount);
		txtAmount.setColumns(10);
		
		JComboBox txtFrom = new JComboBox();
		txtFrom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtFrom.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtFrom.setModel(new DefaultComboBoxModel(new String[] {"USD Dollar", "INDIAN Rupees", "Srilakan Rupees", "Africa Rupees", "London Dollar", "Singapore Dollar", "Malasia Ringgit"}));
		txtFrom.setBounds(297, 177, 233, 40);
		panel.add(txtFrom);
		
		JComboBox txtTo = new JComboBox();
		txtTo.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtTo.setModel(new DefaultComboBoxModel(new String[] {"USD Dollar", "INDIAN Rupees", "Srilakan Rupees", "Africa Rupees", "London Dollar", "Singapore Dollar", "Malasia Ringgit"}));
		txtTo.setBounds(297, 262, 233, 40);
		panel.add(txtTo);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tot;
				double amount=Double.parseDouble(txtAmount.getText());
				if(txtFrom.getSelectedItem().toString()=="USD Dollar" && txtTo.getSelectedItem().toString()=="INDIAN Rupees")
				{
					tot=amount * 81.97;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+" ₹");
				}
				
				else if(txtFrom.getSelectedItem().toString()=="USD Dollar" && txtTo.getSelectedItem().toString()=="Srilakan Rupees") {
					tot=amount * 309.26;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"₹");
				}
				else if(txtFrom.getSelectedItem().toString()=="USD Dollar" && txtTo.getSelectedItem().toString()=="Africa Rupees") {
					tot=amount * 18.38;
					JOptionPane.showMessageDialog(null, "your Amount will be converted:  "+String.valueOf(tot)+" ZAR");
				}
				else if(txtFrom.getSelectedItem().toString()=="USD Dollar" && txtTo.getSelectedItem().toString()=="London Dollar")
				{
					tot=amount * 0.78;
					JOptionPane.showMessageDialog(null, "your Amount will be converted:   "+String.valueOf(tot)+" pounds $");
				}
				else if(txtFrom.getSelectedItem().toString()=="USD Dollar" && txtTo.getSelectedItem().toString()=="Singapore Dollar")
				{
					tot=amount * 1.35;
					JOptionPane.showMessageDialog(null, "your Amount will be converted:   "+String.valueOf(tot)+" SGD");
				}
				else if(txtFrom.getSelectedItem().toString()=="USD Dollar" && txtTo.getSelectedItem().toString()=="Malasia Ringgit")
				{
					tot=amount * 4.66;
					JOptionPane.showMessageDialog(null, "your Amount will be converted:   "+String.valueOf(tot)+" MYR");
				}
				else if(txtFrom.getSelectedItem().toString()=="INDIAN Rupees" && txtTo.getSelectedItem().toString()=="USD Dollar")
				{
					tot=amount * 0.012;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+" USD$");

				}
				else if(txtFrom.getSelectedItem().toString()=="INDIAN Rupees" && txtTo.getSelectedItem().toString()=="Srilakan Rupees")
				{
					tot=amount * 3.77;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+" ₹");

				}
				else if(txtFrom.getSelectedItem().toString()=="INDIAN Rupees" && txtTo.getSelectedItem().toString()=="Africa Rupees")
				{
					tot=amount * 0.23;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+" ZAR");

				}
				else if(txtFrom.getSelectedItem().toString()=="INDIAN Rupees" && txtTo.getSelectedItem().toString()=="London Dollar")
				{
					tot=amount * 0.0096;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+" pounds $");

				}
				else if(txtFrom.getSelectedItem().toString()=="INDIAN Rupees" && txtTo.getSelectedItem().toString()=="Singapore Dollar")
				{
					tot=amount * 0.016;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+" SGD");

				}
				else if(txtFrom.getSelectedItem().toString()=="INDIAN Rupees" && txtTo.getSelectedItem().toString()=="Malasia Ringgit")
				{
					tot=amount * 0.057;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+" MYR");

				}
				else if(txtFrom.getSelectedItem().toString()=="Srilakan Rupees" && txtTo.getSelectedItem().toString()=="USD Dollar")
				{
					tot=amount * 0.0032;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  USD$");

				}
				else if(txtFrom.getSelectedItem().toString()=="Srilakan Rupees" && txtTo.getSelectedItem().toString()=="INDIAN Rupees")
				{
					tot=amount * 0.0032;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+" ₹");

				}
				else if(txtFrom.getSelectedItem().toString()=="Srilakan Rupees" && txtTo.getSelectedItem().toString()=="Africa Rupees")
				{
					tot=amount * 0.06082;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+" ZAR");

				}
				else if(txtFrom.getSelectedItem().toString()=="Srilakan Rupees" && txtTo.getSelectedItem().toString()=="London Dollar")
				{
					tot=amount * 0.0025;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+" pounds $");

				}
				else if(txtFrom.getSelectedItem().toString()=="Srilakan Rupees" && txtTo.getSelectedItem().toString()=="Singapore Dollar")
				{
					tot=amount * 0.0044;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+" SGD");

				}
				else if(txtFrom.getSelectedItem().toString()=="Srilakan Rupees" && txtTo.getSelectedItem().toString()=="Malasia Ringgit")
				{
					tot=amount * 0.015;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+" MYR");

				}
				else if(txtFrom.getSelectedItem().toString()=="Africa Rupees" && txtTo.getSelectedItem().toString()=="USD Dollar")
				{
					tot=amount * 0.053347;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+" USD$");

				}
				else if(txtFrom.getSelectedItem().toString()=="Africa Rupees" && txtTo.getSelectedItem().toString()=="INDIAN Rupees")
				{
					tot=amount * 0.23;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+" ₹");

				}
				else if(txtFrom.getSelectedItem().toString()=="Africa Rupees" && txtTo.getSelectedItem().toString()=="Srilakan Rupees")
				{
					tot=amount * 4.43;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+" ₹");

				}
				else if(txtFrom.getSelectedItem().toString()=="Africa Rupees" && txtTo.getSelectedItem().toString()=="London Dollar")
				{
					tot=amount * 0.041896;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+" pounds $");

				}
				else if(txtFrom.getSelectedItem().toString()=="Africa Rupees" && txtTo.getSelectedItem().toString()=="Singapore Dollar")
				{
					tot=amount * 0.0721981;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+" SGD");

				}
				else if(txtFrom.getSelectedItem().toString()=="Africa Rupees" && txtTo.getSelectedItem().toString()=="Malasia Ringgit")
				{
					tot=amount * 0.249476;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  MYR");

				}
				else if(txtFrom.getSelectedItem().toString()=="London Dollar" && txtTo.getSelectedItem().toString()=="USD Dollar")
				{
					tot=amount * 1.27;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  USD$");

				}
				else if(txtFrom.getSelectedItem().toString()=="London Dollar" && txtTo.getSelectedItem().toString()=="INDIAN Rupees")
				{
					tot=amount * 104.38;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  ₹");

				}
				else if(txtFrom.getSelectedItem().toString()=="London Dollar" && txtTo.getSelectedItem().toString()=="Srilakan Rupees")
				{
					tot=amount * 393.58;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  ₹");

				}
				else if(txtFrom.getSelectedItem().toString()=="London Dollar" && txtTo.getSelectedItem().toString()=="Africa Rupees")
				{
					tot=amount * 23.49900;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  ZAR");

				}
				else if(txtFrom.getSelectedItem().toString()=="London Dollar" && txtTo.getSelectedItem().toString()=="Singapore Dollar")
				{
					tot=amount * 1.72;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  SGD");

				}
				else if(txtFrom.getSelectedItem().toString()=="London Dollar" && txtTo.getSelectedItem().toString()=="Malasia Ringgit")
				{
					tot=amount * 5.94;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  MYR");

				}
				else if(txtFrom.getSelectedItem().toString()=="Singapore Dollar" && txtTo.getSelectedItem().toString()=="USD Dollar")
				{
					tot=amount * 3.459334;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  USD$");

				}
				else if(txtFrom.getSelectedItem().toString()=="Singapore Dollar" && txtTo.getSelectedItem().toString()=="INDIAN Rupees")
				{
					tot=amount * 60.75;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  ₹");

				}
				else if(txtFrom.getSelectedItem().toString()=="Singapore Dollar" && txtTo.getSelectedItem().toString()=="Srilakan Rupees")
				{
					tot=amount * 229.06;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  ₹");

				}
				else if(txtFrom.getSelectedItem().toString()=="Singapore Dollar" && txtTo.getSelectedItem().toString()=="Africa Rupees")
				{
					tot=amount * 13.8635;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  ZAR");

				}
				else if(txtFrom.getSelectedItem().toString()=="Singapore Dollar" && txtTo.getSelectedItem().toString()=="London Dollar")
				{
					tot=amount * 0.58;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  pounds $");

				}
				else if(txtFrom.getSelectedItem().toString()=="Singapore Dollar" && txtTo.getSelectedItem().toString()=="Malasia Ringgit")
				{
					tot=amount * 3.46;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  MYR");

				}
				else if(txtFrom.getSelectedItem().toString()=="Malasia Ringgit" && txtTo.getSelectedItem().toString()=="USD Dollar")
				{
					tot=amount * 0.21;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  USD$");

				}
				else if(txtFrom.getSelectedItem().toString()=="Malasia Ringgit" && txtTo.getSelectedItem().toString()=="INDIAN Rupees")
				{
					tot=amount * 17.58;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  ₹");

				}
				else if(txtFrom.getSelectedItem().toString()=="Malasia Ringgit" && txtTo.getSelectedItem().toString()=="Srilakan Rupees")
				{
					tot=amount * 66.28;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  ₹");

				}
				else if(txtFrom.getSelectedItem().toString()=="Malasia Ringgit" && txtTo.getSelectedItem().toString()=="Africa Rupees")
				{
					tot=amount * 3.991805;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"  ZAR");

				}
				else if(txtFrom.getSelectedItem().toString()=="Malasia Ringgit" && txtTo.getSelectedItem().toString()=="London Dollar")
				{
					tot=amount * 0.17;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"   pounds $");

				}
				else if(txtFrom.getSelectedItem().toString()=="Malasia Ringgit" && txtTo.getSelectedItem().toString()=="Singapore Dollar")
				{
					tot=amount * 0.29;
					JOptionPane.showMessageDialog(null, "your Amount will be converted: "+String.valueOf(tot)+"   SGD");

				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(153, 333, 173, 58);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 4, 4, 5, (Color) new Color(255, 255, 255)));
		panel_1.setBackground(new Color(255, 128, 128));
		panel_1.setBounds(10, 11, 619, 64);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("$$ Currency Converter $$");
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 33));
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_1.setBounds(411, 333, 178, 58);
		panel.add(btnNewButton_1);
	}
}
