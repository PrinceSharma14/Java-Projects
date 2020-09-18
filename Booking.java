package mybuspak;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.StringTokenizer;
import java.sql.Date.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import com.toedter.calendar.JDateChooser;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;

import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Booking extends JDialog implements ActionListener {
	private JButton s,c1,c2;
	private JComboBox s1,d1;
	int id;
	private JDateChooser date;
	private JRadioButton ac,nac; 
	private JTextField bid,name; 
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblName;
	public Booking() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Booking.class.getResource("/mybuspak/image/5.jpg")));
		getContentPane().setLayout(null);

		JLabel lblAddBookingInformation = new JLabel("Add Booking Information");
		lblAddBookingInformation.setForeground(new Color(0, 0, 139));
		lblAddBookingInformation.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 20));
		lblAddBookingInformation.setBounds(177, 10, 242, 30);
		getContentPane().add(lblAddBookingInformation);

		JLabel lblSource = new JLabel("Source");
		lblSource.setForeground(new Color(0, 0, 205));
		lblSource.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSource.setBounds(60, 59, 57, 14);
		getContentPane().add(lblSource);

		s1 = new JComboBox();
		s1.setModel(new DefaultComboBoxModel(new String[] {"Mumbai", "Delhi", "Kolkata", "Jaipur", "Hyderbad", "Jabalpur", "Agra", "Varanasi", "Lucknow", "Kanpur", "Allahabad", "Ahmedabad", "Chandigarh", "Amritsar", "Aizawl", "Bhopal", "Bhubaneshwar", "Darjeeling", "Dehradun", "Faridabad", "Ghaziabad", "Noida", "Surat"}));
		s1.setBounds(127, 58, 84, 20);
		getContentPane().add(s1);

		d1 = new JComboBox();
		d1.setModel(new DefaultComboBoxModel(new String[] {"Mumbai", "Delhi", "Kolkata", "Jaipur", "Hyderbad", "Jabalpur", "Agra", "Varanasi", "Lucknow", "Kanpur", "Allahabad", "Ahmedabad", "Chandigarh", "Amritsar", "Aizawl", "Bhopal", "Bhubaneshwar", "Darjeeling", "Dehradun", "Faridabad", "Ghaziabad", "Noida", "Surat"}));
		d1.setBounds(372, 58, 84, 20);
		getContentPane().add(d1);

		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setForeground(new Color(0, 0, 205));
		lblDestination.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDestination.setBounds(283, 60, 79, 14);
		getContentPane().add(lblDestination);

		date = new JDateChooser();
		date.setBounds(127, 100, 131, 20);
		getContentPane().add(date);

		JLabel lblDate = new JLabel("Date");
		lblDate.setForeground(new Color(0, 0, 205));
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDate.setBounds(60, 106, 46, 14);
		getContentPane().add(lblDate);

		s = new JButton("Select your seat");
		s.setMnemonic('s');
		s.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		s.setBounds(307, 131, 171, 80);
		getContentPane().add(s);

		JLabel lblBusType = new JLabel("Bus Type");
		lblBusType.setForeground(new Color(0, 0, 205));
		lblBusType.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBusType.setBounds(60, 153, 65, 14);
		getContentPane().add(lblBusType);

		ac = new JRadioButton("A.C");
		buttonGroup.add(ac);
		ac.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		ac.setBounds(127, 150, 58, 23);
		getContentPane().add(ac);

		nac = new JRadioButton("Non A.C.");
		buttonGroup.add(nac);
		nac.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		nac.setBounds(202, 150, 84, 23);
		getContentPane().add(nac);

		c1 = new JButton("Confirm");
		c1.setMnemonic('y');
		c1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		c1.setBounds(111, 242, 89, 23);
		getContentPane().add(c1);

		c2 = new JButton("Cancel");
		c2.setMnemonic('n');
		c2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		c2.setBounds(341, 242, 89, 23);
		getContentPane().add(c2);

		lblName = new JLabel("Name\t");
		lblName.setForeground(new Color(0, 0, 205));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(60, 192, 46, 14);
		getContentPane().add(lblName);

		name = new JTextField();
		name.setToolTipText("");
		name.setBounds(134, 191, 152, 20);
		getContentPane().add(name);
		name.setColumns(10);

		JLabel lblBusid = new JLabel("BUS-ID");
		lblBusid.setBackground(Color.WHITE);
		lblBusid.setForeground(new Color(0, 0, 205));
		lblBusid.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBusid.setBounds(283, 100, 54, 14);
		getContentPane().add(lblBusid);

		bid = new JTextField();
		bid.setBounds(372, 100, 86, 20);
		getContentPane().add(bid);
		bid.setColumns(10);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Booking.class.getResource("/mybuspak/image/8.png")));
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(0, 0, 515, 290);
		getContentPane().add(label);
		setSize(531, 329);
		s1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				getBusID();
			}
		});
		d1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				getBusID();
			}
		});
		s.addActionListener(this);
		c1.addActionListener(this);
		c2.addActionListener(this);
		getID();
		setVisible(true);

	}

	public static void main(String[] args) {
		new Booking();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object ob=arg0.getSource();
		String source=s1.getSelectedItem().toString();	
		String destination=d1.getSelectedItem().toString();

		if(ob==c2) {
			dispose();
		}
		else if(ob==s)
		{
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			String pri=sdf.format(date.getDate());
			java.sql.Date dd=java.sql.Date.valueOf(pri);
			new Seat(source, destination,dd);
		}
		else if(ob==c1)
		{
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			String pri=sdf.format(date.getDate());
			java.sql.Date dd=java.sql.Date.valueOf(pri);
			String type1=null;
			if(ac.isSelected())
				type1="A.C.";
			else
				type1="Non A.C.";

			String naam=name.getText();
			String b1=bid.getText();
			
		
			
			String st="insert into booking(esource, edestination, edate, ebus, ename, eid, eseat, bid) values(?,?,?,?,?,?,?,?)";
			Connection cc=DBConnection.connect();
			try{
				PreparedStatement ps=cc.prepareStatement(st);
				ps.setString(1, source);
				ps.setString(2, destination);
				ps.setDate(3, dd);
				ps.setString(4, type1);
				ps.setString(5, naam);
				ps.setString(6, b1);
				ps.setString(7, Seat.seats);
				ps.setInt(8, id);
				ps.executeUpdate();
				JOptionPane.showMessageDialog(this, "Seat Confirmed");
				dispose();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
			new Selected();

		}
	}
	private void While(boolean hasMoreTokens) {
		// TODO Auto-generated method stub
		
	}

	void getID() {
		String st="select max(bid) from booking";
		Connection con=DBConnection.connect();
		try{
			PreparedStatement ps=con.prepareStatement(st);
			ResultSet rs=ps.executeQuery();
			rs.next();
			id=rs.getInt(1);
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		++id;

	}
	void getBusID() {
		String src=s1.getSelectedItem().toString();
		String des=d1.getSelectedItem().toString();
		String st="select eid from busid where esource=? and edestination=?";
		Connection con=DBConnection.connect();
		try{
			PreparedStatement ps=con.prepareStatement(st);
			ps.setString(1, src);
			ps.setString(2, des);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
//				rs.previous();
				String busid=rs.getString("eid");
				bid.setText(busid);
			}
			else {
				JOptionPane.showMessageDialog(this, "Source / Destination combination not found");
				return;
			}
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	}
}