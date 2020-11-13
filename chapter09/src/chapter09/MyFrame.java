package chapter09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame{

	private JButton button;
	private JLabel label;
	int counter = 0;
	
	//내부 클래스로 이벤트를 처리하는 클래스 정의
	class MyListener implements ActionListener //ActionListener라는 인터페이스를 구현한 MyListener
	{
		//이벤트 발생할 때 호출
		public void actionPerformed(ActionEvent e)
		{
			counter++;
			label.setText("현재의 카운터값 : " + counter);
		}
	}
	public MyFrame()
	{
		setSize(400, 150);//사이즈 설정
		setTitle("이벤트 예제");//타이틀
		setLayout(new FlowLayout());//레이아웃 설정. FlowLayout : 가운데 정렬 배치
		
		label = new JLabel("현재의 카운터값 : " + counter);
		button = new JButton("증가");
		button.addActionListener(new MyListener()); //버튼에 이벤트 처리 객체를 등록
		
		//창에 추가
		add(label);
		add(button);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame t = new MyFrame();//창 생성
	}

}
