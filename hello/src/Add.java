
public class Add //파일명 = 클래스 이름인 클래스가 무조건 하나 존재. 퍼블릭 클래스의 이름은 파일명과 같아야한다.
{
	public static void main(String[] args)//프로그램의 시작과 끝. 
	{
		int x;
		int y;
		int sum;
		x = 100;
		y = 200;
		sum = x+y;
		System.out.print("100과 200의 합="+sum); // 자바에서 .가 많이 쓰임
		sub(x,y);//static메소드는 static메소드만 호출 가능 
	}
	//함수 생성 개수는 제한 없다. 
	static void sub(int a, int b)
	{
		int sub_val = a-b;
		System.out.print("\n100과 200의 ="+sub_val);
	}
}

class Test //하나의 파일에 있는 또다른 클래스는 public 안된다.  
{
	
}
