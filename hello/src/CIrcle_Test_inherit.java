class Shape{
	int x, y;
}
class Circle_inerit extends Shape
{
	int radius;
	public Circle_inerit(int radius)
	{
		this.radius = radius;//자기 자신 클래스의 원소에다 값 대입
		x = 0;
		y = 0;
	}
	double calcArea()
	{
		return 3.14*radius*radius;
	}
}

public class CIrcle_Test_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle_inerit obj = new Circle_inerit(10);
		System.out.println("원의 중심 : (" + obj.x + "," + obj.y + ")");
		System.out.println("원의 면적 : " + obj.calcArea());
	}

}
