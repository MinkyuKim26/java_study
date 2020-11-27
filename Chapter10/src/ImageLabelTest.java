import java.awt.*;
import javax.swing.*;

public class ImageLabelTest extends JFrame{

	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public ImageLabelTest()
	{
		setTitle("Image Label Test");
		setSize(350, 250);
		
		panel = new JPanel();
		label = new JLabel("Dog");
		label.setFont(new Font("Arial", Font.ITALIC, 30));
		label.setForeground(Color.ORANGE);
		
		ImageIcon icon = new ImageIcon("test.png"); // 이미지 경로를 저장한 후 화면에 출력
		label.setIcon(icon); //label에 icon(이미지)를 불러온다.
		
		button = new JButton("자세한 정보를 보려면 클릭하세요!");
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageLabelTest t = new ImageLabelTest();
	}

}
