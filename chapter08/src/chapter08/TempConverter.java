package chapter08;

import javax.swing.*;

public class TempConverter extends JFrame{
	public TempConverter()
	{
		JPanel panel = new JPanel();
		add(panel);
		
		//텍스트, 버튼 설정
		JLabel label1 = new JLabel("화씨 온도");
		JLabel label2 = new JLabel("섭씨 온도");
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("변환");
		
		//패널에 넣기
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button);
		
		setSize(300, 150);
		setTitle("온도 변환기");
		setVisible(true);
		
	}
	
	public static void main(String argv[]) 
	{
		TempConverter f = new TempConverter();
	}
}
