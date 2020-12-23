import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ColorTest extends JFrame {

	class MyPanel extends JPanel implements ActionListener
	{
		Color color = new Color(0, 0, 0);
		JButton button;
		
		public MyPanel()
		{
			setLayout(new BorderLayout());
			button = new JButton("색상 변경");
			button.addActionListener(this);
			add(button, BorderLayout.SOUTH);
		}
		
		public void paintComponent(Graphics g) 
		{
			super.paintComponent(g);
			g.setColor(color);
			g.fillRect(10, 10, 260, 110);
		}
		
		public void actionPerformed(ActionEvent e)
		{
			color = new Color((int) (Math.random() * 255),
					(int) (Math.random() * 255), (int) (Math.random() * 255));
			repaint();
		}
	}
	
	public ColorTest()
	{
		setSize(400, 150);
		setTitle("ColorTest");
		
		add(new MyPanel());
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ColorTest f = new ColorTest();
	}
	
}
