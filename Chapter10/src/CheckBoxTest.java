import javax.swing.*;

//체크박스 예제. 체크박스를 클릭하면 ItemEvent가 발생한다. 
//ItemEvent를 처리하려면 ItemListener를 구현해야 한다. 
public class CheckBoxTest extends JFrame{

	public CheckBoxTest()
	{
		setTitle("CheckBox Test");
		setSize(500, 150);
		
		JPanel panel = new JPanel();
		
		// 초기값으로 true 지정 -> 체크된 상태로 초기화. default는 false
		JCheckBox checkbox1 = new JCheckBox("사과", true); 
		JCheckBox checkbox2 = new JCheckBox("바나나");
		JCheckBox checkbox3 = new JCheckBox("포도", true); 
		JCheckBox checkbox4 = new JCheckBox("오렌지"); 
		JCheckBox checkbox5 = new JCheckBox("배", true);
		
		panel.setBorder(BorderFactory.createTitledBorder("과일")); // '과일'이라는 이름의 보더 생성. 경계가 생김.

		panel.add(checkbox1); 
		panel.add(checkbox2); 
		panel.add(checkbox3); 
		panel.add(checkbox4); 
		panel.add(checkbox5);
		
		//체크박스 이벤트 처리 예
//		JCheckBox check = new JCheckBox("Checkbox", false);
//		check.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				System.out.println(“체크상태: ” + check.isSelected());
//			}
//		});
		
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxTest();
	}

}
