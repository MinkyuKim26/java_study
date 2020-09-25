class Circle
{
	int radius;
	String color;
	
	public Circle(int radius)
	{
		this.radius = radius;//this 객체는 매개변수 이름과 필드이름 구별 위해 사용
	}
	public Circle()
	{
		this(0); //Circle(0) 호출. 복잡한 생성자 작성 후 다른 생성자가 그 생성자(복잡한 생성자)를 호출 
	}
	
	void setRadius(int r)
	{
		radius = r;
	}
	
	double calcArea()
	{
		return 3.14 * radius * radius;
	}
	
	void print()
	{
		System.out.println("원의 반지름:"+radius);
		System.out.println("원의 면적:"+calcArea());
	}
	
	
}

public class CircleTest {
	public static void main(String[] args)
	{
		Circle obj;
		obj = new Circle();
		obj.setRadius(100);
		obj.color = "blue";
		obj.print();
	}
}
