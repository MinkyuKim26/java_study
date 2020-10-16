class Animal
{
	void eat()
	{
		System.out.println("먹고 있음...");
	}
}

class Dog extends Animal
{
	void eat()//부모 클래스 함수 오버라이딩
	{
		System.out.println("개껌 먹고 있음...");
	}
	
	void berk()//자식 클래스에서 새로 만든 함수
	{
		System.out.println("짖고 있음...");
	}
}
public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.berk();
		d.eat(); // 상속받은 클래스의 함수
	}

}
