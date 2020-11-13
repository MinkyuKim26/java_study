package chapter09;

import javax.swing.*;
import java.awt.event.*;

public class EventProcFrame2 extends JFrame{

	private JButton button;
	private JLabel label;
	int counter = 0;
	
	public EventProcFrame2()
	{
		this.setSize(400, 150);//사이즈 설정
		this.setTitle("이벤트 예제");//타이틀
		JPanel panel = new JPanel(); //패널 선언 -> 관리 쉽게 하려고
		button = new JButton("증가");
		label = new JLabel("현재의 카운터값 : " + counter);
		//새로운 리스너를 정의? 왜 이렇게 하는거지?
		//new 인터페이스 이름() { 클래스 몸체 } 와 같은 방식으로 만든 클래스를 
		//무명 클래스라고 한다. 무명 클래스는 수퍼 클래스에서 상속을 받아 작성하거나 인터페이스를 구현하여서 작성할 수 있다.
		//new 키워드 다음에 슈퍼 클래스나 인터페이스 이름을 적어주면 된다. 수퍼 클래스 이름을 적으면 그 수퍼 클래스에서 상속을 받는다는 의미이고
		//인터페이스 이름인 경우에는 그 인터페이스를 구현하는 클래스라는 의미이다. 
		//인터페이스 : 하위 클래스에 특정 메소드가 '반드시' 존재하도록 규정한다. 
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				counter++;
				label.setText("현재의 카운터값 : " + counter);
			}
		});
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventProcFrame2 f = new EventProcFrame2();
	}

}
