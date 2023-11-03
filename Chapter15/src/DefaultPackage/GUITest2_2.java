package DefaultPackage;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUI2_2 extends JFrame {
	// 속성으로 텍스트에어리어와 텍스트 필드를 선언 - 예외처리를 하기 위해서 속성으로 일부러 지정
	private JTextArea jta; 
	private JTextField jtf;
	
	public GUI2_2() {
		JButton jb = new JButton("파일 불러오기");
		
		jtf = new JTextField("파일 이름을 입력하시오", 20);
		
		jta = new JTextArea("파일 내용을 입력하시오", 10,20);
		
		jta.setEditable(false);
		
		Container ct = getContentPane(); // 컨테이너 생성
		ct.setLayout(new FlowLayout()); // FlowLayout 배치 관리자 설정
		JPanel pl = new JPanel(); // 판넬 생성
		pl.add(jtf); // 판넬에 텍스트 필드 추가
		
		pl.add(jb); // 판넬에 버튼 추가
		
		ct.add(pl); // 컨테이너에 판넬 추가
		
		ct.add(jta); // 컨테이너에 텍스트 에어리어 추가
		
		ListenerClass lc = new ListenerClass(); // LiztenerClass 호출
		jb.addActionListener(lc); // JButton을 ActionListener에 등록
		
		setTitle("GUI Test2_2");
		setSize(500,300);
		setVisible(true);
	}
	
	class ListenerClass implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent ae) {
			try {
				// 파일 이름으로 입력 객체 생성
				String s = jtf.getText();
			
				FileInputStream fis = new FileInputStream(s); // 파일 객체 생성
				DataInputStream dis = new DataInputStream(fis); // 
			
				jta.setText(dis.readUTF());
			
				fis.close();
				System.out.println(s + " 파일을 읽어왔습니다.");
			}
			catch (Exception e) {
				System.out.println("파일을 불러올 수 없습니다!");
			}
		}
	}
}

public class GUITest2_2 {
	public static void main(String[] args) {
		new GUI2_2();
	}
}
