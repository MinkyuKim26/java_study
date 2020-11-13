package chapter09;

import java.awt.event.*;
import javax.swing.*;

public class car_moving_mouse extends JFrame{
	int img_x = 50, img_y = 50;
	
	public car_moving_mouse()
	{
		setSize(600, 300);
		JButton button = new JButton(""); 
		ImageIcon icon = new ImageIcon("car.gif"); 
		button.setIcon(icon); button.setLocation(img_x, img_y); 
		button.setSize(100, 50);
		
		JPanel panel = new JPanel(); 
		panel.setLayout(null); 
		panel.add(button); 
		panel.requestFocus(); 
		panel.setFocusable(true);
		
		panel.addMouseListener(new MouseListener()
				{
					//마우스가 눌려졌을 때
					public void mousePressed(MouseEvent e)//컴포넌트 위에서 마우스 버튼을 눌렀을 때
					{
						img_x = e.getX();
						img_y = e.getY();
						button.setLocation(img_x, img_y); //눌려진 곳에 자동차 이동
					}
					public void mouseReleased(MouseEvent e) { } //컴포넌트 위에서 마우스 버튼을 땠을 때 
					public void mouseEntered(MouseEvent e) { } //마우스가 컴포넌트 위에 들어갔을 떼
					public void mouseExited(MouseEvent e) { } //마우스가 컴포넌트 밖으로 나갈 때
					public void mouseClicked(MouseEvent e) { } //마우스로 컴포넌트를 클릭했을 때
					// 마우스 드래그 : public void mouseDragged(MouseEvent e) { }
					// 마우스가 클릭되지 않고 이동 : public void mouseMoved(MouseEvent e) { }
				});
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car_moving_mouse f = new car_moving_mouse();
	}

}
