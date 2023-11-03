package DefaultPackage;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//GUI 클래스 - 이벤트 포함
class JLabel2 extends JFrame {
	private JLabel result = new JLabel();
	public ImageIcon img1, img2;
	
	public JLabel2() {
		// 이미지 생성
		img1 = new ImageIcon("image\\apple.jpg");
		img2 = new ImageIcon("image/pear.jpg");
		
		// 버튼 생성
		JButton apple = new JButton("사과");
		JButton pear = new JButton("배");
		
		// 컨테이너 생성
		Container ct = getContentPane();
		
		// 배치 관리자 설정 - FlowLayout()
		ct.setLayout(new FlowLayout());
		
		// 컨테이너에 버튼과 라벨 추가
		ct.add(apple);
		ct.add(pear);
		ct.add(result);
		
		apple.addActionListener(new ListenerClass()); // 내부클래스로부터 ActionListener 항목 추가
		pear.addActionListener(new ListenerClass());
		
		// 화면에 보여주기
		setTitle("이벤트 테스트4"); // 제목 설정
		setSize(300,200); // 크기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame 객체 종료 선언
		setVisible(true); // 사용자가 볼수 있도록 설정
	}
	
	// 내부 클래스 생성
	public class ListenerClass implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) { // 이벤트 처리 메소드를 오버라이드하여 작성
			
			if(e.getActionCommand() == "사과") { // 사과를 누르면......
				result.setIcon(img1); // 사과 이미지 출력
				result.setText("맛있는 사과입니다."); // 텍스트에 "맛있는 사과입니다." 출력
			}
			
			if(e.getActionCommand() == "배") { // 배를 누르면 ... 
				result.setIcon(img2); // 배 이미지 출력
				result.setText("좋아하는 배입니다."); // 텍스트에 "좋아하는 배입니다." 출력
			}
			
		}
		
	}
	
}


//메인 클래스

public class JLabelTest2 {
	public static void main(String[] args) {
		new JLabel2(); // JLabel2 클래스 호출
	}
}
