import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame
{
	//그림을 그리는 방법 : JPanel을 상속받은 자식 클래스를 작성한 후 이를 그림을 그리는 캔버스로 사용
	//그냥 JPanel 선언해서 쓰지 왜 이렇게 하는 것일까? 나의 생각 : 구분하려고
	class MyPanel extends JPanel
	{
		//부모 클래스의 paintComponent 재정의
		//paintComponent는 컴포넌트를 다시 그릴 필요가 있을 때마다 자바 시스템에 의해 호출되는 메소드
		protected void paintComponent(Graphics g) 
		{
			super.paintComponent(g); //부모 클래스의 paintComponemt() 호출
			//그림을 그리는 문장들
			g.drawOval(60, 50, 60, 60); 
			g.drawRect(120, 50, 60, 60); 
			g.setColor(Color.BLUE); 
			g.fillOval(180, 50, 60, 60); 
			g.fillRect(240, 50, 60, 60);
		}
	}
	public MyFrame() 
	{ 
		setTitle("Basic Painting"); 
		setSize(600, 200); 
		add(new MyPanel()); 
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
	}
}
