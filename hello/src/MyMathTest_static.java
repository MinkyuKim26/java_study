class MyMath_static
{
	public static int abs(int x )
	{
		return x>0? x: -x;
	}
	public static int power(int base, int exponent)
	{
		int result = 1;
		for(int i = 1; i<= exponent; i++)
		{
			result *=base;
		}
		return result;
	}
}

public class MyMathTest_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10의 3승은 " + MyMath_static.power(10,  3));
	}

}
