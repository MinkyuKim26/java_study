package chapter09;

import java.awt.event.*;
import javax.swing.*;

public class SimpleGame extends JFrame{
	int n1,n2,n3;
	JButton button1, button2, button3;
	
	public SimpleGame()
	{
		setTitle("Simple Game Machine");
		setSize(300, 150);
		
		//패널에 버튼 추가
		JPanel panel = new JPanel(); 
		button1 = new JButton(""+n1); 
		panel.add(button1);
		button2 = new JButton(""+n2); 
		panel.add(button2);
		button3 = new JButton(""+n3); 
		panel.add(button3);
		
		//키보드 포커스 휙득 : KeyEvent가 발생하려면 컴포넌트가 반드시 키보드 포커스를 가지고 있어야 한다.
		panel.requestFocus(); 
		panel.setFocusable(true);
		//무명 클래스를 리스너에 추가
		panel.addKeyListener(
				new KeyListener()
				{
					public void keyPressed(KeyEvent e)
					{
						int keycode = e.getKeyCode();
						if(keycode == KeyEvent.VK_ENTER)
						{
							n1 = (int)(Math.random()*10);
							n2 = (int)(Math.random()*10);
							n3 = (int)(Math.random()*10);
							
							button1.setText(""+n1);
							button2.setText(""+n2);
							button3.setText(""+n3);
						}
					}
					public void keyReleased(KeyEvent e) {}
					public void keyTyped(KeyEvent e) {}
				});
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGame f = new SimpleGame();
	}

}
