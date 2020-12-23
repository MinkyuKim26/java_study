import javax.swing.*;

public class MyFrame3 extends JFrame{

	public MyFrame3() 
	{
		setSize(600, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Frame3");
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		JLabel title_label_1 = new JLabel("자바 오텔에 오신 것을 환영합니다.");
		JLabel title_label_2 = new JLabel("숙박 일수를 입력하세요.");
		panel1.add(title_label_1);
		panel1.add(title_label_2);
		
		JButton Button1 = new JButton("1일");
		JButton Button2 = new JButton("2일");
		JButton Button3 = new JButton("3일");
		JButton Button4 = new JButton("4일");
		JButton Button5 = new JButton("5일");
		
		
		panel2.add(Button1);
		panel2.add(Button2);
		panel2.add(Button3);
		panel2.add(Button4);
		panel2.add(Button5);
		
		panel3.add(panel1);
		panel3.add(panel2);
		
		this.add(panel3);
		
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyFrame3 m = new MyFrame3();
	}

}
