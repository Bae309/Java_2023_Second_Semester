package DefaultPackage;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

class JMenu1 extends JFrame implements ActionListener{
	JTextField jtf;  // 선택한 메뉴 출력
	
	public JMenu1() {
		// 컨테이너 생성
		Container ct = getContentPane();
		
		// 레이아웃 생성
		ct.setLayout(new BorderLayout());
		
		// 1. JMenuBar() 객체 생성
		JMenuBar jmb = new JMenuBar();
		
		// 2. JMenu 객체 생성
		JMenu menu1 = new JMenu("파일");
		JMenu menu2 = new JMenu("편집");
		
		// 3. 서브 메뉴 JMenuItem 객체 생성
		JMenuItem jmi1 = new JMenuItem("새파일");
		jmi1.addActionListener(this);
		menu1.add(jmi1);
		
		jmi1 = new JMenuItem("저장하기");
		jmi1.addActionListener(this);
		menu1.add(jmi1);
		
		JMenuItem jmi2 = new JMenuItem("열기");
		jmi2.addActionListener(this);
		menu2.add(jmi2);
		
		jmi2 = new JMenuItem("잘라내기");
		jmi2.addActionListener(this);
		menu2.add(jmi2);
		
		jmi2 = new JMenuItem("복사");
		jmi2.addActionListener(this);
		menu2.add(jmi2);
		
		// 3. 서브 메뉴 JcheckBoxMenuItem() 객체 생성
		JCheckBox jcb = new JCheckBox("눈금자");
		jcb.addActionListener(this);
		menu2.add(jcb);
		
		// 3. 서브 메뉴 JRadioButtonMenuItem() 객체 생성
		JRadioButtonMenuItem jbmi = new JRadioButtonMenuItem("수정가능상태");
		jbmi.addActionListener(this);
		menu2.add(jbmi);
		
		// 5. menu1, menu2를 jmb(JMenuBar)에 추가
		jmb.add(menu1);
		jmb.add(menu2);
		
		// 6. setJMenuBar() 메서드를 이용하여 메뉴바를 프레임에 추가
		setJMenuBar(jmb);
		
		jtf = new JTextField();
		ct.add(jtf, BorderLayout.SOUTH); // textfield 위치 설정
		
		// 화면에 출력
		setTitle("JMenuTest1");
		setSize(300,200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jtf.setText(e.getActionCommand());
		
	}
	
}

public class JMenuTest1 {
	public static void main(String[] args) {
		new JMenu1();
	}
}
