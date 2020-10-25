package mid_exam;

// My Java Program created by Hong, Gil-Dong

class A 
{
	public int n = 1;
	public void print()
	{
		System.out.println("A");
	}
}

class B extends A 
{
	public int n = 2;
	public void print()
	{
		System.out.println("B");
	}

} 

class C extends B
{
	public int n = 3;
	public void print()
	{
		System.out.println("C");
	}

} 

public class Test 
{
	public static void main(String[] args) 
	{
		C c = new C();
		B b = c;
		A a = b;
		System.out.println(a.n);
		System.out.println(b.n);
		System.out.println(c.n);
		
		a.print();
		b.print();
		c.print();
	}
}