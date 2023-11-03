package DefaultPackage;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JButton2_1 extends JFrame {
	JTextField jtf;
	public JButton2_1() {
		jtf = new JTextField(10);
		ImageIcon apple = new ImageIcon("image/apple.jpg");
		ImageIcon banana = new ImageIcon("image/banana.jpg");
		ImageIcon persimmom = new ImageIcon("image/persimmom.jpg");
		ImageIcon pear = new ImageIcon("image/pear.jpg");
		ImageIcon grape = new ImageIcon("image/grape.jpg");
		JButton jb1 = new JButton("사과", apple);
		JButton jb2 = new JButton("바나나", banana);
		JButton jb3 = new JButton("감", persimmom);
		JButton jb4 = new JButton("배", pear);
		JButton jb5 = new JButton("포도", grape);
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(3,2));
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(jb4);
		ct.add(jb5);
		ct.add(jtf);
		
		ListenerClass lc = new ListenerClass();
		
		jb1.addActionListener(lc);
		jb2.addActionListener(lc);
		jb3.addActionListener(lc);
		jb4.addActionListener(lc);
		jb5.addActionListener(lc);
		
		setTitle("JButton Test2_1");
		setSize(500,400);
		setVisible(true);
		
	}
	
	class ListenerClass implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			jtf.setText(e.getActionCommand());
			
		}
	}
	
	
}

public class JButtonTest2_1 {
	public static void main(String[] args) {
		new JButton2_1();
	}
}
