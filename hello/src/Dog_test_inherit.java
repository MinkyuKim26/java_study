class Animal_inherit
{
	void eat()
	{
		System.out.println("동물이 먹고 있습니다.");
	}
	
	void berk()
	{
		System.out.println("동물이 짖고 있습니다.");
	}
}

class Dog_inherit extends Animal_inherit
{
	
	@Override //재정의한 메소드 이름 앞에 붙이는 이름(생략 가능)
	void eat()//부모 클래스 함수 오버라이딩
	{
		System.out.println("강아지가 먹고 있습니다.");
	}
	
	void berk()//자식 클래스에서 오버라이딩한 함수
	{
		super.berk(); //부모 클래스의 berk() 메소드 호출
		System.out.println("짖고 있음...");
	}
}

public class Dog_test_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog_inherit d = new Dog_inherit();
		d.eat();
		d.berk();//자식 클래스의 berk()
	}

}
