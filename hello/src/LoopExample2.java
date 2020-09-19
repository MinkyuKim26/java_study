import java.util.*;

public class LoopExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int i = 1;
		System.out.print("출력하고 싶은 구구단의 단은? ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		while(i<=9)
		{
			System.out.println(n + "*" + i + "=" + n * i);
			i++;
		}
	}

}
