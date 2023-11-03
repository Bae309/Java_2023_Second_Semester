package DefaultPackage;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class LC2 implements ActionListener {
	JLabel result;
	JButton apple;
	JButton pear;
	ImageIcon img1;
	ImageIcon img2;
	
	public LC2(JLabel result, JButton apple, JButton pear, ImageIcon img1, ImageIcon img2){
		this.apple = apple;
		this.pear = pear;
		this.result = result;
		this.img1 = img1;
		this.img2 = img2;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "사과") {
			result.setIcon(img1);
			result.setText("맛있는 사과입니다.");
		}
		
		if(e.getActionCommand() == "배") {
			result.setIcon(img2);
			result.setText("좋아하는 배입니다.");
		}
	}
}

// GUI 클래스 - 이벤트 포함
class JLabel3 extends JFrame {
	public JLabel result = new JLabel(); // JLabel 객체 선언
	public ImageIcon img1, img2; // ImageIcon 객체 선언
	
	public JLabel3() { // 생성자
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
		
		// 3. 버튼에 리스너 등록
		LC2 lc = new LC2(result, apple, pear, img1, img2);
		apple.addActionListener(lc);
		pear.addActionListener(lc);
		
		// 화면에 보여주기
		setTitle("이벤트 테스트5");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}	
}

// 메인 클래스
public class JLabelTest3 {
	public static void main(String[] args) {
		new JLabel3(); // 클래스 호출
	}
}
