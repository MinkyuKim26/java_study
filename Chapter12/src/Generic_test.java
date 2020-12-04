
//generic : 다양한 종류의 데이터를 처리할 수 있는 작성하는 기법
//클래스 안에서 사용되는 자료형을 구체적으로 명시하지 않고 T와 같은 기호로 적어놓음. 자료형을 클래스의 매개 변수로 만든 것
//탬플릿이라 생각하면 된다.
class Box<T>
{
	private T data;
	private int num;//T가 아니여도 선언은 된다. 생각하면 안되는게 이상한게 아닐까.
	public void set(T data)
	{
		this.data = data;
		num = 1;
	}
	public T get()
	{
		return data;
	}
}

public class Generic_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제네릭 클래스 사용. 객체를 생성할 때 저장할 데이터 타입 결정
		Box<Integer> b1 = new Box<Integer>();//Integer를 저장할 box 객체 생성
		b1.set(100);
		int i = b1.get();
		
		Box<String> b2 = new Box<String>();
		b2.set("Hello World!");
		String s = b2.get();
	}

}
