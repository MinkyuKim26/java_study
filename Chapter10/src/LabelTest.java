import java.awt.*;
import javax.swing.*;

// 스윙 컴포넌트 : swing 안에 있는 컴포넌트들
public class LabelTest extends JFrame{
	private JPanel panel;
	private JLabel label1, label2;
	
	public LabelTest()
	{
		setTitle("레이블 테스트");
		//JComponent 클래스의 주요 메소드(사이즈 설정)
		setSize(400,150);
		
		panel = new JPanel();
		label1 = new JLabel("Color Label");
		label1.setForeground(Color.BLUE); // 글자색 설정
		
		label2 = new JLabel("Font Label");
		label2.setFont(new Font("Arial", Font.ITALIC, 30));
		label2.setForeground(Color.ORANGE);
		
		panel.add(label1);
		panel.add(label2);
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LabelTest t = new LabelTest();
	}

}
