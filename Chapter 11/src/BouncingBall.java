import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;


//JFrame을 부모로 하고 ActionListener를 인터페이스로 삼은 BouncingBall클래스
public class BouncingBall extends JFrame implements ActionListener
{
	int x, y;
	private int xSpeed = 3, ySpeed = 3;
	//Define부분
	private static final int WIDTH = 600;
	private static final int HEIGHT = 200; 
	private static final int PERIOD = 10;

	class MyPanel extends JPanel 
	{
		public void paintComponent(Graphics g) 
		{
			super.paintComponent(g); 
			//공 그리기
			g.setColor(Color.BLUE); 
			g.fillOval(x, y, 40, 40);
		} 
	}

	public void update() 
	{
		x += xSpeed; y += ySpeed;
		if (x > WIDTH - 40 || x < 0)//위아래에 부딪히면
		{ 
			xSpeed = -xSpeed; //방향 정반대
		} 
		if (y > HEIGHT - 40 || y < 0)//양 옆에 부딪히면
		{ 
			ySpeed = -ySpeed; //방향 정반대
		}
	}
	public BouncingBall() 
	{
		setSize(WIDTH, HEIGHT); 
		setTitle("Bouncing Ball"); 
		add(new MyPanel());
		//시간 카운트 시작
		Timer timer = new Timer(PERIOD, this); 
		timer.start();
		
		setVisible(true);
	}
	//호출되는 액션
	public void actionPerformed(ActionEvent evt) 
	{
		update();//공을 이동시키면서 벽에 무딪히는지 계속 체크
		repaint(); //이동시킨 위치에 다시 공을 그린다. 
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BouncingBall f = new BouncingBall();
	}

}
