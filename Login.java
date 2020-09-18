package mybuspak;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;

import mybuspak.DBConnection;

public class Login extends JDialog implements ActionListener{
	private JTextField tf;
	private JButton l;
	private JButton r;
	private JButton cna;
	private JPasswordField pss;

	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/mybuspak/image/5.jpg")));
		setTitle("Login page");
		getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblUsername.setBounds(33, 70, 85, 28);
		getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblPassword.setBounds(33, 109, 85, 28);
		getContentPane().add(lblPassword);
		
		tf = new JTextField();
		tf.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		tf.setBounds(116, 74, 179, 20);
		getContentPane().add(tf);
		tf.setColumns(10);
		
		pss = new JPasswordField();
		pss.setBounds(116, 109, 179, 20);
		getContentPane().add(pss);
		
		JLabel lblUserLogin = new JLabel("User Login");
		lblUserLogin.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblUserLogin.setBounds(142, 31, 116, 28);
		getContentPane().add(lblUserLogin);
		
		l = new JButton("Login");
		l.setMnemonic('l');
		l.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		l.setBounds(126, 145, 73, 23);
		getContentPane().add(l);
		
		r = new JButton("Reset");
		r.setMnemonic('r');
		r.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		r.setBounds(209, 145, 73, 23);
		getContentPane().add(r);
		
		cna = new JButton("Create New Account\r\n");
		cna.setMnemonic('c');
		cna.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		cna.setBounds(116, 180, 179, 28);
		getContentPane().add(cna);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("/mybuspak/image/2.jpg")));
		label.setBounds(0, 0, 380, 235);
		getContentPane().add(label);
		setVisible(true);
		setSize(396, 274);
		l.addActionListener(this);
		r.addActionListener(this);
		cna.addActionListener(this);
		
	}
	public static void main(String ar[]) {
		new Login();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object ob=arg0.getSource();
		if(ob==l)
		{
			String user=tf.getText();
			String pass=new String(pss.getPassword());
			
			String st="select * from login where ename=? and epassword=?";
			Connection cn=DBConnection.connect();

			try {
				PreparedStatement ps=cn.prepareStatement(st);
				ps.setString(1, user);
				ps.setString(2, pass);
				ResultSet rs=ps.executeQuery();
				if(rs.next()){
					new MenuBar();
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(this, "Incorrect username or password");
					tf.setText("");
					pss.setText("");
					tf.requestFocusInWindow();
				}
			}
			catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		else if(ob==r) 
		{
			tf.setText("");
			pss.setText("");
			tf.requestFocusInWindow();
		}
		else if(ob==cna){
			new CreateAccount();
		}
		else {
			JOptionPane.showMessageDialog(this, "Invalid");
			tf.setText("");
			pss.setText("");
			tf.requestFocusInWindow();
		}
	}
}
