package DefaultPackage;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Shape extends JFrame implements ActionListener{
	// JTextArea와 JTextField를 액션리스너에서 오버라이딩할때 접근 가능하도록 속성 설정
	private JTextField jtf; // JTextField 속성 설정
	private JTextArea jta; // JTextArea 속성 설정
	
	public Shape() { // 생성자 생성
		// 컨테이너 객체 생성하기
		Container ct = getContentPane();
		
		// 판넬 객체 생성하기
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		// 레이아웃 객체 생성하기
		BorderLayout bl = new BorderLayout(10,10);
		GridLayout gl1 = new GridLayout(2,1);
		FlowLayout fl = new FlowLayout();
		GridLayout gl2 = new GridLayout(2,1);
		
		// 컨테이너의 레이아웃을 지정하기
		ct.setLayout(bl);
		
		// 각 판넬에 해당 레이아웃을 지정하기
		jp1.setLayout(gl1);
		jp2.setLayout(fl);
		jp3.setLayout(gl2);
		
		// JLabel 객체 추가하기
		JLabel jl1 = new JLabel("길이를 입력하고 버튼을 클릭하세요");
		JLabel jl2 = new JLabel("결과");
		
		// JTextField와 JTextArea 객체 생성하기
		jtf = new JTextField();
		jta = new JTextArea();
		
		// 버튼 생성(객체 추가)하기
		JButton jb1 = new JButton("원");
		JButton jb2 = new JButton("삼각형");
		JButton jb3 = new JButton("사각형");
		JButton jb4 = new JButton("리셋");
		
		// 첫번째 판넬에 항목 추가하기
		// 판넬에 레이블 추가
		jp1.add(jl1);
		// 판넬에 텍스트필드 추가
		jp1.add(jtf);
		
		// 두번째 판넬에 항목 추가하기
		// 판넬에 버튼 추가
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
				
		// 세번째 판넬에 항목 추가하기
		// 판넬에 레이블과 텍스트 추가하기
		jp3.add(jl2);
		jp3.add(jta);
				
		// 컨테이너에 판넬 추가하기
		ct.add(jp1, BorderLayout.NORTH);
		ct.add(jp2, BorderLayout.CENTER);
		ct.add(jp3, BorderLayout.SOUTH);
		
		// 버튼에 리스너 등록하기
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		
		setTitle("도형의 넓이 구하기 - 배성윤"); // 제목
		setSize(300,200); // 크기
		setVisible(true); // 사용자가 볼수 있도록 설정
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String input = jtf.getText().trim(); // jtf에서 입력된 텍스트 얻기
		
		// '원' 버튼을 눌렀을 때
        if (e.getActionCommand().equals("원")) {
        	// String으로 되어있는 input을 double 형태로 바꿔서 계산
        	// input에 입력된 항목이 숫자가 아니거나 아무것도 입력되어있지 않다면 예외처리
            try {
                double radius = Double.parseDouble(input);
                double radiusarea = Math.PI * Math.pow(radius, 2);
                jta.setText("원의 넓이 : " + radiusarea);
            } catch (NumberFormatException ex) {
                jta.setText("올바른 숫자를 입력하세요.");
            }
        } 
        
        // '삼각형' 버튼을 눌렀을 때
        else if (e.getActionCommand().equals("삼각형")) {
        	// String으로 되어있는 input을 double 형태로 바꿔서 계산
        	// input에 입력된 항목이 숫자가 아니거나 아무것도 입력되어있지 않다면 예외처리
            try {
            	double triangle = Double.parseDouble(input);
            	double trianglearea = triangle * triangle / 2;
            	jta.setText("삼각형의 넓이 : " + trianglearea);
            } catch (NumberFormatException ex) {
            	jta.setText("올바른 숫자를 입력하세요.");
            }
        } 
        
        // '사각형' 버튼을 눌렀을 때
        else if (e.getActionCommand().equals("사각형")) {
        	// String으로 되어있는 input을 double 형태로 바꿔서 계산
        	// input에 입력된 항목이 숫자가 아니거나 아무것도 입력되어있지 않다면 예외처리
        	try {
            	double square = Double.parseDouble(input);
            	double squarearea = square * square;
            	jta.setText("삼각형의 넓이 : " + squarearea);
            } catch (NumberFormatException ex) {
            	jta.setText("올바른 숫자를 입력하세요.");
            }
        } 
        
        // '리셋' 버튼을 눌렀을 때
        else if (e.getActionCommand().equals("리셋")) {
        	// '리셋' 버튼을 누르면 텍스트 필드와 텍스트 에어리어에 있는 항목을 지움
            jtf.setText("");
            jta.setText("");
        }
		
	}

}
public class report2 {
	public static void main(String[] args) {
		new Shape(); // 클래스 호출
	}
}
