//카운터 
//스윙 컴포넌트를 사용해 10~0 카운트
//원래 이름 : CountDownTest


import java.awt.*;
import javax.swing.*;

public class CounterDownTest extends JFrame{

	private JLabel label;
	
	class MyThread extends Thread //클래스 안에 스레드 클래스 정의
	{
		public void run() 
		{
			for (int i = 10; i >= 0; i--) 
			{
				try 
				{
					Thread.sleep(1000);//밀리초 단위의 시간을 받아서 지정된 시간동안 현재 스레드의 실행을 중단(1000밀리 : 1초)
				}
				catch (InterruptedException e) //sleep()을 사용할 때에는 InterruptedException을 처리
				{
					e.printStackTrace();
				}
				label.setText(i + "");
			}
		}
	}
	
	public CounterDownTest() 
	{
		//제목, 크기 등
		setTitle("카운트다운");
		setSize(400, 150); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창(메인 프레임) 닫으면 프로그램도 종료
		
		//label 생성 -> Frame에 추가
		label = new JLabel("Start");
		label.setFont(new Font("Serif", Font.BOLD, 100)); 
		add(label);
		
		//보여주게 하기
		setVisible(true);
		
		(new MyThread()).start();//스레드 시작
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterDownTest t = new CounterDownTest();
	}

}
