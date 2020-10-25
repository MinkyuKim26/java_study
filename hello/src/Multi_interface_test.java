interface Printable_multi
{ 
	void print();
}

interface Drawable_multi
{
	void draw();
}

//인터페이스 다중 참조로 다중 상속 구현.
//클래스는 하나만 상속되는데 인터페이스는 다중 참조 가능
class Circle_Multi_interface implements Printable_multi, Drawable_multi
{
	public void print() 
	{
		System.out.println("프린터로 원을 출력합니다.");	
	}
	
	public void draw() 
	{
		System.out.println("화면에 원을 그립니다.");
	}

}

public class Multi_interface_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle_Multi_interface obj = new Circle_Multi_interface();
		obj.draw();
		obj.print();
	}

}
