import javax.swing.*;

//메뉴 : 공간을 절약하면서 사용자가 여러가지 옵션 중에서 하나를 선택하게 만드는 방법
//다른 컴포넌트와는 달리 컨테이너 안에 배치되지 않는다.
//메뉴는 메뉴바에 나타나거나 팝업 메뉴로만 나타난다.
//메뉴 항목은 이미지나 텍스트를 가질 수 있다. 
//폰트, 색상 등도 변경이 가능하다. 
//메뉴는 버튼이며 버튼과 같이 누르면 이벤트가 발생한다. 
//메뉴바는 JMenuBar 클래스로 사용할 수 있다. 메뉴바는 프레임에만 부착 가능하며 패널에는 부착할 수 없다. 
//메뉴는 JMenu객체에 의해 표현. 메뉴 항목은 JMenuItem객체로 표현
//메뉴 생성 절차 : 메뉴바 관련 변수 선언 -> 메뉴바 생성 -> 메뉴를 생성 + 메뉴바에 추가 -> 메뉴 항목을 생성 + 메뉴에 추가 -> 프레임에 메뉴바 설정
//메뉴 이벤트 처리 : 각 메뉴 항목에 대해 액션 이벤트 처리(menuItem.addActionListener(this);)
public class MenuTest extends JFrame
{
	public MenuTest()
	{
		setTitle("Menu Test");
		setSize(400, 150);
		
		//메뉴바, 메뉴 생성
		JMenuBar menuBar = new JMenuBar(); 
		JMenu menu = new JMenu("File"); 
		
		//메뉴에 메뉴 항목 추가 
		menu.add(new JMenuItem("Open")); //JMenuItem : 메뉴 항복
		menu.add(new JMenuItem("Save")); 
		menu.add(new JMenuItem("Exit")); 
		menuBar.add(menu);
		
		menuBar.add(new JMenu("Edit")); //메뉴바에 메뉴 추가
		menuBar.add(new JMenu("View")); 
		menuBar.add(new JMenu("Tools")); 
		menuBar.add(new JMenu("Help"));
		
		setJMenuBar(menuBar); //프레임에 메뉴바 설정
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuTest f = new MenuTest();
	}

}
