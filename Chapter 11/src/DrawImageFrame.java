import java.awt.*;
import javax.swing.*;

public class DrawImageFrame extends JFrame{
	Image img;
	
	public DrawImageFrame() 
	{
		//이미지 담는 객체 생성
		ImageIcon icon = new ImageIcon("car.png");
		img = icon.getImage(); //멤버 변수 img에 담아준다. 
		setSize(500, 200); 
		add(new MyPanel()); 
		setVisible(true);
	}
	class MyPanel extends JPanel 
	{
		public void paintComponent(Graphics g) 
		{ 
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this);//이미지를 DrawImageFrame의 (0,0)좌표에다 그린다.
		} 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawImageFrame f = new DrawImageFrame();
	}

}
