package Chapter6_prob;

class Circle
{
	protected int r;
	protected int radius;
	public Circle() 
	{
	}
	public Circle(int r) 
	{
		radius = r;
	}
}

public class Pizza extends Circle{

	String Topping;
	
	public Pizza(String _Topping, int radius)
	{
		super(radius); //부모 객체 생성자 호출
		Topping = _Topping;
	}
	public void print()
	{
		System.out.println("피자의 종류 : " + Topping + ", 피자의 크기 : " + super.radius);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza obj = new Pizza("Pepperoni", 20);
		obj.print();
	}

}
