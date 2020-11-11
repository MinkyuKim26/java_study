package chapter08;

import javax.swing.*;

public class MyFrame_Pizza extends JFrame{

	public MyFrame_Pizza()
	{
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel(); //레이블만 관리
		JPanel panelB = new JPanel(); //버튼만 관리
		
		JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		panelA.add(label1);//패널에 저장
		
		//버튼 생성
		JButton button1 = new JButton("콤보 피자");
		JButton button2 = new JButton("포테이토 피자");
		JButton button3 = new JButton("불고기 피자");
		panelB.add(button1);//추가
		panelB.add(button2);
		panelB.add(button3);
		
		//레이블, 텍스트필드 생성
		JLabel label2 = new JLabel("개수");
		JTextField field1 = new JTextField(10);
		panelB.add(label2);
		panelB.add(field1);
		
		//추가
		panel.add(panelA);
		panel.add(panelB);
		
		//패널 안에 패널 넣기
		add(panel);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame_Pizza f = new MyFrame_Pizza();
	}

}
