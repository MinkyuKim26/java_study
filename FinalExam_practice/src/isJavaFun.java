import javax.swing.*;

public class isJavaFun extends JFrame{
	
	public isJavaFun()
	{
		setSize(400,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창 닫으면 프로그램 종료
		setTitle("My Frame1");
		
		JPanel panel = new JPanel();//캔버스 추가
		JLabel label = new JLabel("자바는 재미있나요?");
		JButton button1 = new JButton("Yes");
		JButton button2 = new JButton("No");
		panel.add(label);
		panel.add(button1);
		panel.add(button2);//캔버스 안에 전부 추가
		add(panel);//캔버스 프레임에 부착
		setVisible(true);//보여주기
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isJavaFun f = new isJavaFun();
	}

}
