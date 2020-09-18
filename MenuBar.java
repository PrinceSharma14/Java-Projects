package mybuspak;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Dimension;

public class MenuBar extends JFrame implements ActionListener
{
	private JMenuItem update;
	private JMenuItem add;
	private JTextArea textArea;
	private JMenuItem exit;
	private JLabel label;

	public MenuBar() {
		setTitle("Bus");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuBar.class.getResource("/mybuspak/image/5.jpg")));

		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnEmployee = new JMenu("Bus");
		menuBar.add(mnEmployee);
		
		add = new JMenuItem("Book ticket");
		add.setIcon(new ImageIcon(MenuBar.class.getResource("/mybuspak/image/add_correction.gif")));
		add.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));

		mnEmployee.add(add);
		
		update = new JMenuItem("Update");
		update.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_MASK));

		mnEmployee.add(update);
		
		JMenu mnOptions = new JMenu("Exit");
		menuBar.add(mnOptions);
		
		exit = new JMenuItem("Exit");
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		exit.setIcon(new ImageIcon(MenuBar.class.getResource("/mybuspak/image/slice.gif")));
		mnOptions.add(exit);
		
		add.addActionListener(this);
		update.addActionListener(this);
		exit.addActionListener(this);
		setSize(new Dimension(1354, 645));
		getContentPane().setLayout(null);
		textArea = new JTextArea();
		getContentPane().add(textArea, BorderLayout.NORTH);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(MenuBar.class.getResource("/mybuspak/image/1st.jpg")));
		label.setBounds(0, 0, 1338, 585);
		getContentPane().add(label);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MenuBar();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object ob=arg0.getSource();
		if(ob==add) {
			new Booking();
		}
		else if(ob==update){new Login();
		}
		
		
		else if(ob==exit){
			int yn=JOptionPane.showConfirmDialog(this,"Sure to Exit");
			if(yn==0)
				System.exit(0);
		}
	}
}
	