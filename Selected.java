package mybuspak;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class Selected extends JDialog implements ActionListener {

	public Selected() {

		setTitle("Confirmed");
		setSize(548, 293);
		getContentPane().setLayout(null);
		
		JLabel lblSeatIs = new JLabel("Hey...You have successfully booked your seat.");
		lblSeatIs.setForeground(new Color(0, 0, 102));
		lblSeatIs.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 23));
		lblSeatIs.setBounds(29, 11, 478, 33);
		getContentPane().add(lblSeatIs);
		
		JLabel lblSelected = new JLabel("We wish you very happy and safe journey...");
		lblSelected.setForeground(new Color(0, 0, 102));
		lblSelected.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 23));
		lblSelected.setBounds(39, 55, 441, 33);
		getContentPane().add(lblSelected);
		
		JLabel lblThankYou = new JLabel("Thank you\t");
		lblThankYou.setForeground(new Color(0, 0, 51));
		lblThankYou.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 23));
		lblThankYou.setBounds(323, 133, 122, 33);
		getContentPane().add(lblThankYou);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Selected.class.getResource("/mybuspak/image/final page2.jpg")));
		label.setBounds(0, 0, 532, 254);
		getContentPane().add(label);
		setVisible(true);
	}
	 
	public static void main(String[] args){
		new Selected();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
}
