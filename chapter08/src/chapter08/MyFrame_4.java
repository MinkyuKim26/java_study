package chapter08;

import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

//윈도우창 생성 예제
public class MyFrame_4 extends JFrame //JFrame : 윈도우와 메뉴를 가지는 일반적인 데스크탑 에플리케이션에 적합
{
	public MyFrame_4()
	{
		setTitle("BorderLayoutTest");
		setSize(300,150);
		setLayout(new GridLayout(0,3));//GridLayout : 컴포넌트들을 격자 모습으로 배치. 모든 컴포넌트들의 크기는 같게 되며 컨테이너의 모든 공간은 컴포넌트들로 채워진다.
		//윈도우의 크기를 바꾸면 컴포넌트의 크기를 변경하여 윈도우의 크기에 맞춘다.
		//new GridLayout(0,3) : 3개의 열과 필요한 만큼의 행을 갖는 GridLayout 생성
		
		//컨테이너에 추가할 때 위치 지정
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Long Button5"));
		
		setVisible(true);
	}
	public static void main(String[] args)
	{
		MyFrame_4 f = new MyFrame_4();
	}
}
