package Chapter3_prob;
import java.util.Scanner;
public class FIbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int fibo_num;
		System.out.print("출력할 항의 개수 : ");
		fibo_num = input.nextInt();
		
		int n_prev = 0, n = 1, n_next;
		
		System.out.print("0 1");
		
		for(int i = 3; i <= fibo_num; i++)
		{
			n_next = n_prev + n;
			System.out.print(" "+n_next);
			n_prev = n;
			n = n_next;
		}
	}

}
