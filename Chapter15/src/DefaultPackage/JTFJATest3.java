package DefaultPackage;

import java.awt.Container;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


// ActionListener가 포함된 독립된 클래스 생성
class ListenerClass implements ActionListener {
	JLabel jl; // JLabel 객체 생성
	JTextArea output; // JTextArea 객체 생성
	JTextField input; // JTextField 객체 생성
	
	
	public ListenerClass(JLabel jl,JTextArea output, JTextField input) {
		this.jl = jl;
		this.input = input;
		this.output = output;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(output.getLineCount() <= output.getRows()) { // 텍스트에어리어 크기보다 작을때 추가
			output.append(e.getActionCommand()+"\n"); // output에 글 내용 추가
			input.setText(""); // 글 내용 삭제(빈칸으로)
		}
		else // 줄을 넘으면..
		{
			jl.setText("입력이 종료되었습니다.");
			input.setEditable(false); // 입력 불가
			
		}
		
	}
	
	
}

class JTFJA3 extends JFrame {
	// 텍스트 필드 객체 선언
	private JTextField input; 
	
	// 텍스트 에어리어 객체 선언
	private JTextArea output;
	
	// 라벨 객체 선언 
	private JLabel jl = new JLabel("텍스트를 입력하세요");
	
	public JTFJA3() {
		// 20자 입력 가능한 텍스트 필드 객체 생성
		input = new JTextField(20);
		
		// 10중 20칸 텍스트 에어리어 객체 생성
		output = new JTextArea(10,20);
		
		// 텍스트 에어리어는 수정 불가 설정
		output.setEditable(false);
		
		// 컨테이너 생성
		Container ct = getContentPane();
		
		// FlowLayout 설정
		ct.setLayout(new FlowLayout());
		
		// 패널 생성
		JPanel pl = new JPanel();
		
		// 패널에 input/output 추가 
		pl.add(input);
		pl.add(output);
		
		// 패널과 레이블을 컨테이너에 추가
		ct.add(jl);
		ct.add(pl);
		
		ListenerClass lc = new ListenerClass(jl, output, input);// ActionListener가 내장된 ListenerClass 클래스 호출
		input.addActionListener(lc); // 객체 호출 
		
		// 화면에 보이도록..... 사이즈 : 500, 300
		setTitle("JTextField와 JTextArea"); // 제목 설정
		setSize(500,300); // 컨테이너 사이즈 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); // 컨테이너가 보이도록 설정
		
	}
	
}



public class JTFJATest3 {
	public static void main(String[] args) {
		new JTFJA3(); // JTFJA2 클래스 호출 
	}
}
