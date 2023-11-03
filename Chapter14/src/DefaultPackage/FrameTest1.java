package DefaultPackage;
/*
 * 작성자 : 202095041 컴퓨터공학부 배성윤
 * 작성일 : 2023.10.06
 */

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class FirstFrame1 {
	//생성자
	public FirstFrame1() {
		// 프레임 객체를 생성
		JFrame jf = new JFrame("첫번째 GUI 프로그램"); 
		
		// 프레임으로부터 컨테이너(쟁반) 생성
		Container ct = jf.getContentPane();
		
		// 버튼 컴포넌트 생성
		JButton jb = new JButton("테스트 버튼");
		
		// 컨테이너에 버튼 추가
		ct.add(jb);
		
		// 프레임 크기 설정
		jf.setSize(400,300);
		
		// 프레임을 화면에 출력
		jf.setVisible(true);
	}
}

public class FrameTest1 {

	public static void main(String[] args) {
		new FirstFrame1(); // 클래스 호출
	}

}
