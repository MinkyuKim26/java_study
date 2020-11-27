import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//퍼즐 게임 클래스
public class Puzzle extends JFrame implements ActionListener {

	private JButton[] ButtonArray;//각 타일에 있는 숫자를 3*3배열로 표시할 것
	//빈칸 박스의 위치 정보(초기값 (3,3))
	private int empty_button_loc_x = 3;
	private int empty_button_loc_y = 3;
	
	public Puzzle()
	{
		ButtonArray = new JButton[9]; //3*3 배열 버튼
			
		setTitle("Puzzle"); 
		setSize(600, 630);
		
		JPanel puzzlePanel = new JPanel();
		puzzlePanel.setLayout(new GridLayout(3, 3));
		
		//박스에 설정할 폰트
		Font f = new Font("Times New Roman", Font.PLAIN, 30);
		
		//1~8 + 빈칸 버튼 생성
		for(int i = 0; i< 9; i++)
		{		
			if(i != 8)
			{
				String num_str = Integer.toString(i + 1);
				ButtonArray[i] = new JButton(num_str);
				
			}
			else
				ButtonArray[i] = new JButton();
					
			ButtonArray[i].addActionListener(this);
			ButtonArray[i].setFont(f);
			puzzlePanel.add(ButtonArray[i]);
			
		}
		add(puzzlePanel, BorderLayout.CENTER);
		
		//밑에 reset버튼
		JButton reset_button = new JButton("reset");
		reset_button.addActionListener(this);
		add(reset_button, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		JButton touched_button = (JButton)e.getSource(); //눌려진 버튼
		
		
		String Check_str = touched_button.getText();
		
		if(!(Check_str == "" || Check_str == "reset"))
		{
			//누른 버튼에 들어있던 값
			int touched_button_num = Integer.parseInt(touched_button.getText());
			
			//인덱스 번호 추출
			int touched_button_idx = -1;
			for(int i = 0; i< 9; i++)
			{
				if(i != (empty_button_loc_x + 3 * (empty_button_loc_y - 1) - 1 ) &&   touched_button_num == Integer.parseInt(ButtonArray[i].getText()))
				{		
					touched_button_idx = i;
				}
				if(touched_button_idx != -1)
					break;
			}
			
			int touched_button_x = (touched_button_idx+1)% 3; //1~3
			int touched_button_y = (int)((touched_button_idx+1)/ 3) + 1; //1~3
			if(touched_button_x == 0) //나머지가 0이다 -> 3,6,9 = x값은 3
			{
				touched_button_x = 3;
				touched_button_y --; //3,6,9 이므로 3 위치에서 (3,1)이 아닌 (3,2)가 나옴 -> 1 줄여줌
			}
			
			//거리의 제곱을 구함. 1의 제곱은 1이므로 거리의 제곱이 1인 경우에만 박스 위치를 바꿔줌
			double distance_from_emptyBox_square = 
					Math.pow(touched_button_y - empty_button_loc_y, 2) + Math.pow(touched_button_x - empty_button_loc_x, 2);
			
			if(distance_from_emptyBox_square == 1)
			{
				//버튼 위치 스왑
				String button_num_str = Integer.toString(touched_button_num); // 숫자를 문자열로 변환
				ButtonArray[touched_button_idx].setText(""); //내가 누른 버튼은 빈칸으로
				ButtonArray[empty_button_loc_x + 3 * (empty_button_loc_y - 1) - 1].setText(button_num_str);//원래 빈칸이었던 곳은 숫자로 채워주고
				
				//빈박스의 좌표값 수정
				empty_button_loc_x = touched_button_x;
				empty_button_loc_y = touched_button_y;
			}
		}
		else if(Check_str == "reset")
		{
			for(int i = 0; i< 9; i++)
			{	
				if(i != 8)
				{
					String num_str = Integer.toString(i + 1);
					ButtonArray[i].setText(num_str);
				}
				else
					ButtonArray[i].setText(null);
			}
			
			empty_button_loc_x = 3;
			empty_button_loc_y = 3;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puzzle t = new Puzzle();
	}

}
