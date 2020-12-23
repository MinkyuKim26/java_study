import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mile_to_Killo extends JFrame implements ActionListener {

	JPanel panel;
	JTextField input_text_field;
	JTextField output_text_field;
	JButton button;
	JLabel label;
	
	public Mile_to_Killo()
	{
		setSize(400, 100);//이거 설정 안하면 default가 0,0라 아무것도 안나옴
		setTitle("mile to killo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		JLabel text = new JLabel("마일을 입력하시오");
		input_text_field = new JTextField(20);
		output_text_field  = new JTextField(20);
		JLabel mark = new JLabel(" => ");
		output_text_field.setEditable(false);
		button = new JButton("변환");
		button.addActionListener(this);//리스너를 반드시 추가해줄 것
		
		panel.add(text);
		panel.add(input_text_field);
		panel.add(mark);
		panel.add(output_text_field);
		panel.add(button);
		
		add(panel);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mile_to_Killo f = new Mile_to_Killo();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button)
		{
			double killo = Integer.parseInt(input_text_field.getText()) * 1.609344;
			output_text_field.setText(killo + " km");
		}
	}
}
