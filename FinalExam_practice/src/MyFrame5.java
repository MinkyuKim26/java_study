import javax.swing.*;
import java.awt.*;

public class MyFrame5 extends JFrame{

	private JPanel panel;
	private JButton[] buttons;
	public MyFrame5()
	{
		setSize(400, 150);
		setTitle("MyFrame5");
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 5)); //GridLayout 쓰려면 awt도 있어야한다. (0, 5) 한 열에 5갠데 행 갯수는 알아서 설정
		buttons = new JButton[20];
		
		for(int i = 0; i< 20; i++)
		{
			buttons[i] = new JButton(""+i);
			
			//색이 안바뀜.왜지? 
			int R = (int) (Math.random() * 256);
			int G = (int) (Math.random() * 256);
			int B = (int) (Math.random() * 256);
			
			Color color = new Color(R, G, B);
			buttons[i].setBackground(color);
			
			panel.add(buttons[i]);
		}
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame5 f = new MyFrame5();
	}

}
