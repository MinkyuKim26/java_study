package chapter07;

import java.util.Scanner;

public class DivideByZeroOK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피젯수:");
		
		x = sc.nextInt();
		System.out.print("젯수:");
		y = sc.nextInt();
		
		try//시도
		{
			int result = x/y;	//예외가 발생할 수 있는 문장
		}
		catch(ArithmeticException e)//0으로 나누려는 경우(예외)를 catch
		{
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		
		System.out.println("프로그램은 계속 진행됩니다.");
	}

}
