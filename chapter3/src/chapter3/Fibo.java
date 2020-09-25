package chapter3;

import java.util.*;

public class Fibo {
	
	public static void main(String[] args)
	{
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.print("출력할 항의 개수: ");
		num =input.nextInt();
		
		int[] Fibo_ary = new int[num];
		Fibo_ary[0] = 0; Fibo_ary[1] = 1;
		
		
		for(int i = 2; i< num; i++)
		{
			Fibo_ary[i] = Fibo_ary[i-1] +  Fibo_ary[i-2];
		}
		
		for(int i = 0; i< num; i++)
		{
			System.out.printf("%d ", Fibo_ary[i]);
		}
		
	}
	
}
