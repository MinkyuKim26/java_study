
public class TypeConversion {
	public static void main(String args[])
	{
		int i;
		double f;
		
		f = 5/4; //정수끼리 나누기 -> 소숫점 나가리 -> 나가리된 값이 double 변수에 들어
		System.out.println(f);//1.0
		
		f = (double)5/4;
		System.out.println(f);//1.25
		
		i = (int)1.3 + (int)1.8;
		System.out.println(i);//2
	}
}
