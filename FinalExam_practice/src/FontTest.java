import java.awt.*;
import javax.swing.*;
import java.awt.Event;


public class FontTest extends JFrame{

	Font serif;//얘들은 뭐 어디서 추가하든 상관은 없다. 자식 클래스 내에서 추가해도 되고...밖에다 추가해도 되고...
	Font sanserif;
	Font monospaced;
	Font dialog;
	Font dialoginput;
	
	class MyPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);//항상 부모 클래스 불러오자
			g.setFont(serif);
			g.drawString("Serif 20 points PLAIN", 10, 50);
			g.setFont(sanserif);
			g.drawString("SanSerif 20 points BOLD", 10, 70);
			g.setFont(monospaced);
			g.drawString("Monospaced 20 points ITALIC", 10, 90);
			g.setFont(dialog);
			g.drawString("Dialog 20 points BOLD + ITALIC", 10, 110);
			g.setFont(dialoginput);
			g.drawString("DialogInput 20 points BOLD", 10, 130);
		}
	}
	
	public FontTest()
	{
		setSize(400, 150);
		setTitle("Font test");
		
		serif = new Font("Serif", Font.PLAIN, 20);
		sanserif = new Font("San Serif", Font.BOLD, 20);
		monospaced = new Font("Monospaced", Font.ITALIC, 20);
		dialog = new Font("Dialog", Font.BOLD | Font.ITALIC, 20);
		dialoginput = new Font("DialogInput", Font.BOLD, 20);
	
		add(new MyPanel());
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FontTest f = new FontTest();
	}

}
