class A
{
	private int a; //클래스 내부만 접근
	int b;//클래스, 패키지에서 접근
	public int c;//모든 곳에서 접근
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		
		//obj.a = 10; //접근 불가능
		obj.b = 20; //디폴트 멤버는 접근 가능
		obj.c = 30; //공용 멤버는 접근 가능
	}

}
