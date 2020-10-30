import java.util.Scanner;

class Theater
{
	private int[] chair_A;
	private int[] chair_B;
	
	//디폴트 생성자
	public Theater()
	{
		//정수 배열은 별다른 명시가 없으면 0으로 초기화
		chair_A = new int[10];
		chair_B = new int[10];
		
	}
	//filled_chair_num만큼 각 랭크별 좌석을 랜덤으로 채운 상태로 극장 객체 생성하는 생성자
	public Theater(int filled_chair_num)
	{
		//음수로 값이 들어올 경우 양수로 바꿔줌
		if(filled_chair_num < 0) filled_chair_num *= -1;
		
		chair_A = new int[10];
		chair_B = new int[10];
		//입력값이 5이하일 경우 -> 빈자리를 채우는 알고리즘으로
		if(filled_chair_num <=5)
		{
			//filled_chair_num개의 랜덤한 좌석에 자리를 채우기
			for(int i = 0; i< filled_chair_num; i++)
			{
				System.out.println("asdf1");
				int ran_num_a = 0;
				int ran_num_b = 0;
				
				while(true)
				{
					ran_num_a = (int)((Math.random()*10000)%9);
					if(chair_A[ran_num_a] == 0)
						break;
				}
				while(true)
				{
					ran_num_b = (int)((Math.random()*10000)%9);
					if(chair_B[ran_num_b] == 0)
						break;
				}
				chair_A[ran_num_a] = 1;
				chair_B[ran_num_b] = 1;
			}
		}
		//입력값이 5보다 클 경우 -> 채워진 자리를 비우는 알고리즘으로
		else
		{
			for(int i = 0; i< 10; i++)
			{
				chair_A[i] = 1;
				chair_B[i] = 1;
			}
			
			//filled_chair_num개의 랜덤한 좌석에 자리를 채우기
			for(int i = 0; i< (10 -filled_chair_num); i++)
			{
				System.out.println("asdf1");
				int ran_num_a = 0;
				int ran_num_b = 0;
				
				while(true)
				{
					ran_num_a = (int)((Math.random()*10000)%9);
					if(chair_A[ran_num_a] == 1)
						break;
				}
				while(true)
				{
					ran_num_b = (int)((Math.random()*10000)%9);
					if(chair_B[ran_num_b] == 1)
						break;
				}
				chair_A[ran_num_a] = 0;
				chair_B[ran_num_b] = 0;
			}
		}
	}
	//예약
	public void reservation(Scanner sc)
	{
		int want_chair_rank = 0, want_chair_num = 0;
		show_reservation_info();
		System.out.println("좌석 예약을 진행합니다.");
		boolean isReserve = false, isRankOK = false, isNumOK = false;
		
		//예약을 완료할 때까지 무한반복
		while(!isReserve)
		{
			//올바른 값을 입력할 때까지 계속해서 입력을 받는다.
			do {
				System.out.print("좌석 등급을 선택하세요(A석:1, B석:2):");
				want_chair_rank = sc.nextInt();
				//1,2사이 값을 입력받지 않은 경우
				if(want_chair_rank < 1 || want_chair_rank > 2)
					System.out.println("다시 입력하세요.");
				else
					isRankOK = true;
			}while(!isRankOK);
			
			do {
				System.out.print("좌석 번호를 선택하세요(1~10):");
				want_chair_num = sc.nextInt();
				//1~10사이 값을 입력받지 않은 경우
				if(want_chair_num < 1 || want_chair_num > 10)
					System.out.println("다시 입력하세요.");
				else
					isNumOK = true;
			}while(!isNumOK);
			
			//입력 받은 값으로 좌석 예약. 만약 예약된 자리였을 경우 다시 예약하게 만든다.
			switch(want_chair_rank)
			{
				case 1: 
					if(chair_A[want_chair_num-1] == 0)
					{
						chair_A[want_chair_num-1] = 1;
						show_num_and_line();
						show_info_A();
						System.out.println("예약되었습니다.");
						isReserve = true;
					}
						
					else
						System.out.println("이미 예약된 자리입니다. 다시 예약해주세요.");
					break;
				case 2: 
					if(chair_B[want_chair_num-1] == 0)
					{
						chair_B[want_chair_num-1] = 1;
						show_num_and_line();
						show_info_B();
						System.out.println("예약되었습니다.");
						isReserve = true;
					}	
					else
						System.out.println("이미 예약된 자리입니다. 다시 예약해주세요.");
					break;
			}
		}
	}
	//조회
	public void Inquiry()
	{
		show_num_and_line();
		show_info_A();
		show_info_B();
	}
	//취소
	public void Cancel(Scanner sc)
	{
		int cancel_chair_rank = 0, cancel_chair_num = 0;
		show_reservation_info();
		System.out.println("좌석 취소를 진행합니다.");
		boolean isCancel = false, isRankOK = false, isNumOK = false;
		
		//취소를 완료할 때까지 무한 반복
		while(!isCancel)
		{	
			//올바른 값을 입력할 때까지 입력을 받는다.
			do {
				System.out.print("좌석 등급을 선택하세요(A석:1, B석:2):");
				cancel_chair_rank = sc.nextInt();
				//1,2사이 값을 입력받지 않은 경우
				if(cancel_chair_rank < 1 || cancel_chair_rank > 2)
					System.out.println("다시 입력하세요.");
				else 
					isRankOK = true;
			}while(!isRankOK);
			
			do {
				System.out.print("좌석 번호를 선택하세요(1~10):");
				cancel_chair_num = sc.nextInt();
				//1~10사이 값을 입력받지 않은 경우
				if(cancel_chair_num < 1 || cancel_chair_num > 10)
					System.out.println("다시 입력하세요.");
				else
					isNumOK = true;
			}while(!isNumOK);
			
			//입력받은 값으로 취소. 만약 예약이 안된 자리를 취소한다고 했을 경우 처음부터 다시 취소를 진행시킨다. 
			switch(cancel_chair_rank)
			{
				case 1: 
					if(chair_A[cancel_chair_num-1] == 1)
					{
						chair_A[cancel_chair_num-1] = 0;
						show_num_and_line();
						show_info_A();
						System.out.println("취소되었습니다.");
						isCancel = true;
					}
						
					else
						System.out.println("예약이 안된 자리입니다. 다시 진행해주세요.");
					break;
				case 2: 
					if(chair_B[cancel_chair_num-1] == 1)
					{
						chair_B[cancel_chair_num-1] = 0;
						show_num_and_line();
						show_info_B();
						System.out.println("취소되었습니다.");
						isCancel = true;
					}	
					else
						System.out.println("예약이 안된 자리입니다. 다시 진행해주세요.");
					break;
			}
		}
	}
	
