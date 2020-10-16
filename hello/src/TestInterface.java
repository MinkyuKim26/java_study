//추상 메소드로 이루어진 인터페이스. 인터페이스 안에서 필드(변수)는 선언될 수 없다. 
//상수는 정의 가능
interface Drawable
{
	void draw();
}
//인터페이스 Drawable를 구현하는 Circle_interfaceI클래스. 인터페이스에서 선언한 draw()를 반드시 재정의 해야한다. 
class Circle_interfaceIn implements Drawable
{
	int radius;
	public void draw()
	{
		System.out.println("Circle Draw");
	}
}

//상속도 하고 인터페이스도 구현
class Circle_interface_Inherit extends Shape implements Drawable
{
	int radius;
	public void draw()
	{
		System.out.println("Circle Draw");
	}
}

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable obj = new Circle_interfaceIn();
		obj.draw();//"Circle Draw"
		
	}

}
