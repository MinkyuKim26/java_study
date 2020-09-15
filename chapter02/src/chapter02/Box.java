package chapter02;

import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int orange_num;
		int num_box, num_remain;
		
		System.out.print("오렌지의 개수를 입력하시오: ");
		orange_num = input.nextInt(); 
		num_box = (int)(orange_num / 10);
		num_remain = orange_num % 10;
		
		System.out.println(num_box + "박스가 필요하고 " + num_remain + "개가 남습니다.");
	}

}
