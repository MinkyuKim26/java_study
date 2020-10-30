package chapter07;

public class TestEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Kim");
		String s2 = new String("Kim");
		
		//문자열 클래스의 객체라 서로 같은 객체를 가리키냐를 기준으로 판단.
		//서로 다른 문자열을 가리키기에 else문 들어감
		if(s1 == s2)
			System.out.println("동일한 문자열입니다.");
		else
			System.out.println("동일한 문자열이 아닙니다.");
		
		//equal()함수로 우리가 생각한 것과 같은 판단을 내림. 
		//if문 들어감
		if(s1.equals(s2) == true)
			System.out.println("동일한 문자열입니다.");
		else
			System.out.println("동일한 문자열이 아닙니다.");
	}

}
