package Chaper2_prob;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int get_money, price, tax, remain_money;
		System.out.println("받은 돈 : ");
		get_money = input.nextInt();
		System.out.println("물건 가격 : ");
		price = input.nextInt();
		
		remain_money = get_money - price;
		tax = price /10;
		System.out.println("부가세 : " + tax);
		System.out.println("잔돈 : " + price);
		
	}

}
