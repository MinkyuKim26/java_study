import javax.swing.*;

public class LoginWindow extends JFrame {

	public LoginWindow()
	{
		setTitle("login window");
		setSize(300, 150);
		
		JPanel panel = new JPanel();
		add(panel);
		
		panel.add(new JLabel("id ")); 
		panel.add(new JTextField(20)); 
		panel.add(new JLabel("pass")); 
		panel.add(new JPasswordField(20)); // JPasswordField : 뭐 입력했는지 모르게 만듦.
		
		JButton login = new JButton("login"); 
		panel.add(login);
		
		JButton cancel = new JButton("cancel"); 
		panel.add(cancel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginWindow();
	}

}
