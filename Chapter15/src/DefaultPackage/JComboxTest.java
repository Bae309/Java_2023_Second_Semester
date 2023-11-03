package DefaultPackage;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


class JCombox extends JFrame implements ItemListener{
	
	JLabel fruitLabel; // 이미지 표시될 영역
	
	public JCombox() { // 생성자 생성
		// 콤보박스 객체 생성
		JComboBox<String> fruitCombo = new JComboBox<String>();
		
		// 이미지 표시 영역 객체 생성
		fruitLabel = new JLabel();
		
		// 과일 배열 생성
		String fruitsList[] = {"apple", "banana", "cherry", "grape", "pear", "persimmom"};
		
		// 컨테이너 만들기, 레이아웃 지정
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		// 콤보박스에 과일 리스트 추가(반복문 사용)
		for(int i = 0; i < fruitsList.length ; i++) 
		{
			fruitCombo.addItem(fruitsList[i]);
		}
		
		// 컨테이너에 콤보박스, 레이블 추가
		ct.add(fruitCombo);
		ct.add(fruitLabel);
		
		// 콤보박스에 이벤트 리스너 등록
		fruitCombo.addItemListener(this);
		
		// 출력
		setTitle("JComBox Test");
		setSize(200, 200);
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String fruit = (String)e.getItem();
		fruitLabel.setIcon(new ImageIcon("image/" + fruit + ".jpg"));
	}
}

public class JComboxTest {

	public static void main(String[] args) {
		new JCombox();
	}

}
