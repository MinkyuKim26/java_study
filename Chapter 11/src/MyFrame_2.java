import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class MyFrame_2 extends JFrame{
	int x,y;
	class MyPanel extends JPanel
	{
		public MyPanel()
		{
			addMouseListener(new MouseAdapter() 
			{
				//마우스 누른 좌표에서 repaint
				public void mousePressed(MouseEvent e) 
				{
					x = e.getX(); 
					y = e.getY(); 
					repaint();//paintComponent(Graphics g) 호출
				}
			});
		}
		//그림 그리게 해주는 함수
		protected void paintComponent(Graphics g) 
		{
			super.paintComponent(g);
			g.setColor(Color.ORANGE); 
			g.fillRect(x, y, 100, 100);
		}
	}
	public MyFrame_2()
	{
		setTitle("Basic Painting");
		setSize(600, 200);
		add(new MyPanel());
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame_2 f = new MyFrame_2();
	}

}
