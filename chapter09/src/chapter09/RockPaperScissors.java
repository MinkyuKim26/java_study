package chapter09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class RockPaperScissors extends JFrame implements ActionListener {

	final int SCISSORS = 0; //final 변수 : 프로그램 실행 도중에 값을 바꿀 수 없음
	final int ROCK = 1;
	final int PAPER = 2;
	
	private JPanel panel;
	private JLabel information, output;
	private JButton rock, paper, scissors; //내가 누를 버튼들
	
	public RockPaperScissors()
	{
		setTitle("가위, 바위, 보");
		setSize(400, 150);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3));//가로를 3등분 하여 배치하는 GridLayout방식 사용
		//글자 정의
		information = new JLabel("아래의 버튼 중에서 하나를 클릭하시오!");
		output = new JLabel("Good Luck!");
		
		scissors = new JButton("0 : 가위");
		rock = new JButton("1 : 바위");
		paper = new JButton("2 : 보");
		
		scissors.addActionListener(this);
		rock.addActionListener(this);
		paper.addActionListener(this);
		
		panel.add(scissors);
		panel.add(rock);
		panel.add(paper);
		
		add(information, BorderLayout.NORTH);//위에 배치
		add(panel, BorderLayout.CENTER);//묵찌빠 버튼 가운데 배치
		add(output, BorderLayout.SOUTH);//밑에 배치
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		RockPaperScissors gui = new RockPaperScissors();
	}

	//액션 정의
	public void actionPerformed(ActionEvent e)
	{
		JButton b = (JButton)e.getSource();//이벤트 발생 컴포넌트 추출
		int user = Integer.parseInt(""+b.getText().charAt(0));//버튼 텍스트의 첫 번째 글자(0,1,2) 추출
		Random random = new Random();
		int computer = random.nextInt(3);//묵,찌,빠 중 하나 고르기
		
		//묵찌빠 처리
		if(user == computer)
		{
			output.setText("인간과 컴퓨터가 비겼음");
		}
		else if(user == (computer+1)%3)
		{
			output.setText("인간 : "+user + "컴퓨터 : " + computer + "인간승리");
		}
		else
		{
			output.setText("인간 : "+user + "컴퓨터 : " + computer + "컴퓨터승리");
		}
	}
}
