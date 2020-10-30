package chapter07;

public class TokenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = "I am a boy.".split(" ");
		
		//I
		//am
		//a
		//boy. 
		//출력
		for(String token:tokens) //tokens의 원소값들을 다 token에 넣음. 다 떨어지면 for문 탈출
		{
			System.out.println(token);
		}
		
		//StringBuffer 객체 생성. 얘는 내부적으로 문자열 저장하는 메모리를 갖고있어 문자열 변경에 효율적
		//기존 String 클래스는 새로운 객체 생성하고 기존의 내용을 복사하기에 비효율적
		StringBuffer sb = new StringBuffer("10+20=");
		sb.insert(0, "수식"); //0 위치에 "수식"이라는 데이터 삽입
		
	}

}
