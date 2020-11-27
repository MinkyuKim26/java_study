import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

//콤보박스 : 여러 항목 중에서 하나를 선택하는데 사용. 텍스트 필드 + 리스트
//콤보박스의 텍스트를 직접 입력할 수 있고 리스트에서 선택할 수 있다.
//텍스트 필드를 선택 불가로 해놓는 경우에는 리스트에서 선택만 가능
//콤보박스 생성 -> 항목 추가(addItem() 사용) - 생성자의 인수로 배열을 넘기면 배열 원소가 콤보 박스의 항목이 됨.
//getSelecteditem() : 콤보 박스로부터 사용자가 선택한 항목을 가져올 때 사용
//Object타입으로 반환 -> 형변환해서 사용 예) String name = (String) cb.getSelectedItem();

public class ComboBox extends JFrame implements ActionListener {
	private JLabel label;
	
	public ComboBox()
	{
		setTitle("콤보 박스"); 
		setSize(400, 300);
		
		String[] animals = { "dog", "lion", "tiger"};
		JComboBox animalList = new JComboBox(animals); //생성자의 인수로 배열을 넘김 -> 배열 원소가 콤보 박스의 항목이 됨.
		animalList.setSelectedIndex(0); ///0번 항목(이 경우는 dog)을 선택된 상태로 지정.
		animalList.addActionListener(this);
		
		label = new JLabel(); 
		label.setHorizontalAlignment(JLabel.CENTER); 
		changePicture(animals[animalList.getSelectedIndex()]);//콤보박스의 선택에 따라 보여주는 사진이 다름
		
		add(animalList, BorderLayout.NORTH); //위에는 콤보박스 
		add(label, BorderLayout.CENTER); //중간에는 사진
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{ 
		JComboBox cb = (JComboBox) e.getSource(); 
		String name = (String)cb.getSelectedItem(); 
		changePicture(name);
	}
	
	//사진 변경 메소드
	public void changePicture(String name) 
	{ 
		ImageIcon icon = new ImageIcon(name + ".gif"); 
		label.setIcon(icon);
		if (icon.getImageLoadStatus() == MediaTracker.COMPLETE) 
		{ 
			label.setText(null);
		}
		else 
		{
			label.setText("이미지가 발견되지 않았습니다.");
		} 
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComboBox frame=new ComboBox();
	}

}
