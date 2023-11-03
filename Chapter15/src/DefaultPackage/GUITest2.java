package DefaultPackage;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUI2 extends JFrame implements ActionListener{
	// 속성으로 텍스트에어리어와 텍스트 필드를 선언 - 예외처리를 하기 위해서 속성으로 일부러 지정
	private JTextArea jta; 
	private JTextField jtf;
	
	public GUI2() {
		JButton jb = new JButton("파일 불러오기");
		
		jtf = new JTextField("파일 이름을 입력하시오", 20);
		
		jta = new JTextArea("파일 내용을 입력하시오", 10,20);
		
		jta.setEditable(false);
		
		Container ct = getContentPane(); // 컨테이너 생성
		ct.setLayout(new FlowLayout()); // FlowLayout 배치 관리자 설정
		JPanel pl = new JPanel(); // 판넬 생성
		pl.add(jtf);
		
		pl.add(jb);
		
		ct.add(pl);
		
		ct.add(jta);
		
		jb.addActionListener(this);
		setTitle("GUI Test2");
		setSize(500,300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			// 파일 이름으로 입력 객체 생성
			String s = jtf.getText();
			
			FileInputStream fis = new FileInputStream(s);
			DataInputStream dis = new DataInputStream(fis);
			
			jta.setText(dis.readUTF());
			
			fis.close();
			System.out.println(s + " 파일을 읽어왔습니다.");
		}
		catch (Exception e) {
			System.out.println("파일을 불러올 수 없습니다!");
		}
	}
	
}
public class GUITest2 {
	public static void main(String[] args) {
		new GUI2();
	}
}
