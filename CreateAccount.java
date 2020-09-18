package mybuspak;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.sql.*;
import mybuspak.DBConnection;
import javax.swing.ImageIcon;

public class CreateAccount extends JDialog implements ActionListener{
	private JTextField tf;
	private JTextField tf1;
	private JTextField tf2;
	private JButton s;
	private JButton c;
	private JPasswordField pass1;
	private JPasswordField pass2;
	private JRadioButton f;
	private JRadioButton m;

	private final ButtonGroup buttonGroup = new ButtonGroup();

	public CreateAccount() {
		setTitle("Create Account");
		setVisible(true);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(28, 45, 69, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblMobileNo = new JLabel("Mobile No.");
		lblMobileNo.setFont(new Font("Arial", Font.BOLD, 12));
		lblMobileNo.setBounds(28, 102, 69, 15);
		getContentPane().add(lblMobileNo);
		
		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 12));
		lblEmail.setBounds(28, 128, 69, 15);
		getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Create Password");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 12));
		lblPassword.setBounds(28, 154, 109, 15);
		getContentPane().add(lblPassword);
		
		tf = new JTextField();
		tf.setFont(new Font("Arial", Font.BOLD, 11));
		tf.setBounds(165, 43, 173, 20);
		getContentPane().add(tf);
		tf.setColumns(10);
		
		JLabel lblConfirmYourPassword = new JLabel("Confirm Your Password");
		lblConfirmYourPassword.setFont(new Font("Arial", Font.BOLD, 12));
		lblConfirmYourPassword.setBounds(26, 180, 144, 15);
		getContentPane().add(lblConfirmYourPassword);
		
		tf1 = new JTextField();
		tf1.setFont(new Font("Tahoma", Font.BOLD, 11));
		tf1.setBounds(167, 100, 136, 20);
		getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setFont(new Font("Tahoma", Font.BOLD, 11));
		tf2.setColumns(10);
		tf2.setBounds(167, 126, 254, 20);
		getContentPane().add(tf2);
		
		pass1 = new JPasswordField();
		pass1.setBounds(167, 152, 194, 20);
		getContentPane().add(pass1);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Arial", Font.BOLD, 12));
		lblGender.setBounds(28, 76, 69, 15);
		getContentPane().add(lblGender);
		
		m = new JRadioButton("Male ");
		buttonGroup.add(m);
		m.setFont(new Font("Arial", Font.BOLD, 12));
		m.setBounds(165, 70, 69, 23);
		getContentPane().add(m);
		
		f = new JRadioButton("Female");
		buttonGroup.add(f);
		f.setFont(new Font("Arial", Font.BOLD, 12));
		f.setBounds(243, 70, 80, 23);
		getContentPane().add(f);
		
		pass2 = new JPasswordField();
		pass2.setBounds(167, 178, 194, 20);
		getContentPane().add(pass2);
		
		s = new JButton("Submit");
		s.setMnemonic('s');
		s.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		s.setBounds(74, 227, 89, 23);
		getContentPane().add(s);
		
		c = new JButton("Cancel");
		c.setMnemonic('c');
		c.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		c.setBounds(214, 227, 89, 23);
		getContentPane().add(c);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(CreateAccount.class.getResource("/mybuspak/image/final page.jpg")));
		label.setBounds(0, 0, 447, 287);
		getContentPane().add(label);
		s.addActionListener(this);
		c.addActionListener(this);
		setSize(463, 326);
	}

	public static void main(String[] args) {
		new CreateAccount();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object ob=arg0.getSource();
		if(ob==c){
			dispose();
		}
		else if(ob==s) {
			
			String name=tf.getText();
				
			String gender=null;
			if(m.isSelected())
				gender="Male";
			else
				gender="Female";
			if(m.isSelected()==false && f.isSelected()==false)
			{
				JOptionPane.showMessageDialog(null, "Please...Select your gender","MCQ",JOptionPane.ERROR_MESSAGE);
				m.requestFocusInWindow();
			}
			String mobile=tf1.getText().trim();
			String mail=tf2.getText();
			
			String p1=new String(pass1.getPassword());
			String p2=new String(pass2.getPassword());
			if(!(p1.equals(p2))) {
				JOptionPane.showMessageDialog(null, "Please enter same password in both fields","ERROR",JOptionPane.ERROR_MESSAGE);
			    pass1.setText("");
			    pass2.setText("");
				pass1.requestFocusInWindow();
			}
			
			String st="insert into create1(ename, egender, emob,  email, epass) values(?,?,?,?,?)";
			Connection cc=DBConnection.connect();
			try{
				PreparedStatement ps=cc.prepareStatement(st);
				ps.setString(1, name);
				ps.setString(2, gender);
				ps.setString(3, mobile);
				ps.setString(4, mail);
				ps.setString(5, p1);
				ps.executeUpdate();
				JOptionPane.showMessageDialog(this, "Information Added");
				dispose();
				}
				catch(SQLException se){
					se.printStackTrace();
				}
			String st1="insert into login(ename, epassword) values(?,?)";
			Connection cc1=DBConnection.connect();
			try{
				PreparedStatement ps1=cc1.prepareStatement(st1);
				ps1.setString(1, name);
				ps1.setString(2, p1);
				ps1.executeUpdate();
			}
			catch(SQLException se1) {
				se1.printStackTrace();
			}
		}
	}
}