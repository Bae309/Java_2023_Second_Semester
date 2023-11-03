package DefaultPackage;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JCheckBox1 extends JFrame implements ItemListener{
    private JCheckBox jcb1, jcb2, jcb3, jcb4; // JCheckBox 속성 설정
    private JTextField jtf; // JTextField 속성 설정

    public JCheckBox1() {
        Container ct = getContentPane(); // 컨테이너 생성
        ct.setLayout(new FlowLayout()); // 레이아웃 설정

        jcb1 = new JCheckBox("Checkbox 1"); // JCheckBox 객체 생성
        jcb2 = new JCheckBox("Checkbox 2"); // JCheckBox 객체 생성
        jcb3 = new JCheckBox("Checkbox 3"); // JCheckBox 객체 생성
        jcb4 = new JCheckBox("Checkbox 4"); // JCheckBox 객체 생성
        jtf = new JTextField(20); // JTextField 객체 생성
        
        // 컨테이너에 객체 추가
        ct.add(jcb1); 
        ct.add(jcb2);
        ct.add(jcb3);
        ct.add(jcb4);
        ct.add(jtf);
        
        jcb1.addItemListener(this);
        jcb2.addItemListener(this);
        jcb3.addItemListener(this);
        jcb4.addItemListener(this);
        

        setTitle("JCheckBox Test1");
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

	@Override
	public void itemStateChanged(ItemEvent e) {
		jtf.setText(((JCheckBox)e.getItem()).getText());
		
	}
}

public class JCheckBoxTest1 {

    public static void main(String[] args) {
        new JCheckBox1();
    }
}
