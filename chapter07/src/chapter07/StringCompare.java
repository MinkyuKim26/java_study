package chapter07;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Apple";
		String s2 = "Apple";
		String s3 = new String("Apple");
		
		//둘다 true 출력
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		//true, false출력
		System.out.println(s1==s2); //같은 객체 가리킴
		System.out.println(s1==s3); //다른 객체 가리킴
	}

}
