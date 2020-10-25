package Chapter6_prob;

interface Animal
{
	public void walk();
	public void fly();
	public void sing();
	
}

public class Bird implements Animal{ // 상속은 extends, 인터페이스는 implements

	public void walk()
	{
		System.out.println("새가 걷는다.");
	}
	public void fly()
	{
		System.out.println("새가 난다.");
	}
	public void sing()
	{
		System.out.println("새가 노래한다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}

}
