import java.util.Scanner;


public class CheckInput {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month;
		do {
			System.out.print("올바른 월을 입력하시오 [1-12]");
			month = input.nextInt();
			
			
		}while(month < 1 || month > 12); //일단 실행문 먼 실행 뒤 코드 판단
	}

}
