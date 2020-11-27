import java.awt.*;
import javax.swing.*;

public class FontTest extends JFrame{
	Font f;
	class MyPanel extends JPanel 
	{
		//그림 그릴 때 사용
		public void paintComponent(Graphics g) 
		{ 
			super.paintComponent(g);
			//앞서 선언했던 font객체 반영
			g.setFont(f);
			g.drawString("Dialog 30 points BOLD + ITALIC", 10, 30);
		}
	}
	public FontTest() 
	{
		//폰트 선언
		f = new Font("Dialog", Font.BOLD | Font.ITALIC, 30); 
		setSize(600, 100);
		setTitle("Font Test");
		add(new MyPanel());
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FontTest s = new FontTest();
	}

}
