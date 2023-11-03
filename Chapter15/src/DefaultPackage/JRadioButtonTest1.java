package DefaultPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class JRadioButton1 extends JFrame implements ActionListener {
    private JPanel hobbyPanel, agePanel, resultPanel;
    private JCheckBox[] jc;
    private JRadioButton[] jr;
    private JLabel jl;

    public JRadioButton1() {
        Container ct = getContentPane();
        ct.setLayout(new GridLayout(3, 1));

        // hobbyPanel에 들어갈 내용
        hobbyPanel = new JPanel();
        JLabel jl1 = new JLabel("당신의 취미는?");
        String[] hobby = {"걷기", "등산", "골프", "스킨스쿠버", "페러글라이딩"};
        jc = new JCheckBox[5];
        for (int i = 0; i < 5; i++) {
            jc[i] = new JCheckBox(hobby[i]);
            jc[i].addActionListener(this); 
        }
        hobbyPanel.add(jl1);
        for (int i = 0; i < 5; i++) {
            hobbyPanel.add(jc[i]);
        }

        // agePanel에 들어갈 내용
        agePanel = new JPanel();
        JLabel jl2 = new JLabel("당신의 나이는?");
        String[] age = {"20대", "30대", "40대", "50대", "60대"};
        jr = new JRadioButton[5];
        ButtonGroup ageGroup = new ButtonGroup(); // 하나만 선택 가능하도록 버튼 그룹 생성
        for (int i = 0; i < 5; i++) {
            jr[i] = new JRadioButton(age[i]);
            jr[i].addActionListener(this); 
            ageGroup.add(jr[i]); 
        }
        agePanel.add(jl2);
        for (int i = 0; i < 5; i++) {
            agePanel.add(jr[i]);
        }

        // resultPanel에 들어갈 내용
        resultPanel = new JPanel();
        jl = new JLabel();
        resultPanel.add(jl);

        ct.add(hobbyPanel);
        ct.add(agePanel);
        ct.add(resultPanel);

        setTitle("JRadioButtonTest1");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 체크박스 선택
        String hobbies = "당신의 취미: ";
        for (int i = 0; i < 5; i++) {
            if (jc[i].isSelected()) {
                hobbies += jc[i].getText() + " ";
            }
        }

        // 라디오 버튼 선택
        String age = "당신의 나이: ";
        for (int i = 0; i < 5; i++) {
            if (jr[i].isSelected()) {
                age = "당신의 나이: " + jr[i].getText();
                break;
            }
        }

        // ResultLabel에 결과 나타내기
        jl.setText(hobbies + "| " + age);
    }
}

public class JRadioButtonTest1{
	public static void main(String[] args) {
		new JRadioButton1();
	}
}