import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

class MyJob implements Runnable
{
	public void run()
	{
		try
		{
			System.out.print("A");
			Thread.sleep(1000);
			System.out.print("B");
		}
		 catch (InterruptedException e) {
			 System.out.print("C");
		 }
		System.out.print("D");
	}
}

public class Final_Exam extends JFrame implements ActionListener
 {
	Font f;
	JButton b;
	
	//그림 그리기 전용
	class MyPanel extends JPanel 
	{
		//그림 그릴 때 사용
		public void paintComponent(Graphics g) 
		{ 
			super.paintComponent(g);
		}
	}
	
	//버튼 누르기
	public void actionPerformed(ActionEvent e) 
	{ 
		//b.addActionListener(l);
	}
	public Final_Exam()
	{
		setSize(400, 150);
		setTitle("Exam");
		
		JPanel panel = new JPanel();
		panel.addKeyListener(new KeyListener()
		{
			public void keyPressed(KeyEvent e)
			{
				int keycode = e.getKeyCode();//뭐 눌렀니?
				//...
			}
			public void keyReleased(KeyEvent e) { }
			public void keyTyped(KeyEvent e) { }
			
		});
		panel.addMouseListener(new MouseListener()
		{
			public void mousePressed(MouseEvent e)
			{
				//마우스 좌표
				e.getX();
				e.getY();
			}
			public void mouseReleased(MouseEvent e)
			{
				
			}
			public void mouseEntered(MouseEvent e)
			{
				
			}
			public void mouseExited(MouseEvent e)
			{
				
			}
			public void mouseClicked(MouseEvent e)
			{
				
			}
		});
		
		
		
		f = new Font("Dialog", Font.BOLD | Font.ITALIC, 30);
		JLabel test = new JLabel();
		test.setFont(new Font("Serif", Font.PLAIN, 20));
	}
	
	public static void main(String[] args) throws IOException
	{ 
		
		ArrayList<String> list = new ArrayList
				<String>();
		BufferedReader br = null;
		PrintWriter pr = null;
		
		try
		{
			br = new BufferedReader
					(new FileReader("input.txt"));
			pr = new PrintWriter(new
					FileWriter("output.txt"));
			while(true)
			{
				String line = br.readLine();
				if (line == null)
				{
					break;
				}
				list.add(line);
			}
			Collections.sort(list);
			for (int i = 0; i < list.size(); i++)
				pr.println(list.get(i));
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(br != null)
			br.close();
			if(pr!=null)
			pr.close();

		}
	}
}
