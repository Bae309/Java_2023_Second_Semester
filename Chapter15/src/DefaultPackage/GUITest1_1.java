package DefaultPackage;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// ActionListener을 함유한 독립된 클래스를 생성
class ListenerClass2 implements ActionListener {
	JButton jb; // JButton 객체 선언
	JTextArea jta; // JTextArea 객체 선언
	JTextField jtf; // JTextField 객체 선언
	
	// 생성자를 통해 JButton, JTextArea, JTextField 객체 공유
	public ListenerClass2(JButton jb,JTextArea jta,JTextField jtf) {
		this.jb = jb;
		this.jta = jta;
		this.jtf = jtf;
	}

	@Override
	public void actionPerformed(ActionEvent ae) { // 이벤트 처리 메소드를 오버라이드하여 작성
		try {
			// 입출력을 위한 예외처리
			// 파일 이름으로 출력 객체 생성
			String s = jtf.getText(); // JTextField로부터 텍스트 읽어오기
			FileOutputStream fos = new FileOutputStream(s); // 파일에 바이트 스트림 출력하기
			DataOutputStream dos = new DataOutputStream(fos); // 기본 데이터형 자료를 바이트 스트림으로 출력
			
			dos.writeUTF(jta.getText()); //DataOutputStream 객체를 통해 파일에 작성
			
			fos.close(); // fos 닫기
			System.out.println(s + "파일이 생성되었습니다.");
		}
		catch (Exception e) {
			
		}
	}
}

class GUI1_1 extends JFrame {
	// 속성으로 텍스트에어리어와 텍스트 필드를 선언 - 예외처리를 하기 위해서 속성으로 일부러 지정
	public JTextArea jta; // JtextArea 객체 선언. 다른 클래스에서 객체에 접근할 수 있도록 public 선언
	public JTextField jtf; // JTextField 객체 선언. 다른 클래스에서 객체에 접근할 수 있도록 public 선언
	
	public GUI1_1() { // 생성자
		// 버튼 객체 생성
		JButton jb = new JButton("파일로 저장");
		
		// 한 줄 텍스트 객체 생성 - 파일 저장명 입력
		// JTextField jtf = new JTextField("파일 이름을 입력하시오", 20);
		jtf = new JTextField("파일 이름을 입력하시오", 20);
		
		// 여러줄 텍스트 객체 생성 - 파일 내용 입력
		// JTextArea jta = new JTextArea("파일 내용을 입력하시오", 10,20);
		jta = new JTextArea("파일 내용을 입력하시오", 10,20);
		Container ct = getContentPane(); // 컨테이너 생성
		ct.setLayout(new FlowLayout()); // FlowLayout 배치 관리자 설정
		JPanel pl = new JPanel(); // 판넬 생성
		pl.add(jtf); // 판넬에 jtf(JTextField) 추가
		
		pl.add(jb); // 판넬에 jb(JButton) 추가
		
		ct.add(jta); // 컨테이너에 jta(JTextArea) 추가
		
		ct.add(pl); // 컨테이너에 pl(판넬) 추가
		
		// 이벤트 받아들일 버튼에 리스너 등록
		ListenerClass2 lc = new ListenerClass2(jb, jta, jtf);
		jb.addActionListener(lc);
		
		setTitle("GUI Test1_1"); // 제목 설정
		setSize(500,300); // 크기 설정
		setVisible(true); // 사용자가 볼 수 있도록 설정
		
	}
	
}

public class GUITest1_1 {

	public static void main(String[] args) {
		new GUI1_1(); //GUI1_1 호출
	}

}
