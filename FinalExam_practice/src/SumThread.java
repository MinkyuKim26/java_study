import java.util.*;

class myRunnable_sum implements Runnable
{
	int[] num_ary;
	int start_idx, end_idx;
	public int sum;
	public myRunnable_sum(int[] num_ary, int start_idx, int end_idx)
	{
		this.num_ary = num_ary;
		this.start_idx = start_idx;
		this.end_idx = end_idx;
		sum = 0;
	}
	
	public void run()
	{
		for(int i = start_idx; i< end_idx; i++)
		{
			sum += num_ary[i];
		}
	}
}

public class SumThread 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		int[] num_ary = new int[100];
		
		for(int i = 0; i< num_ary.length; i++)
		{
			num_ary[i] = i;
		}
		
		myRunnable_sum run_1 = new myRunnable_sum(num_ary, 0, 50);
		myRunnable_sum run_2 = new myRunnable_sum(num_ary, 50, 100);
		
		Thread th_for_half = new Thread(run_1);
		Thread th_bac_half = new Thread(run_2);
		
		th_for_half.start();
		th_bac_half.start();
		
		th_for_half.join();
		th_bac_half.join();
		
		int total = run_1.sum + run_2.sum;
		System.out.println("합계: " + run_1.sum + " + " + run_2.sum + " = " + total);
		
	}

}
