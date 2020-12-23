//동기화 문제
//스레드로 인한 문제
//스레드 간섭(thread interference) : 다수의 스레드가 공유된 데이터에 접근할 때 발생 
//하나의 스레드가 공유 데이터값을 변경하고 있는 중간에 다른 스레드가 끼어들면 예상치 못한 결과가 나타난다. 
//메모리 일치 오류(memory consistency error) : 공유된 메모리의 불일치가 나타나는 현상

//동기화(synchronization) : 공유된 자원 중에서 동시에 사용하면 안되는 자원을 보호하는 도구 
//한 번에 하나의 스레드만이 공유 데이터를 접급할 수 있도록 제어. 하나의 스레드의 작업이 끝나면 다믕 스레드가 사용할 수 있게 한다.

//임계 영역(critical section)
//동기화의 대상 부분
//공중 화장실 등에서 하나의 사용자가 사용하고 있으면 다른 사용자는 사용이 끝날 때까지 기다리기

//인터페이스 구현하는 방법을 더 많이 사용 -> 스레드를 상속받아서 쓰는 방식은 또다시 상속할 수 없는데 
//인터페이스 구현하면 상속을 받을 수 있어 활용 방안이 더 많기 때문.

//카운터 클래스
class Counter 
{
	private int value = 0;
	//동기화된 메소드(synchronized methods) : 동시에 사용하면 안되는 함수
	//한 번에 하나의 스레드만 공유 데이터에 접근(하나의 스레드의 사용이 끝나야 다음 스레드가 사용
	public synchronized void increment()
	{
		value++;
	}
	public synchronized void decrement() 
	{
		value--;
	}
	public synchronized void printCounter() 
	{
		System.out.println(value);
	}
	
}

class MyThread_Counter extends Thread 
{
	Counter sharedCounter;
	public MyThread_Counter(Counter c) //생성자
	{ 
		this.sharedCounter = c;//초기값 갖고 생성
	}
	public void run() 
	{
		int i = 0;
		while (i < 20000) 
		{
			sharedCounter.increment();
			sharedCounter.decrement();
			
			if (i % 40 == 0)
				sharedCounter.printCounter();
			try 
			{
				sleep((int) (Math.random() * 2)); 
			} 
			catch (InterruptedException e) { } //예외 발생시
			i++;
		}
	}
}

public class CounterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c = new Counter();
		new MyThread_Counter(c).start();
		new MyThread_Counter(c).start();
		new MyThread_Counter(c).start();
		new MyThread_Counter(c).start();
		//synchronized를 안했을 때 : 동시에 접근해 값이 막 올라감.
		//synchronized 사용 : 하나씩 사용 -> 값이 0,1만 나옴.
	}

}
