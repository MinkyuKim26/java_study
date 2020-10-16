class Rect_Shape
{
	protected int x, y;
	void print()
	{
		System.out.println("x좌표 : " + x + "y좌표:" + y);
	}
}

public class Rectangle extends Rect_Shape{
	
	int width, height;
	
	public Rectangle()
	{
		super(); //명시적 호출. 자식 클래스의 생성자에서 명시적으로 부모 클래스의 생성자를 호출할 수 있댜. 
		//이 때 super() 키워드 사용
		//명시적으로 수퍼 클래스의 작성자를 호출하지 않으면 자동적으로 수퍼클래스의 디폴트 생성자가 호출.
		//수퍼 클래스 : 부모 클래스
		System.out.println("Rectangle 생성자()");
	}
	
	
	
	double calcArea()
	{
		return width * height;
	}
	void draw()
	{
		//protect로 설정된 x, y를 사용. 부모-자식인 관계라 protect인 변수, 함수들 사용 가능
		System.out.println("(" + x + ", " + y + ") 위치에 " + "가로 : " + width + " 세로 : " + height);
	}
}
