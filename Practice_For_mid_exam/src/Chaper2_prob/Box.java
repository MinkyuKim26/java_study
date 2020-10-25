package Chaper2_prob;

import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int Orange_num = 0;
		System.out.println("type your orange num : ");
		Orange_num = input.nextInt();
		System.out.println("you need " + Orange_num /10 + " box and remain " + Orange_num % 10 + " Oranges");
	}

}
