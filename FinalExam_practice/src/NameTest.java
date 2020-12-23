import java.util.*;

class myRunnable implements Runnable
{
	String name;
	public myRunnable(String name)
	{
		this.name = name;
	}
	public void run()
	{
		for(int i = 1; i<= 10; i++)
		{
			System.out.print(name + i);
		}
	}
}

public class NameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th1 = new Thread(new myRunnable("A"));
		Thread th2 = new Thread(new myRunnable("B"));
		Thread th3 = new Thread(new myRunnable("C"));
		
		//얘는 for문이 돌아가는게 아니다! run()에 for문 넣자. 
		//run()이 아니라 start()를 써야한다. 
		th1.start();
		th2.start();
		th3.start();
	}

}
