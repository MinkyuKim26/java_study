package chapter07;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Wrapper : 기초 자료형들을 객체로 포장
		
		//값 저장하기
		Integer obj1 =  new Integer(10);
		Double obj2 = new Double(3.141592);
		
		//값 꺼내기
		int value1 = obj1.intValue();
		double value2 = obj2.doubleValue();//값 꺼내기 
		
		//기초 자료형 -> 문자열 변환
		String s1 = Integer.toString(10);
		String s2 = Integer.toString(10000);
		//String s3 = Float.toString(3.14); 왜 에러인지 모르겠다. 왜지?
		String s4 = Double.toString(3.141592);
		
		//문자열 -> 기초 자료형 변환
		int i = Integer.parseInt("10");
		long l = Long.parseLong("10000");
		float f = Float.parseFloat("3.14");
		double d = Double.parseDouble("3.141592");
		
		//오토 박싱 & 오토 언박싱
		Integer box;
		box = 10; //정수를 자동으로 Integer객체로 포장(boxing)
		System.out.println(box + 1); //box는 자동으로 int형으로 변환(unboxing)
	}

}
