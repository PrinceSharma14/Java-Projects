package mybuspak;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import mybuspak.DBConnection;

public class Seat extends JDialog implements ActionListener{
	static String seats="";
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,s1,c;
	ArrayList<String> arr=new ArrayList<String>();
	String source, destination;
	java.sql.Date ddd;
	public Seat(String source, String destination, java.sql.Date ddd) {
		this.source=source;
		this.destination=destination;
		this.ddd=ddd;
		getContentPane().setBackground(new Color(240, 240, 240));
		setSize(714, 400);
		getContentPane().setLayout(null);

		b16 = new JButton("16");
		b16.setBounds(130, 11, 70, 57);
		getContentPane().add(b16);

		b15 = new JButton("15");
		b15.setBounds(130, 79, 70, 57);
		getContentPane().add(b15);

		b18 = new JButton("18");
		b18.setBounds(209, 11, 70, 57);
		getContentPane().add(b18);

		b17 = new JButton("17");
		b17.setBounds(210, 79, 70, 57);
		getContentPane().add(b17);

		b20 = new JButton("20");
		b20.setBounds(289, 11, 70, 57);
		getContentPane().add(b20);

		b19 = new JButton("19");
		b19.setBounds(289, 79, 70, 57);
		getContentPane().add(b19);

		b22 = new JButton("22");
		b22.setBounds(369, 11, 70, 57);
		getContentPane().add(b22);

		b24 = new JButton("24");
		b24.setBounds(449, 11, 70, 57);
		getContentPane().add(b24);

		b26 = new JButton("26");
		b26.setBounds(529, 11, 70, 57);
		getContentPane().add(b26);

		b28 = new JButton("28");
		b28.setBounds(609, 11, 70, 57);
		getContentPane().add(b28);

		b21 = new JButton("21");
		b21.setBounds(369, 79, 70, 57);
		getContentPane().add(b21);

		b23 = new JButton("23");
		b23.setBounds(449, 79, 70, 57);
		getContentPane().add(b23);

		b25 = new JButton("25");
		b25.setBounds(529, 79, 70, 57);
		getContentPane().add(b25);

		b27 = new JButton("27");
		b27.setBounds(610, 79, 70, 57);
		getContentPane().add(b27);

		b13 = new JButton("13");
		b13.setBounds(610, 282, 70, 57);
		getContentPane().add(b13);

		b2 = new JButton("2");
		b2.setBounds(130, 214, 70, 57);
		getContentPane().add(b2);

		b1 = new JButton("1");
		b1.setBounds(130, 282, 70, 57);
		getContentPane().add(b1);

		b3 = new JButton("3");
		b3.setBounds(210, 282, 70, 57);
		getContentPane().add(b3);

		b4 = new JButton("4\r\n");
		b4.setBounds(209, 214, 70, 57);
		getContentPane().add(b4);

		b6 = new JButton("6");
		b6.setBounds(289, 214, 70, 57);
		getContentPane().add(b6);

		b5 = new JButton("5");
		b5.setBounds(289, 282, 70, 57);
		getContentPane().add(b5);

		b8 = new JButton("8");
		b8.setBounds(369, 214, 70, 57);
		getContentPane().add(b8);

		b7 = new JButton("7");
		b7.setBounds(369, 282, 70, 57);
		getContentPane().add(b7);

		b9 = new JButton("9");
		b9.setBounds(449, 282, 70, 57);
		getContentPane().add(b9);

		b10 = new JButton("10");
		b10.setBounds(449, 214, 70, 57);
		getContentPane().add(b10);

		b12 = new JButton("12");
		b12.setBounds(529, 214, 70, 57);
		getContentPane().add(b12);

		b11 = new JButton("11");
		b11.setBounds(529, 282, 70, 57);
		getContentPane().add(b11);

		b14 = new JButton("14");
		b14.setBounds(609, 214, 70, 57);
		getContentPane().add(b14);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Seat.class.getResource("/mybuspak/image/driv.jpg")));
		label.setBounds(10, 11, 110, 121);
		getContentPane().add(label);

		s1 = new JButton("Confirm");
		s1.setMnemonic('s');
		s1.setBounds(10, 256, 89, 23);
		getContentPane().add(s1);

		c = new JButton("Cancel");
		c.setMnemonic('c');
		c.setBounds(10, 299, 89, 23);
		getContentPane().add(c);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Seat.class.getResource("/mybuspak/image/rolli_bus_1.png")));
		label_1.setBounds(0, 0, 698, 361);
		getContentPane().add(label_1);
		s1.addActionListener(this);
		c.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		b24.addActionListener(this);
		b25.addActionListener(this);
		b26.addActionListener(this);
		b27.addActionListener(this);
		b28.addActionListener(this);
