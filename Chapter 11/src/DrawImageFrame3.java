import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class DrawImageFrame3 extends JFrame implements ActionListener
{
	//멤버 변수
	Image img;
	int pos_x = 100, pos_y = 50; 
	private JButton b1, b2;
	
	public DrawImageFrame3() 
	{
		ImageIcon icon = new ImageIcon("car.gif"); //이미지 선언
		img = icon.getImage();//멤버 변수에 담아둠
		
		setSize(500, 200);
		//프레임 가운데 MyPanel객체 생성
		add(new MyPanel(), BorderLayout.CENTER); 
		JPanel panel = new JPanel();
		b1 = new JButton("왼쪽으로 이동");
		b2 = new JButton("오른쪽으로 이동"); 
		//버튼에 액션 리스너 추가
		b1.addActionListener(this); 
		b2.addActionListener(this);
		
		//패널에 버튼 추가
		panel.add(b1);
		panel.add(b2);
		//프레임에 버튼을 담은 패널을 프레임의 남쪽에 추가
		add(panel, BorderLayout.SOUTH); 
		setVisible(true);
	}
	class MyPanel extends JPanel 
	{
		//그림 그리는거
		public void paintComponent(Graphics g) 
		{
			super.paintComponent(g); 
			//지정된 위치에 그리기
			g.drawImage(img, pos_x, pos_y, this);
		} 
	}
	//액션(이경우에는 마우스 액션)
	public void actionPerformed(ActionEvent e) 
	{ 
		//"왼쪽으로 이동"버튼을 눌렀을 경우
		if (e.getSource() == b1)
			pos_x -= 10; //위치 왼쪽으로 10만큼 이동
		//"오른쪽으로 이동"버튼을 눌렀을 경우
		else if (e.getSource() == b2)
			pos_x += 10; //위치 오른쪽으로 10만큼 이동
		
		repaint();
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawImageFrame3 d = new DrawImageFrame3();
	}

}
