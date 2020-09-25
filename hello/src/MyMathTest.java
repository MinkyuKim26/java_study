class MyMath
{	
	//정수값 제공
	int square(int i)
	{
		return i*i;
	}
	//실수값 제공
	double square(double i)
	{
		return i*i;
	}
}

public class MyMathTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyMath obj = new MyMath();
		System.out.println(obj.square(10));
		System.out.println(obj.square(3.14));
	
	}

}
