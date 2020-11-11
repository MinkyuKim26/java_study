package chapter08;

import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

//윈도우창 생성 예제
public class MyFrame_2 extends JFrame //JFrame : 윈도우와 메뉴를 가지는 일반적인 데스크탑 에플리케이션에 적합
{
	public MyFrame_2()
	{
		setTitle("BorderLayoutTest");
		setSize(300,150);
		setLayout(new BorderLayout());//BorderLayout : 최상위 컨테이너의 디폴트 배치 관리자. 영역 지정이 없으면 중앙에 배치.
		
		//버튼 생성
		JButton b1 = new JButton("NORTH");
		JButton b2 = new JButton("SOUTH");
		JButton b3 = new JButton("EAST");
		JButton b4 = new JButton("WEST");
		JButton b5 = new JButton("CENTER");
		
		//컨테이너에 추가할 때 위치 지정
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);
		
		setVisible(true);
	}
	public static void main(String[] args)
	{
		MyFrame_2 f = new MyFrame_2();
	}
}
