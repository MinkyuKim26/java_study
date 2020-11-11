package chapter08;

import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

//윈도우창 생성 예제
public class MyFrame extends JFrame //JFrame : 윈도우와 메뉴를 가지는 일반적인 데스크탑 에플리케이션에 적합
{
	public MyFrame()
	{
		//윈도우 생성
		setSize(300, 150);//크기
		setLocation(200, 300);//위치
		setTitle("MyFrame");//제목
		
		//컴포넌트 추가
		setLayout(new FlowLayout()); //배치관리자(컨테이너 안에 존재하는 컴포넌트들의 크기와 위치를 자동적으로 관리) 설정, 디폴트는 BorderLayout
		//배치관리자 설정 방법 : 생성자를 이용(new JPanel(new FlowLayout()), setLayout 메소드 이용(윗줄)
		getContentPane().setBackground(Color.yellow);//배경색 설정
		
		JButton button1 = new JButton("확인"); //버튼 추가
		JButton button2 = new JButton("취소");
		
		this.add(button1);
		this.add(button2);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		MyFrame f = new MyFrame();
	}
}
