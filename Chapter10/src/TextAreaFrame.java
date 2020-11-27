import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

//텍스트 영역 : 여러줄의 텍스트가 들어갈 수 있는 컴포넌트
//스크롤 페인(Scroll pane) : 컴포넌트에 스크롤 기능 제공. 스크롤 기능을 추가하려면 스크롤 페인에 컴포넌트 추가

public class TextAreaFrame extends JFrame implements ActionListener{
	
	private JTextField textField; 
	private JTextArea textArea;
	
	public TextAreaFrame() 
	{
		setTitle("Text Area Test"); 
		setSize(400, 150);
		
		textField = new JTextField(30); 
		textField.addActionListener(this);
		
		//텍스트 영역(입력한 글자 보여줄거)
		textArea = new JTextArea(10, 30); //10열 30행의 크기로.
		textArea.setEditable(false);
		
		//스크롤 페인(이 경우에는 textArea에 스크롤 기능 추가)
		JScrollPane scrollPane = new JScrollPane(textArea); 
		
		//위쪽에 키보드 입력받는 텍스트 필드 추가
		add(textField, BorderLayout.NORTH);
		//글자 보여줄 곳(scrollPane) 추가
		add(scrollPane, BorderLayout.CENTER); 
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{ 
		//키보드 입력 받는 이벤트 처리
		String text = textField.getText(); 
		textArea.append(text + "\n"); //입력 받은거 텍스트 영역에 추가
		textField.selectAll();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextAreaFrame();
	}

}
