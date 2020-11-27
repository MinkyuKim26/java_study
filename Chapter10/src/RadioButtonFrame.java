import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;


//라디오 버튼(체크박스와 비슷하지만 하나의 그룹 안에서 한 개의 버튼만 선택 가능)
//JRadioButton(라디오 버튼)과 ButtonGroup(버튼들 그루핑)이 필요
//구현 순서 : 라디오 버튼 생성 -> ButtonGroup객체 생성 -> ButtonGroup객체에 라디오 버튼 추가
//라디오 버튼 이벤트는 액션 이벤트로 처리 isSelected() : 라디오 버튼이 눌러졌는지 검사할 때 사용. doClick() : 강제적으로 어떤 버튼을 선택되게 할 때 사용
public class RadioButtonFrame extends JFrame implements ActionListener
{

	private JRadioButton small, medium, large; 
	private JLabel text;
	private JPanel topPanel, sizePanel, resultPanel;
	
	public RadioButtonFrame() 
	{
		setTitle("라디오 버튼 테스트"); 
		setSize(300, 150);
		
		//제목
		topPanel = new JPanel();
		topPanel.add(new JLabel("어떤 크기의 커피를 주문하시겠습니까?")); 
		add(topPanel, BorderLayout.NORTH);
		
		//내용(라디오 버튼) 
		sizePanel = new JPanel();
		//생성할 때 문자열 넣으면 라디오 버튼 옆에 문자열 추가
		small = new JRadioButton("Small Size"); 
		medium = new JRadioButton("Medium Size"); 
		large = new JRadioButton("Large Size");

		//버튼 그룹에 추가
		ButtonGroup size = new ButtonGroup(); 
		size.add(small);
		size.add(medium);
		size.add(large);
		
		//각 버튼에 리스너 추가(이 객체에서 선언한 리스너)
		small.addActionListener(this); 
		medium.addActionListener(this); 
		large.addActionListener(this);
		
		//라디오 버튼 추가
		sizePanel.add(small); 
		sizePanel.add(medium); 
		sizePanel.add(large);
		add(sizePanel, BorderLayout.CENTER);
		
		//하단에 반응용으로 만든 라벨
		resultPanel = new JPanel();
		text = new JLabel("크기가 선택되지 않았습니다."); 
		text.setForeground(Color.red);
		
		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH); 
		
		setVisible(true);
		
	}
	
	//각 라디오 버튼이 눌러졌을 때 이벤트 함수 호출
	public void actionPerformed(ActionEvent e) 
	{ 
		if (e.getSource() == small) 
		{
			text.setText("Small 크기가 선택되었습니다."); 
		}
		if (e.getSource() == medium) 
		{
			text.setText("Medium 크기가 선택되었습니다.");
		}
		if (e.getSource() == large) 
		{
			text.setText("Large 크기가 선택되었습니다."); 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonFrame();
	}

}
