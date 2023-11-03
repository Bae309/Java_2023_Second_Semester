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
class ListenerClass2_1 implements ActionListener {
	JButton jb; // JButton 객체 선언
	JTextArea jta; // JTextArea 객체 선언
	JTextField jtf; // JTextField 객체 선언
	
	// 생성자를 통해 JButton, JTextArea, JTextField 객체 공유
	public ListenerClass2_1(JButton jb, JTextArea jta,JTextField jtf) {
		this.jb = jb;
		this.jta = jta;
		this.jtf = jtf;
	}
	@Override
	public void actionPerformed(ActionEvent ae) { // 이벤트 처리 메소드를 오버라이드하여 작성
		try {
			// 파일 이름으로 입력 객체 생성
			String s = jtf.getText(); //JTextField로부터 텍스트 읽어오기
			
			FileInputStream fis = new FileInputStream(s); // 파일에서 데이터를 바이트 스트림으로 읽기 
			DataInputStream dis = new DataInputStream(fis); // 바이트 스트림으로부터 기본 데이터형 데이터를 읽는 기능
			
			jta.setText(dis.readUTF()); //DataInputStream을 통해 파일에서 인코딩된 문자열 읽어오기 
			
			fis.close(); // fis 닫기
			System.out.println(s + " 파일을 읽어왔습니다.");
		}
		catch (Exception e) {
			System.out.println("파일을 불러올 수 없습니다!");
		}
	}
}
class GUI2_1 extends JFrame{
	public JTextArea jta; // JTextArea 객체 선언
	public JTextField jtf; // JTextField 객체 선언
	
	public GUI2_1() {
		JButton jb = new JButton("파일 불러오기");
		
		// 한 줄 텍스트 객체 생성 - 파일명 입력
		jtf = new JTextField("파일 이름을 입력하시오", 20);
		
		// 여러줄 텍스트 객체 생성 - 파일로부터 자료 읽어오기
		jta = new JTextArea("파일 내용을 입력하시오", 10,20);
		
		jta.setEditable(false); // JTextArea를 편집할 수 없도록 설정
		
		Container ct = getContentPane(); // 컨테이너 생성
		ct.setLayout(new FlowLayout()); // FlowLayout 배치 관리자 설정
		JPanel pl = new JPanel(); // 판넬 생성
		pl.add(jtf); // 판넬에 jtf(JTextField) 추가
		
		pl.add(jb); // 판넬에 jb(JButton) 추가
		
		ct.add(pl); // 컨테이너에 jta(JTextArea) 추가
		
		ct.add(jta); // 컨테이너에 pl(판넬) 추가
		
		
		// 이벤트 받아들일 버튼에 리스너 등록
		ListenerClass2_1 lc2 = new ListenerClass2_1(jb, jta, jtf);
		jb.addActionListener(lc2);

		
		setTitle("GUI Test2"); // 제목 설정
		setSize(500,300); // 크기 설정
		setVisible(true); // 사용자가 볼수 있도록 설정
	}

	
	
}
public class GUITest2_1 {

	public static void main(String[] args) {
		new GUI2_1(); //GUI2_1 클래스 호출
	}

}
