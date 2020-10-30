package chapter07;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피젯수:");
		
		x = sc.nextInt();
		System.out.print("젯수:");
		y = sc.nextInt();
		
		int result = x/y;	//예외가 발생할 수 있는 문장
		System.out.println("나눗셈 결과:"+result);
	}

}