//		b14.addActionListener(this);
		checkSeats();
		setVisible(true);

	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object ob=arg0.getSource();
		if(ob==c) {
			dispose();
		}
		else if(ob==b1){

			if(b1.getBackground().equals(Color.GREEN)) {
				b1.setBackground(null);
				//				seats.replaceAll("1", "");
				arr.remove("1");
			}
			else{
				b1.setBackground(Color.green);
				seats+=" 1";
				arr.add("1");
			}
		}
		else if(ob==b2){
			if(b2.getBackground().equals(Color.GREEN))
			{
				b2.setBackground(null);
				arr.remove("2");

			}
			else
			{
				b2.setBackground(Color.green);
				arr.add("2");
				seats+=" 2";
			}
		}
		else if(ob==b3){
			if(b3.getBackground().equals(Color.GREEN))
			{
				arr.remove("3");
				b3.setBackground(null);

			}
			else{
				b3.setBackground(Color.green);
				arr.add("3");
				seats+=" 3";
			}
		}
		else if(ob==b4){
			if(b4.getBackground().equals(Color.GREEN)){
				b4.setBackground(null);
				arr.remove("4");
			}
			else{
				b4.setBackground(Color.green);
				arr.add("4");
				seats+=" 4";
			}
		}
		else if(ob==b5){
			if(b5.getBackground().equals(Color.GREEN)){
				b5.setBackground(null);
				arr.remove("5");
			}
			else{
				b5.setBackground(Color.green);
				arr.add("5");
				seats+=" 5";
			}
		}
		else if(ob==b6){
			if(b6.getBackground().equals(Color.GREEN)){
				b6.setBackground(null);
				arr.remove("6");
			}
			else{
				b6.setBackground(Color.green);
				arr.add("6");
				seats+=" 6";
			}

		}
		else if(ob==b7){
			if(b7.getBackground().equals(Color.GREEN)){
				b7.setBackground(null);
				arr.remove("7");
			}
			else{
				b7.setBackground(Color.green);
				arr.add("7");
				seats+=" 7";
			}
		}
		else if(ob==b8){
			if(b8.getBackground().equals(Color.GREEN)){
				b8.setBackground(null);
				arr.remove("8");
			}
			else{
				b8.setBackground(Color.green);
				arr.add("8");
				seats+=" 8";
			}
		}
		else if(ob==b9){
			if(b9.getBackground().equals(Color.GREEN)){
				b9.setBackground(null);
				arr.remove("9");
			}
			else{
				b9.setBackground(Color.green);
				arr.add("9");
				seats+=" 9";
			}
		}
		else if(ob==b10){
			if(b10.getBackground().equals(Color.GREEN)){
				b10.setBackground(null);
				arr.remove("10");
			}
			else{
				b10.setBackground(Color.green);
				arr.add("10");
				seats+=" 10";
			}
		}
		else if(ob==b11){
			if(b1.getBackground().equals(Color.GREEN)){
				b1.setBackground(null);
				arr.remove("11");
			}
			else{
				b11.setBackground(Color.green);
				arr.add("11");
				seats+=" 11";
			}
		}
		else if(ob==b12){
			if(b12.getBackground().equals(Color.GREEN)){
				b12.setBackground(null);
				arr.remove("12");
			}
			else{
				b12.setBackground(Color.green);
				arr.add("12");
				seats+=" 12";
			}
		}
		else if(ob==b13){
			if(b13.getBackground().equals(Color.GREEN)){
				b13.setBackground(null);
				arr.remove("13");
			}
			else{
				b13.setBackground(Color.green);
				arr.add("13");
				seats+=" 13";
			}
		}
		else if(ob==b14){
			if(b14.getBackground().equals(Color.GREEN)){
				b14.setBackground(null);
				arr.remove("14");
			}
			else{
				b14.setBackground(Color.green);
				arr.add("14");
				seats+=" 14";
			}
		}
		else if(ob==b15){
			if(b1.getBackground().equals(Color.GREEN)){
				b1.setBackground(null);
				arr.remove("15");
			}
			else{
				b15.setBackground(Color.green);
				arr.add("15");
				seats+=" 15";
			}
		}
		else if(ob==b16){
			if(b16.getBackground().equals(Color.GREEN)){
				b16.setBackground(null);
				arr.remove("16");
			}
			else{
				b16.setBackground(Color.green);
				arr.add("16");
				seats+=" 16";
			}
		}
		else if(ob==b17){
			if(b17.getBackground().equals(Color.GREEN)){
				b17.setBackground(null);
				arr.remove("17");
			}
			else{
				b17.setBackground(Color.green);
				arr.add("17");
				seats+=" 17";
			}
		}
		else if(ob==b18){
			if(b18.getBackground().equals(Color.GREEN)){
				b18.setBackground(null);
				arr.remove("18");
			}
			else{
				b18.setBackground(Color.green);
				arr.add("18");
				seats+=" 18";
			}
		}
		else if(ob==b19){
			if(b19.getBackground().equals(Color.GREEN)){
				b19.setBackground(null);
				arr.remove("19");
			}
			else{
				b19.setBackground(Color.green);
				arr.add("19");
				seats+=" 19";
			}
		}
		else if(ob==b20){
			if(b20.getBackground().equals(Color.GREEN)){
				b20.setBackground(null);
				arr.remove("20");
			}
			else{
				b20.setBackground(Color.green);
				arr.add("20");
				seats+=" 20";
			}
		}
		else if(ob==b21){
			if(b21.getBackground().equals(Color.GREEN)){
				b21.setBackground(null);
				arr.remove("21");
			}
			else{
				b21.setBackground(Color.green);
				arr.add("21");
				seats+=" 21";
			}
		}
		else if(ob==b22){
			if(b22.getBackground().equals(Color.GREEN)){
				b22.setBackground(null);
				arr.remove("22");
			}
			else{
				b22.setBackground(Color.green);
				arr.add("22");
				seats+=" 22";
			}
		}
		else if(ob==b23){
			if(b23.getBackground().equals(Color.GREEN)){
				b23.setBackground(null);
				arr.remove("23");
			}
			else{
				b23.setBackground(Color.green);
				arr.add("23");
				seats+=" 23";
			}
		}
		else if(ob==b24){
			if(b24.getBackground().equals(Color.GREEN)){
				b24.setBackground(null);
				arr.remove("24");
			}
			else{
				b24.setBackground(Color.green);
				arr.add("24");
				seats+=" 24";
			}
		}
		else if(ob==b25){
			if(b25.getBackground().equals(Color.GREEN)){
				b25.setBackground(null);
				arr.remove("25");
			}
			else{
				b25.setBackground(Color.green);
				arr.add("25");
				seats+=" 25";
			}
		}
		else if(ob==b26){
			if(b26.getBackground().equals(Color.GREEN)){
				b26.setBackground(null);
				arr.remove("26");
			}
			else{
				b26.setBackground(Color.green);
				arr.add("26");
				seats+=" 26";
			}
		}
		else if(ob==b27){
			if(b27.getBackground().equals(Color.GREEN)){
				b27.setBackground(null);
				arr.remove("27");
			}
			else{
				b27.setBackground(Color.green);
				arr.add("27");
				seats+=" 27";
			}
		}
		else if(ob==b28){
			if(b28.getBackground().equals(Color.GREEN)){
				b28.setBackground(null);
				arr.remove("28");
			}
			else{
				b28.setBackground(Color.green);
				arr.add("28");
				seats+=" 28";
			}
		}
		else if(ob==s1)
		{
			
			seats="";
			System.out.println("Seats Selected="+arr);
			Iterator<String>it=arr.iterator();
			while(it.hasNext()) {
				seats=seats+","+it.next().trim();
			}
			seats=seats.substring(1);
			
			int p=arr.size();
			
			dispose();
		}

	}
	void checkSeats() {
		int found=0;
		String st="select eseat from booking where edate=? and esource=? and edestination=?";
		Connection cn=DBConnection.connect();
		String ss=null;
		try {
			PreparedStatement ps1=cn.prepareStatement(st);
			ps1.setDate(1, ddd);
			ps1.setString(2, source);
			ps1.setString(3, destination);
			ResultSet rs1=ps1.executeQuery();
			while(rs1.next()) {
				ss=rs1.getString("eseat");
				++found;
			}
			if(found==0)
				return;
			System.out.println(ss);
			StringTokenizer sp=new StringTokenizer(ss,",");
			while(sp.hasMoreTokens())
			{
				String g=sp.nextToken();
				switch(g) {
					case "1":
						b1.setBackground(Color.RED);
						b1.setEnabled(false);
						break;
					case "2":
						b2.setBackground(Color.RED);
						b2.setEnabled(false);
						break;
					case "3":
						b3.setBackground(Color.RED);
						b3.setEnabled(false);
						break;
					case "4":
						b4.setBackground(Color.RED);
						b4.setEnabled(false);
						break;
					case "5":
						b5.setBackground(Color.RED);
						b5.setEnabled(false);
						break;
					case "6":
						b6.setBackground(Color.RED);
						b6.setEnabled(false);
						break;
					case "7":
						b7.setBackground(Color.RED);
						b7.setEnabled(false);
						break;
					case "8":
						b8.setBackground(Color.RED);
						b8.setEnabled(false);
						break;
					case "9":
						b6.setBackground(Color.RED);
						b6.setEnabled(false);
						break;
					case "10":
						b10.setBackground(Color.RED);
						b10.setEnabled(false);
						break;
					case "11":
						b11.setBackground(Color.RED);
						b11.setEnabled(false);
						break;
					case "12":
						b12.setBackground(Color.RED);
						b12.setEnabled(false);
						break;
					case "13":
						b13.setBackground(Color.RED);
						b13.setEnabled(false);
						break;
					case "14":
						b14.setBackground(Color.RED);
						b14.setEnabled(false);
						break;
					case "15":
						b15.setBackground(Color.RED);
						b15.setEnabled(false);
						break;
					case "16":
						b16.setBackground(Color.RED);
						b16.setEnabled(false);
						break;
					case "17":
						b17.setBackground(Color.RED);
						b17.setEnabled(false);
						break;
					case "18":
						b18.setBackground(Color.RED);
						b18.setEnabled(false);
						break;
					case "19":
						b19.setBackground(Color.RED);
						b19.setEnabled(false);
						break;
					case "20":
						b20.setBackground(Color.RED);
						b20.setEnabled(false);
						break;
					case "21":
						b21.setBackground(Color.RED);
						b21.setEnabled(false);
						break;
					case "22":
						b22.setBackground(Color.RED);
						b22.setEnabled(false);
						break;
					case "23":
						b23.setBackground(Color.RED);
						b23.setEnabled(false);
						break;
					case "24":
						b24.setBackground(Color.RED);
						b24.setEnabled(false);
						break;
					case "25":
						b25.setBackground(Color.RED);
						b25.setEnabled(false);
						break;
					case "26":
						b26.setBackground(Color.RED);
						b26.setEnabled(false);
						break;
					case "27":
						b27.setBackground(Color.RED);
						b27.setEnabled(false);
						break;
					case "28":
						b28.setBackground(Color.RED);
						b28.setEnabled(false);
						break;
					
				}
			}

		}
		catch (SQLException e) {
			e.printStackTrace();
		}

	}
}