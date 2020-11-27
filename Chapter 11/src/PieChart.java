import java.awt.*; 
import javax.swing.*;

class Slice 
{
	double value;//전체 원에서 차지할 비율
	Color color;
	public Slice(double value, Color color) 
	{
		this.value = value; 
		this.color = color;
	}
}

class MyPanel extends JPanel
{
	//위에서 선언한 Slice 클래스의 객체 배열
	Slice[] list = {
			new Slice(10, Color.red), new Slice(20, Color.blue),
			new Slice(30, Color.orange), new Slice(40, Color.green)
	};
	//그림 그릴 때 선언 해야 하는 것
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g); 
		double total = 0.0;
		for (Slice s : list)
			total += s.value;
		
		double currValue = 0.0; 
		int start = 0;
		
		for (Slice s : list) {
			//시작 위치
			start = (int) (currValue * 360 / total); 
			//움직일 각
			int angle = (int) (s.value * 360 / total);
			
			g.setColor(s.color);
			g.fillArc(100, 50, 200, 200, start, angle); 
			//시작 위치(바로 앞에서 그린 파이의 마지막 위치)
			currValue += s.value;
		}
	}
}


public class PieChart extends JFrame
{
	public PieChart() 
	{
		setSize(600, 300); 
		setTitle("Pie Chart"); 
		add(new MyPanel()); 
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{ 
		PieChart c = new PieChart();
	}

}
