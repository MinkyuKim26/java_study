package chapter07;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//생성 원칙
		String s1 = new String("java");
		String s2 = new String("java");
		
		//이렇게도 생성 가능
		String s3 = "java";
		String s4 = "java";
		
		int size = s3.length();//문자열 길이 반환
		System.out.println(size);
	}

}
