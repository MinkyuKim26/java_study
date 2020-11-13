package chapter09;

import javax.swing.*;

import chapter09.MyFrame.MyListener;

import java.awt.FlowLayout;
import java.awt.event.*;

//클래스에서 프레임 가상 클래스와 액션처리 인터페이스를 모두 받음 -> 프레임에서 다 처리하겠다는 뜻
public class EventProcFrame1 extends JFrame implements ActionListener {

	private JButton button;
	private JLabel label;
	int counter = 0;
	
	//프레임 클래스에서 이벤트 처리(버튼 클릭)
	public void actionPerformed(ActionEvent e)
	{
		counter++;
		label.setText("현재의 카운터값 : " + counter);
	}
	public EventProcFrame1()
	{
		this.setSize(400, 150);//사이즈 설정
		this.setTitle("이벤트 예제");//타이틀
		
		setLayout(new FlowLayout());//레이아웃 설정. FlowLayout : 가운데 정렬 배치
		
		label = new JLabel("현재의 카운터값 : " + counter);
		button = new JButton("증가");
		button.addActionListener(this); //this에 이벤트 처리 인터페이스르 받았기에 this에 정의된 리스너를 등록
		
		//창에 추가
		add(label);
		add(button);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventProcFrame1 f = new EventProcFrame1();
	}

}
