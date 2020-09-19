
import java.util.Scanner;

public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오 :");
		int number = input.nextInt();
		
		if(number > 0)
		{
			System.out.println("양수입니다.");
		}
		else if(number == 0)
		{
			System.out.println("0입니다.");
		}
		else
		{
			System.out.println("음수입니다.");
		}
	}

}
