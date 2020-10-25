package mid_exam;

class A_8 
{
	public A_8() 
	{
		System.out.println("A"); 
	}
	public A_8(int x) 
	{ 
		System.out.println("A" + x);
	} 
}

class B_8 extends A_8 
{
	public B_8(int x) 
	{
		System.out.println("B" + x); 
	}
}

public class Test1 
{
	public static void main(String[] args) 
	{ 
		A_8 a = new A_8(10);
		B_8 b = new B_8(20);
	} 
}

