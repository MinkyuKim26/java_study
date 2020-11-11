package chapter08;

import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

//윈도우창 생성 예제
public class MyFrame5 extends JFrame //JFrame : 윈도우와 메뉴를 가지는 일반적인 데스크탑 에플리케이션에 적합
{
	private JButton b1, b2;
	public MyFrame5()
	{
		setTitle("Absoult Position Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우 x버튼 누르면 프로그램 종료
		setSize(300,150);
		setLayout(null);//절대 위치로 배치(null로 설정, 별도의 배치관리자 지정X). add 메소드로 컴포넌트를 컨테이너에 추가. setLocation()과 setSize() 메소드로 컴포넌트의 위치와 크기를 지정
		
		b1 = new JButton("Button#1");
		add(b1);
		b1.setLocation(10, 30);//위치
		b1.setSize(90, 20);//크기
		
		b2 = new JButton("Button#2");
		add(b2);
		b2.setLocation(90, 30);
		b2.setSize(90, 20);
		
		
		setVisible(true);
	}
	public static void main(String[] args)
	{
		MyFrame5 f = new MyFrame5();
	}
}