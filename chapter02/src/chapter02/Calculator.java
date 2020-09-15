package chapter02;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int get_money, val_obj;//받은 돈, 상품 가격
		int tax, change;//부가세, 잔돈
		
		System.out.print("받은 돈: ");
		get_money = input.nextInt();
		System.out.print("상품 가격: ");
		val_obj = input.nextInt();
		tax = val_obj / 10;
		change = get_money - val_obj;
		
		System.out.println("부가세: " + tax);
		System.out.println("잔돈: " + change);
	}

}
