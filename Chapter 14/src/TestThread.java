//스레드 2개 생성

class MyRunnable_2 implements Runnable//Runnable 인터페이스 반영
{ 
	String myName;
	public MyRunnable_2(String name) { myName = name; } //생성자
	public void run() //run() 정의(인터페이스로 포함시켰으니 무조건 정의해야한다.)
	{
		for (int i = 10; i >= 0; i--) System.out.print(myName + i + " ");
	} 
}

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyRunnable_2("A")); 
		Thread t2 = new Thread(new MyRunnable_2("B")); 
		
		//동시에 작업 -> 동시에 출력됨. 
		t1.start();
		t2.start();
	}

}
