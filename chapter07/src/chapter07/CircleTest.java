package chapter07;

class Circle
{
	int radius;
	public Circle(int radius)
	{
		this.radius = radius;
	}
	public String toString() //객체의 문자열 표현을 반환
	{
		return "Circle(r = " + radius + ")";
	}
}

public class CircleTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Circle obj1 = new Circle(10);
		Circle obj2 = new Circle(20);
		
		//toString()호출
		System.out.println(obj1); 
		System.out.println(obj2);
		
		if(obj1.equals(obj2))
			System.out.println("2개의 원은 같습니다.");
		else
			System.out.println("2개의 원은 같지 않습니다.");
		
		obj2.radius = 10;
		
		if(obj1.equals(obj2))
			System.out.println("2개의 원은 같습니다.");
		else
			System.out.println("2개의 원은 같지 않습니다.");
	}
	
}


