package DefaultPackage;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// GUI 클래스 - 이벤트 포함
class JLabel1 extends JFrame implements ActionListener {
	private JLabel result = new JLabel(); // JLabel 객체 선언
	public ImageIcon img1, img2; // ImageIcon 객체 선언
	
	public JLabel1() { // 생성자
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
		apple.addActionListener(this);
		pear.addActionListener(this);
		
		// 화면에 보여주기
		setTitle("이벤트 테스트3");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
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


// 메인 클래스
public class JLabelTest1 {
	public static void main(String[] args) {
		new JLabel1(); // 클래스 호출
	}
}
