
//클래스 시작은 대문자
public class AreaTest {

	public static void main(String args[])//args : main의 매개변수
	{
		final double PI = 3.141592;
		double radius, area;
		
		radius = 5.0;
		area = PI * radius * radius;
		System.out.println("반지름이 5인 원의 면적은 "+area);
		//클래스 System에 정의된 클래스 out에 정의된 println 호출
		//println() : 출력 후 줄바꿈
		//print() : 출력만
	}
	//메소드 사용 : 클래스 통해 접근
}
