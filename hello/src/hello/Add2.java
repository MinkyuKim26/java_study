package hello;

import java.util.Scanner;

public class Add2 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);//Scanner 클래스 객체 생
		int x;
		int y;
		int sum;
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		x = input.nextInt();//Scanner 클래스 내부의 메서드 호출
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		y = input.nextInt();//Scanner 클래스 내부의 메서드 호출
		
		sum = x+y;
		
		System.out.println(sum);
	}
}
