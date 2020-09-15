package chapter02;

import java.util.Scanner;

public class Add {
	public static void main(String[] argv)
	{
		Scanner input = new Scanner(System.in);
		 int x;
		 int y;
		 int z;
		 int sum;
		 
		System.out.print("첫번째 값: ");
		x = input.nextInt();
		System.out.print("두번째 값: ");
		y = input.nextInt();
		System.out.print("세번째 값: ");
		z = input.nextInt();
		
		sum = x+y+z;
		
		System.out.println(x +"+"+ y +"+" +z +"="+sum);
		
	}

}
