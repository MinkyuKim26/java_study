import java.util.*;


public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fact = 1;
		int n;
		
		System.out.printf("정수를 입력하시오 :");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i = 1; i<= n; i++)
		{
			fact = fact * i;
		}
		
		System.out.printf("%d!는 %d입니다.", n, fact);
	}

}
