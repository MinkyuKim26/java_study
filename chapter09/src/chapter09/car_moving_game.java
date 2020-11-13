package chapter09;

import java.awt.event.*;
import javax.swing.*;

public class car_moving_game extends JFrame{
	int img_x = 0, img_y = 50;
	
	public car_moving_game()
	{
		setSize(600, 300);
		//이미지 넣을 버튼 생성
		JButton button = new JButton("");
		//이미지 추가
		ImageIcon icon = new ImageIcon("car.png"); 
		button.setIcon(icon); 
		button.setLocation(img_x, img_y); 
		button.setSize(100, 50);
		
		JPanel panel = new JPanel(); 
		panel.setLayout(null); 
		panel.add(button);
		
		//키보드 입력 받기
		panel.requestFocus(); 
		panel.setFocusable(true);
		
		//키보드 리스너 추가
		panel.addKeyListener(
				new KeyListener()
				{
					public void keyPressed(KeyEvent e)
					{
						int keycode = e.getKeyCode();
						switch(keycode)
						{
							case KeyEvent.VK_UP : img_y -=10; break;
							case KeyEvent.VK_DOWN : img_y +=10; break;
							case KeyEvent.VK_LEFT : img_x -=10; break;
							case KeyEvent.VK_RIGHT : img_x +=10; break;
						}
						button.setLocation(img_x, img_y);
					}
					public void keyReleased(KeyEvent e) {}
					public void keyTyped(KeyEvent e) {}
				});
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car_moving_game f = new car_moving_game();
	}

}
