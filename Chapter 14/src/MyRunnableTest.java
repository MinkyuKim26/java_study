//Runnable 인터페이스 구현
//인터페이스 포함 후 run() 작성한 MyRunnable클래스 생성(인터페이스 구현) 
//-> Thread 객체로 MyRunnable 객체 받기. -> start() 호출
class MyRunnable implements Runnable 
{ 
	public void run() 
	{
		for (int i = 10; i >= 0; i--) System.out.print(i + " ");
	} 
}

public class MyRunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new MyRunnable()); 
		t.start();
	}

}
