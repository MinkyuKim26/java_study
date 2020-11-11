package chapter08;

import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

//윈도우창 생성 예제
public class MyFrame_3 extends JFrame //JFrame : 윈도우와 메뉴를 가지는 일반적인 데스크탑 에플리케이션에 적합
{
	public MyFrame_3()
	{
		setTitle("BorderLayoutTest");
		setSize(300,150);
		setLayout(new FlowLayout());//FlowLayout : 패널의 디폴트 배치 관리자. 컴포넌트들을 왼쪽에서 오른쪽으로 배치. 더이상 공간이 없으면 다음 줄에 배치
		
		//컨테이너에 추가할 때 위치 지정
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("Button4"));
		add(new JButton("Button5"));
		
		setVisible(true);
	}
	public static void main(String[] args)
	{
		MyFrame_3 f = new MyFrame_3();
	}
}
