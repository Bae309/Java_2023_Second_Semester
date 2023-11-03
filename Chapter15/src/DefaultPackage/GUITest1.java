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

// 1. 처리할 이벤트 결정. - 버튼
// 2. 이벤트에 적합한 리스너 인터페이스를 사용하여 클래스 작성
class GUI1 extends JFrame implements ActionListener {
	// 속성으로 텍스트에어리어와 텍스트 필드를 선언 - 예외처리를 하기 위해서 속성으로 일부러 지정
	private JTextArea jta; 
	private JTextField jtf;
	
	public GUI1() { // 생성자
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
		
		//3. 이벤트 받아들일 버튼에 리스너 등록
		jb.addActionListener(this);
		
		setTitle("GUI Test1"); // 제목 설정
		setSize(500,300); // 크기 설정
		setVisible(true); // 사용자가 볼 수 있도록 설정
		
	}
	
	// 4. 리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성
	@Override
	public void actionPerformed(ActionEvent ae) {
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
public class GUITest1 {
	public static void main(String[] args) {
		new GUI1();
	}
}
