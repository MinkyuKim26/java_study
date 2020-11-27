import java.awt.*;
import java.awt.event.*; //이벤트(마우스 클릭, 키보드 이동 등)
import javax.swing.*;


public class TextFieldFrame extends JFrame{
	private JButton button;
	private JTextField text, result;
	
	public TextFieldFrame()
	{
		setSize(300, 150);
		setTitle("제곱 계산하기");
		
		ButtonListener listener = new ButtonListener();
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력 : "));
		text = new JTextField(15);
		text.addActionListener(listener);
		panel.add(text);
		
		panel.add(new JLabel("제곱한 값"));
		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		button = new JButton("OK");
		button.addActionListener(listener);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
	
	//텍스트 필드와 버튼의 액션 이벤트 처리
	class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//버튼이나 텍스트에서 이벤트가 발생
			if(e.getSource() == button || e.getSource() == text)
			{
				String name = text.getText();
				int value = Integer.parseInt(name); //문자열 -> 정수
				result.setText("" + value*value); //결과값에 제곱한거 넣어주기
				text.requestFocus(); // 키 이벤트를 받을 컴포넌트를 강제로 설정(입력을 기다리게 만듬. 저기에 그 있잖아 깜빡이면서 입력 기다리는거) 
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextFieldFrame t = new TextFieldFrame();
	}

}
