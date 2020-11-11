package chapter08;

import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;

public class MyFrame_Panel 
{
	public MyFrame_Panel()
	{
		JPanel panel = new JPanel(); //패널 사용 : 깔끔하게 컴포넌트 관리 가능. 패널 안에 패널 넣기도 가능
		panel.setBackground(Color.orange); //패널의 배경색 변경
		
		JButton b1 = new JButton("Button 1");
		b1.setBackground(Color.yellow);
		JButton b2 = new JButton("Button 2");
		b2.setBackground(Color.green);
		
		panel.add(b1);
		panel.add(b2);
		add(panel); //패널에 버튼 추가
		
		setSize(300, 150);
		setVisible(true);//패널을 추가
		
	}
	public static void main(String argv[])
	{
		MyFrame_Panel f = new MyFrame_Panel();
	}
	//기초 컴포넌트들
	//레이블(JLabel) : 텍스트를 표시할 수 있는 공간. 편집이 불가능한 텍스트를 표시한다. 생성자에 텍스트를 넣어쥰다. setText()함수를 사용해 생성 후 나중에 레이블의 텍스트를 설정할 수 있다. 
	//텍스트 필드(JTextField) : 사용자가 한 줄의 텍스트를 입력할 수 있는 공간. 생성자에 텍스트 필드의 칸 수를 설정할 수 있다. ex)new JTextField(20)//20 = 텍스트 필드의 칸 수
	//입력 후 엔터키 누르면 이벤트 발생(만약 한 줄 이상의 텍스트 입력이 필요하면 텍스트 영역(text area)를 위한 클래스 JTextArea사용
	//버튼(JButton) : 클릭되면 어떤 동작을 실행하느 버튼
	
	//JTextField : 기본적인 텍스트 필드
	//JFormattedTextField : 날짜, 전화번호 등 형식에 맞는 데이터를 입력한다.
	//JPasswordField : 사용자가 입력하는 내용이 보이지 않는다.
	//JComboBox : 사용자가 직접 입력할 수도 있지만 항목 중에서 선택할 수 있다.
	//JSpinner : 텍스트 필드와 버튼이 조합된 것으로 사용자는 이전 버튼과 다음 버튼을 이용하여 선택할 수 있다.
	//setEditable(false) : 텍스트 필드의 편집을 불가능하게 설정(true를 하면 편집 가능)
	//getText() : 텍스트 필드에서 텍스트를 가져오는 메소드
	//setText() : 텍스트 필드에 텍스트를 쓰는 메소드
	
	//버튼(Button) : 클릭했을 때 이벤트를 발생해 원하는 동작을 하게 한다.
	//버튼 속 텍스트, 버튼 텍스트 폰트, 텍스트 색상, 배경색, 버튼의 상태(활성 시봘성)을 변경 가능
	//JButton : 가장 일반적인 버튼
	//JCheckBox : 체크 박스 버튼
	//JRadioButton : 라디오 버튼으로 그룹 중의 하나의 버튼만 체크
	//JMenuItem : 메뉴 
}
