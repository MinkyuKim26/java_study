import java.awt.*;
import javax.swing.*;

//눈사람 얼굴 그리기
public class SnowManFace extends JFrame{

	class MyPanel extends JPanel
	{
		public void paintComponent(Graphics g) 
		{ 
			super.paintComponent(g); 
			//색상 노란색으로 바꾸고 원 그리기
			g.setColor(Color.YELLOW);
			g.fillOval(20, 30, 200, 200); 
			//색상 검은색으로 바꾸고 arc 그리기
			g.setColor(Color.BLACK); 
			g.drawArc(60, 80, 50, 50, 180, -180); 
			g.drawArc(150, 80, 50, 50, 180, -180); 
			g.drawArc(70, 130, 100, 70, 180, 180);
		}
	}
	public SnowManFace() 
	{ 
		setSize(300, 300);
		setTitle("눈사람 얼굴"); 
		add(new MyPanel());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnowManFace s = new SnowManFace();
	}

}
