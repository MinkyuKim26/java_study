import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener{

	JButton yellowButton;
	JButton pinkButton;
	JPanel panel;
	
	public MyFrame()
	{
		setSize(400, 150);
		setTitle("이벤트 예제");
		
		panel = new JPanel();
		yellowButton = new JButton("노란색");
		yellowButton.addActionListener(this);
		pinkButton = new JButton("핑크색");
		pinkButton.addActionListener(this);
		panel.add(yellowButton);
		panel.add(pinkButton);
		add(panel);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new  MyFrame();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == yellowButton)
		{
			panel.setBackground(Color.YELLOW);
		}
		else if(e.getSource() == pinkButton)
		{
			panel.setBackground(Color.PINK);
		}
	}
}