	//좌석 현황을 보여주는 함수
	void show_reservation_info()
	{
		System.out.println("좌석 예약 현황입니다. (빈좌석:0, 예약좌석:1)");
		show_num_and_line();
		show_info_A();
		show_info_B();
		System.out.println();
	}
	//'--'와 숫자를 출력
	void show_num_and_line()
	{
		System.out.println("-------------------------");
		System.out.println("     1 2 3 4 5 6 7 8 9 10");
		System.out.println("-------------------------");
	}
	//A좌석의 현황을 출력
	void show_info_A()
	{
		System.out.print("A석: ");
		for(int i = 0; i < chair_A.length; i++)
		{
			System.out.print(chair_A[i]+" ");
		}
		System.out.println();
		System.out.println("-------------------------");
	}
	//B좌석의 현황을 출력
	void show_info_B()
	{
		System.out.print("B석: ");
		for(int i = 0; i < chair_B.length; i++)
		{
			System.out.print(chair_B[i]+" ");
		}
		System.out.println();
		System.out.println("-------------------------");
	}
}


public class TheaterTest {

	public static void main(String[] args)
	{
		//극장 클래스 객체 생성
		Theater theater = new Theater();
		//스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		//1,2,3,4입력받을 변수 생성
		int input_num = 0;
		//while문에 사용할 boolean변수들 생성
		boolean isInputOK = false, isLoopExit = false;
		System.out.println("극장 좌석 예약 시스템입니다.");
		//종료하기 전까지 무한 실행
		while(!isLoopExit)
		{
			//값 입력받기
			do{
				System.out.print("번호를 선택하세요(예약:1, 조회:2, 취소:3, 끝내기:4): ");
				input_num = sc.nextInt();
				//값 범위가 1,2,3,4를 넘어갈 경우
				if(input_num < 1 || input_num > 4)
					System.out.println("값을 제대로 입력해주세요.");	
				else
					isInputOK = true;
			}while(!isInputOK);
			//입력받은 값에 따라 다른 함수 실행
			switch(input_num)
			{
			case 1: theater.reservation(sc);
				break;
			case 2: theater.Inquiry();
				break;
			case 3: theater.Cancel(sc);
				break;
			case 4: 
				System.out.println("시스템을 종료합니다.");
				isLoopExit = true;
				break;
			}
			System.out.println();
		}
	}
}
